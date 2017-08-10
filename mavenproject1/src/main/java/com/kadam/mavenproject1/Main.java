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
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        
        Human european = new European(30);
        System.out.println("AGE of the human: " + european.getAge());
        
    }
    
}
