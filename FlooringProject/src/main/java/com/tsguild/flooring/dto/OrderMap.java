/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dto;

import java.util.Collection;
import java.util.HashMap;
/**
 *
 * @author Jesse
 */
public class OrderMap {
    
    private String fileIntro;
    private Collection<Order> order;

    public OrderMap() {
    }

    public OrderMap(String fileIntro, Collection<Order> order) {
        this.fileIntro = fileIntro;
        this.order = order;
    }

    public String getFileIntro() {
        return fileIntro;
    }

    public void setFileIntro(String fileIntro) {
        this.fileIntro = fileIntro;
    }

    public Collection<Order> getOrder() {
        return order;
    }

    public void setOrder(Collection<Order> order) {
        this.order = order;
    }


    
    
}
