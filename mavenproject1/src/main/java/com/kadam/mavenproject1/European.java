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
public class European implements Human{
    
    private int age;

    @Override
    public void info() {
        System.out.println("I am the human - European");
    }
    
    public void doSmth() {
        System.out.println("working european.");
    }

    @Override
    public int getAge() {
        return this.age;
    }
    
    
}
