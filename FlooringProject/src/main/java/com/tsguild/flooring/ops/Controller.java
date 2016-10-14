/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.ops;

import com.tsguild.flooring.ui.ConsoleIO;
import com.tsguild.flooring.dao.*;
import com.tsguild.flooring.dto.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;
import java.util.Collection;

/**
 *
 * @author apprentice
 */
public class Controller {

    ConsoleIO console = new ConsoleIO();
    OrderDaoImpl dao = new OrderDaoImpl();
    ProductDaoImpl pdao = new ProductDaoImpl();
    TaxesDaoImpl tdao = new TaxesDaoImpl();

    public void run() throws IOException, ParseException {
        boolean runMenu = true;
        pdao.loadFromFile();
        tdao.LoadFromFile();

        int userChoice;
        while (runMenu) {
            userChoice = startupMenu();
            switch (userChoice) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    editMenu();
                    break;
                case 4:
                    removeMenu();
                    break;
                case 5:
                    saveWork();
                    break;
                case 6:
                    runMenu = false;
                    break;
                default:
                    break;
            }

        }
    }

    private int startupMenu() {
        console.print("Flooring Mastery");
        console.print("Select from the options below.");
        console.print("1.  Display all orders on a given date.");
        console.print("2.  Add a new order.");
        console.print("3.  Edit an existing order.");
        console.print("4.  Remove an existing order.");
        console.print("5.  Save current work.");
        console.print("6.  Exit the database.");
        int userChoice = console.readInt("Your selection", 1, 6);
        return userChoice;
    }

    private void displayMenu() throws IOException {
        String reqDate = console.readString("Enter a date to search (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(reqDate)) {
            console.print("That date is invalid.  Please enter another date.");
            reqDate = console.readString("Enter a date to search (mm/dd/yyyy), including leading zeroes:  ");
        }
        String fileIntro = reqDate.substring(0, 2) + reqDate.substring(3, 5) + reqDate.substring(6);
        Collection<Order> ordersThatDate = dao.displayOrders(fileIntro);

        for (Order o : ordersThatDate) {
            console.print(o.getCustomerName() + "  " + o.getOrderNumber() + " "
                    + o.getStateAbbrev() + " " + o.getProductType() + " "
                    + o.getSquareFT() + " " + o.getTotalAmt());
        }
    }

    private void addMenu() throws IOException {
        String addDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(addDate)) {
            console.print("That date is invalid.  Please enter another date.");
            addDate = console.readString("Enter a date to search (mm/dd/yyyy), including leading zeroes:  ");
        }
        String fileIntro = addDate.substring(0, 2) + addDate.substring(3, 5) + addDate.substring(6);

        int orderNum = console.readInt("Enter the order number:");
        String custName = console.readString("Enter the name of the customer:  ");
        String stateAbbrev = console.readString("Enter the two-letter state abbreviation for the customer:  ");

        boolean stateCont = true;
        while (stateCont) {
            while (!tdao.doesStateExist(stateAbbrev)) {
                console.print("That abbreviation does not refer to a state.");
                stateAbbrev = console.readString("Enter the two-letter state abbreviation for the customer:  ");
            }
            if (tdao.isStateListed(stateAbbrev)) {
                stateCont = false;
            } else {
                int stateChoice = console.readInt("That state is not listed in the tax files.  Enter (0) to proceed with no tax rate or (1) to re-enter the state.", 0, 1);
                if (stateChoice == 0) {
                    stateCont = false;
                }
            }
        }

        String productType = console.readString("Enter the product type for the customer:  ");
        while (!pdao.typeIncluded(productType)) {
            console.print("That product type is not included in our files.  Please make another selection.");
            productType = console.readString("Enter the product type for the customer:  ");
        }
        double sqFt = console.readDouble("Enter the square feet of flooring for the order (max 10,000 sq ft):  ", 1, 10000);

        Order newOrder = new Order();
        newOrder.setCustomerName(custName);
        newOrder.setOrderNumber(orderNum);
        newOrder.setProductType(productType);
        newOrder.setStateAbbrev(stateAbbrev);
        newOrder.setSquareFT(sqFt);

        newOrder.setTaxRate(tdao.getTaxRate(stateAbbrev));
        newOrder.setMaterialCostPerSqFt(pdao.getMaterialCost(productType));
        newOrder.setLaborCostPerSqFt(pdao.getLaborCost(productType));

        newOrder.setLaborCost(sqFt * newOrder.getLaborCostPerSqFt());
        newOrder.setMaterialCost(sqFt * newOrder.getMaterialCostPerSqFt());
        newOrder.setCompTax(sqFt * newOrder.getTaxRate());
        newOrder.setTotalAmt(newOrder.getLaborCost() + newOrder.getMaterialCost() + newOrder.getCompTax());

        dao.addOrders(fileIntro, newOrder);
    }

    private void removeMenu() throws IOException {
        String remDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(remDate)) {
            console.print("That date is invalid.  Please enter another date.");
            remDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        }
        String orderNum = console.readString("Enter the order number that you would like to delete.");
        String fileIntro = remDate.substring(0, 2) + remDate.substring(3, 5) + remDate.substring(6);
        dao.removeOrder(remDate, fileIntro, orderNum);
    }

    private void editMenu() throws IOException {
        boolean changeDate = false;
        String editDate = console.readString("Enter a date for the order you need to change (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(editDate)) {
            console.print("That date is invalid.  Please enter another date.");
            editDate = console.readString("Enter a date for the order (mm/dd/yyyy), including leading zeroes:  ");
        }
        String orderNum = console.readString("Enter the order number that you would like to delete.");
        String fileIntro = editDate.substring(0, 2) + editDate.substring(3, 5) + editDate.substring(6);

        Order editOrder = dao.retreiveEditOrder(editDate, fileIntro, orderNum);

        String newDate = console.readString("If the order date needs to be changed, enter the new date(mm/dd/yyyy).  Otherwise, hit ENTER:");
        while (!newDate.isEmpty() && !isDateValid(newDate)) {
            newDate = console.readString("That date is invalid.  If the order date needs to be changed, enter the new date(mm/dd/yyyy).  Otherwise, hit ENTER:");
        }
        if (!newDate.equals(editDate)) {
            changeDate = true;
        }
        
        Order correctedOrder = new Order();
        console.print("Enter new values or press ENTER to keep the old value.");

        String stringOrder = console.readString("Order Number (" + editOrder.getOrderNumber() + "):  ");
        String custName = console.readString("Customer name (" + editOrder.getCustomerName() + "):  ");
        String stateAbbrev = console.readString("State Abbreviation(" + editOrder.getStateAbbrev() + "):  ");
        String StrtaxRate = console.readString("Tax rate (as a percentage):  " + editOrder.getTaxRate() + "):  ");
        String prodType = console.readString("Product Type (" + editOrder.getProductType() + "):  ");
        String StrsqFt = console.readString("Square footage of the order +(" + editOrder.getSquareFT() + "):  ");
        String StrmatCost = console.readString("Material Cost per square foot (" + editOrder.getMaterialCostPerSqFt() + "):");
        String StrlabCost = console.readString("Labor Cost per square foot (" + editOrder.getLaborCostPerSqFt() + "):");
        String Strmat = console.readString("Cost of material (" + editOrder.getMaterialCost() + "):");
        String Strlab = console.readString("Cost of labor (" + editOrder.getLaborCost() + "):");
        String Strtax = console.readString("Tax (" + editOrder.getCompTax() + "):");
        String Strtotal = console.readString("Total Cost of Order (" + editOrder.getLaborCost() + "):");

        updateOrderNumber(editOrder, correctedOrder, stringOrder);
        updateCustName(editOrder, correctedOrder, custName);
        updateStateAbbrev(editOrder, correctedOrder, stateAbbrev);
        updateTaxRate(editOrder, correctedOrder, StrtaxRate);
        updateProductType(editOrder, correctedOrder, prodType);
        updateSqFt(editOrder, correctedOrder, StrsqFt);
        updateMatCost(editOrder, correctedOrder, StrmatCost);
        updateLabCost(editOrder, correctedOrder, StrlabCost);
        updateMat(editOrder, correctedOrder, Strmat);
        updateLab(editOrder, correctedOrder, Strlab);
        updateTax(editOrder, correctedOrder, Strtax);
        updateTotal(editOrder, correctedOrder, Strtotal);

    }

    public boolean isDateValid(String str) {
        if (str.length() != 10) {
            return false;
        }
        String mm = str.substring(0, 2);
        String dd = str.substring(3, 5);
        String yyyy = str.substring(6);
        int m, d, y;

        try {
            m = Integer.parseInt(mm);
            d = Integer.parseInt(dd);
            y = Integer.parseInt(yyyy);
        } catch (NumberFormatException e) {
            return false;
        }
        if (y < 1901 || y > 2099) {
            return false;
        }
        if (m > 12) {
            return false;
        }
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 31) {
            return false;
        }
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
            return false;
        }
        if (m == 2 && y % 4 == 0 && d > 29) {
            return false;
        }
        return !(m == 2 && d > 28);

    }

    private void saveWork() throws FileNotFoundException {
        dao.saveAllChanges();
    }

    private void updateOrderNumber(Order editOrder, Order corrOrder, String strOrder) {
        if (strOrder.isEmpty()) {
            corrOrder.setOrderNumber(editOrder.getOrderNumber());
        } else {
            try {
                int orderNumber = Integer.parseInt(strOrder);
                corrOrder.setOrderNumber(orderNumber);

            } catch (NumberFormatException e) {
                console.print("Order number must be an integer.");
                int orderNumber = console.readInt("Enter a valid order number or 0 to keep current value.", 0, 1000000);
                if (orderNumber == 0) {
                    corrOrder.setOrderNumber(editOrder.getOrderNumber());
                } else {
                    corrOrder.setOrderNumber(orderNumber);
                }

            }
        }
    }

    private void updateCustName(Order editOrder, Order corrOrder, String strName) {
        if (strName.isEmpty()) {
            corrOrder.setCustomerName(editOrder.getCustomerName());
        } else {
            corrOrder.setCustomerName(strName);
        }

    }

    private void updateStateAbbrev(Order editOrder, Order corrOrder, String stateAbb) {
        if (stateAbb.isEmpty()) {
            corrOrder.setStateAbbrev(editOrder.getStateAbbrev());
        } else {
            do {
                console.print("There is no state with that abbreviation.");
                stateAbb = console.readString("Enter the state of the order or ENTER to keep old value:");
            } while (!tdao.doesStateExist(stateAbb) && !stateAbb.isEmpty());

            if (stateAbb.isEmpty()) {
                corrOrder.setStateAbbrev(editOrder.getStateAbbrev());
            } else {
                corrOrder.setStateAbbrev(stateAbb);
            }

        }

    }

    private void updateTaxRate(Order editOrder, Order corrOrder, String strtaxRate) {
        if (strtaxRate.isEmpty()) {
            corrOrder.setTaxRate(editOrder.getTaxRate());
        } else {
            try {
                double temp = Double.parseDouble(strtaxRate);
                if (temp < 0 || temp > 100) {
                    corrOrder.setTaxRate(temp);
                } else {
                    console.print("The value input is not acceptable as a tax rate.");
                    temp = console.readDouble("Enter the tax rate for the order or -1 to keep the old value", -1, 100);
                    if (temp == -1) {
                        corrOrder.setTaxRate(editOrder.getTaxRate());
                    } else {
                        corrOrder.setTaxRate(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable as a tax rate.");
                double temp = console.readDouble("Enter the tax rate for the order or -1 to keep the old value", -1, 100);
                if (temp == -1) {
                    corrOrder.setTaxRate(editOrder.getTaxRate());
                } else {
                    corrOrder.setTaxRate(temp);
                }

            }
        }
    }

    private void updateProductType(Order editOrder, Order corrOrder, String strProdType) {
        if (strProdType.isEmpty()) {
            corrOrder.setProductType(editOrder.getProductType());
        } else {
            corrOrder.setProductType(strProdType);
        }

    }

    private void updateSqFt(Order editOrder, Order corrOrder, String strSqFt) {
        if (strSqFt.isEmpty()) {
            corrOrder.setSquareFT(editOrder.getSquareFT());
        } else {
            try {
                double temp = Double.parseDouble(strSqFt);
                if (temp < 0 || temp > 10000) {
                    corrOrder.setSquareFT(temp);
                } else {
                    console.print("The value input is not acceptable as a for square footage.");
                    temp = console.readDouble("Enter the new square footage (max, 10000) for the order or -1 to keep the old value", -1, 10000);
                    if (temp == -1) {
                        corrOrder.setSquareFT(editOrder.getSquareFT());
                    } else {
                        corrOrder.setSquareFT(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable as a for square footage.");
                double temp = console.readDouble("Enter the new square footage (max, 10000) for the order or -1 to keep the old value", -1, 10000);
                if (temp == -1) {
                    corrOrder.setSquareFT(editOrder.getSquareFT());
                } else {
                    corrOrder.setSquareFT(temp);
                }

            }
        }
    }

    private void updateMatCost(Order editOrder, Order corrOrder, String strmatCost) {
        if (strmatCost.isEmpty()) {
            corrOrder.setMaterialCostPerSqFt(editOrder.getMaterialCostPerSqFt());
        } else {
            try {
                double temp = Double.parseDouble(strmatCost);
                if (temp < 0 || temp > 10000) {
                    corrOrder.setMaterialCostPerSqFt(temp);
                } else {
                    console.print("The value input is not acceptable as a for material cost per square foot.");
                    temp = console.readDouble("Enter the material cost per square foot (max, 10000) for the order or -1 to keep the old value", -1, 10000);
                    if (temp == -1) {
                        corrOrder.setMaterialCostPerSqFt(editOrder.getMaterialCostPerSqFt());
                    } else {
                        corrOrder.setMaterialCostPerSqFt(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable as a for material cost per square foot.");
                double temp = console.readDouble("Enter the material cost per square foot (max, 10000) for the order or -1 to keep the old value", -1, 10000);
                if (temp == -1) {
                    corrOrder.setMaterialCostPerSqFt(editOrder.getSquareFT());
                } else {
                    corrOrder.setMaterialCostPerSqFt(temp);
                }

            }
        }
    }

    private void updateLabCost(Order editOrder, Order corrOrder, String strlabCost) {
        if (strlabCost.isEmpty()) {
            corrOrder.setLaborCostPerSqFt(editOrder.getLaborCostPerSqFt());
        } else {
            try {
                double temp = Double.parseDouble(strlabCost);
                if (temp < 0 || temp > 10000) {
                    corrOrder.setSquareFT(temp);
                } else {
                    console.print("The value input is not acceptable as a for labor cost per square foot.");
                    temp = console.readDouble("Enter the labor cost per square foot (max, 10000) for the order or -1 to keep the old value", -1, 10000);
                    if (temp == -1) {
                        corrOrder.setLaborCostPerSqFt(editOrder.getLaborCostPerSqFt());
                    } else {
                        corrOrder.setLaborCostPerSqFt(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable as a for labor cost per square foot.");
                double temp = console.readDouble("Enter the labor cost per square foot (max, 10000) for the order or -1 to keep the old value", -1, 10000);
                if (temp == -1) {
                    corrOrder.setLaborCostPerSqFt(editOrder.getLaborCostPerSqFt());
                } else {
                    corrOrder.setLaborCostPerSqFt(temp);
                }

            }
        }
    }

    private void updateMat(Order editOrder, Order corrOrder, String strmat) {
        if (strmat.isEmpty()) {
            corrOrder.setMaterialCost(editOrder.getMaterialCost());
        } else {
            try {
                double temp = Double.parseDouble(strmat);
                if (temp < 0 || temp > 1e8) {
                    corrOrder.setMaterialCost(temp);
                } else {
                    console.print("The value input is not acceptable for total material cost.");
                    temp = console.readDouble("Enter the total material cost(max, 10000000) for the order or -1 to keep the old value", -1, 10000000);
                    if (temp == -1) {
                        corrOrder.setMaterialCost(editOrder.getMaterialCost());
                    } else {
                        corrOrder.setMaterialCost(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable for total material cost.");
                double temp = console.readDouble("Enter the total material cost(max, 10000000) for the order or -1 to keep the old value", -1, 10000000);
                if (temp == -1) {
                    corrOrder.setMaterialCost(editOrder.getMaterialCost());
                } else {
                    corrOrder.setMaterialCost(temp);
                }

            }
        }
    }

    private void updateLab(Order editOrder, Order corrOrder, String strlab) {
        if (strlab.isEmpty()) {
            corrOrder.setLaborCost(editOrder.getLaborCost());
        } else {
            try {
                double temp = Double.parseDouble(strlab);
                if (temp < 0 || temp > 1e8) {
                    corrOrder.setLaborCost(temp);
                } else {
                    console.print("The value input is not acceptable for total labor cost.");
                    temp = console.readDouble("Enter the total labor cost(max, 10000000) for the order or -1 to keep the old value", -1, 10000000);
                    if (temp == -1) {
                        corrOrder.setLaborCost(editOrder.getLaborCost());
                    } else {
                        corrOrder.setLaborCost(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable for total labor cost.");
                double temp = console.readDouble("Enter the total labor cost(max, 10000000) for the order or -1 to keep the old value", -1, 10000000);
                if (temp == -1) {
                    corrOrder.setLaborCost(editOrder.getLaborCost());
                } else {
                    corrOrder.setLaborCost(temp);
                }

            }
        }
    }

    private void updateTax(Order editOrder, Order corrOrder, String strtax) {
        if (strtax.isEmpty()) {
            corrOrder.setCompTax(editOrder.getTaxRate());
        } else {
            try {
                double temp = Double.parseDouble(strtax);
                if (temp < 0 || temp > 1e8) {
                    corrOrder.setCompTax(temp);
                } else {
                    console.print("The value input is not acceptable for total tax..");
                    temp = console.readDouble("Enter the total tax for the order or -1 to keep the old value", -1, 1000000000);
                    if (temp == -1) {
                        corrOrder.setCompTax(editOrder.getCompTax());
                    } else {
                        corrOrder.setCompTax(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable for total tax..");
                double temp = console.readDouble("Enter the total tax for the order or -1 to keep the old value", -1, 1000000000);
                if (temp == -1) {
                    corrOrder.setCompTax(editOrder.getCompTax());
                } else {
                    corrOrder.setCompTax(temp);
                }

            }
        }
    }

    private void updateTotal(Order editOrder, Order corrOrder, String strtotal) {
        if (strtotal.isEmpty()) {
            corrOrder.setTotalAmt(editOrder.getTotalAmt());
        } else {
            try {
                double temp = Double.parseDouble(strtotal);
                if (temp < 0 || temp > 1e8) {
                    corrOrder.setTotalAmt(temp);
                } else {
                    console.print("The value input is not acceptable for total amount.");
                    temp = console.readDouble("Enter the total tax for total amount or -1 to keep the old value", -1, 1000000000);
                    if (temp == -1) {
                        corrOrder.setTotalAmt(editOrder.getTotalAmt());
                    } else {
                        corrOrder.setTotalAmt(temp);
                    }

                }
            } catch (NumberFormatException e) {
                console.print("The value input is not acceptable for total amount.");
                double temp = console.readDouble("Enter the total tax for total amount or -1 to keep the old value", -1, 1000000000);
                if (temp == -1) {
                    corrOrder.setTotalAmt(editOrder.getTotalAmt());
                } else {
                    corrOrder.setTotalAmt(temp);
                }

            }
        }
    }
}
