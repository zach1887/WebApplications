/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachineproject.dto;

/**
 *
 * @author Jesse
 */
public class VendObject {
private int ctSnickers;    
private int ctTwix;    
private int ctReeses;    
private int ctCerts;    
private int ctGum;    

final private int PRICE_SNICKERS = 85;
final private int PRICE_TWIX = 75;
final private int PRICE_REESES = 70;
final private int PRICE_CERTS = 50;
final private int PRICE_GUM = 25;
public VendObject(){
}

    public VendObject(int ctSnickers, int ctTwix, int ctReeses, int ctCerts, int ctGum) {
        this.ctSnickers = ctSnickers;
        this.ctTwix = ctTwix;
        this.ctReeses = ctReeses;
        this.ctCerts = ctCerts;
        this.ctGum = ctGum;
    }

    public int getCtSnickers() {
        return ctSnickers;
    }

    public void setCtSnickers(int ctSnickers) {
        this.ctSnickers = ctSnickers;
    }

    public int getCtTwix() {
        return ctTwix;
    }

    public void setCtTwix(int ctTwix) {
        this.ctTwix = ctTwix;
    }

    public int getCtReeses() {
        return ctReeses;
    }

    public void setCtReeses(int ctReeses) {
        this.ctReeses = ctReeses;
    }

    public int getCtCerts() {
        return ctCerts;
    }

    public void setCtCerts(int ctCerts) {
        this.ctCerts = ctCerts;
    }

    public int getCtGum() {
        return ctGum;
    }

    public void setCtGum(int ctGum) {
        this.ctGum = ctGum;
    }

    public int getPRICE_SNICKERS() {
        return PRICE_SNICKERS;
    }

    public int getPRICE_TWIX() {
        return PRICE_TWIX;
    }

    public int getPRICE_REESES() {
        return PRICE_REESES;
    }

    public int getPRICE_CERTS() {
        return PRICE_CERTS;
    }

    public int getPRICE_GUM() {
        return PRICE_GUM;
    }


}
