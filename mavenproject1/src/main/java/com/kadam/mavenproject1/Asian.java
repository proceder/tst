/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kadam.mavenproject1;

/**
 *
 * @author kadam
 */
public class Asian implements Human{

    @Override
    public void info() {
        System.out.println("com.kadam.mavenproject1.Asian.info()");
    }

    @Override
    public int getAge() {
        return 25;
    }
    
    public String getBirthMonth() {
        return "July";
    }
    
}
