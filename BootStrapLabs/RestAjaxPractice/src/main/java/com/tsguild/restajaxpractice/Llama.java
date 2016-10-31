/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.restajaxpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class Llama {
    
    private String name;
    private List<String> pack = new ArrayList<>();
    
    public Llama(){};
    
    public Llama(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public List<String> getPack(){
        return this.pack;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPack(List<String> pack){
        this.pack = pack;
    }
    
}
