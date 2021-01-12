/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Enter a colour code: ");
        
        double waveLength = scan.nextDouble();
        
        if(waveLength >380&& waveLength <450) {
            System.out.println("The colour is violet");
        }
        else if (waveLength < 380) {
            System.out.println("The is not a part of the visible spectrum");   
        
        }
        else if(waveLength >450&& waveLength <495) {
            System.out.println("The colour is Blue");
       
        }
        else if(waveLength >495&& waveLength <570) {
            System.out.println("The colour is Green");
       
        }
        else if(waveLength >570&& waveLength <590) {
            System.out.println("The colour is Yellow");
            
        }
        else if(waveLength >590&& waveLength <620) {
            System.out.println("The colour is Orange");
            
        }
        else if(waveLength >620&& waveLength <750) {
            System.out.println("The colour is Red");
            
        }
        else  {
        System.out.println("The is not a part of the visible spectrum");  
    }
    
        }
   
    }
    

