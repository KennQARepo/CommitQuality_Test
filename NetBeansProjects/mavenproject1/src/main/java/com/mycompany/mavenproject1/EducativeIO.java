/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kenney
 */
public class EducativeIO {
    //class stringchallenge
    public static String sc(String text) {

        String answer;
        answer = text.trim();
        answer = answer.substring(0,6);
        answer = answer.toUpperCase();
        
        return answer; 
    }
}
