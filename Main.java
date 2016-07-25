/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksPackage;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author wadeowen
 */
public class Main {
    
    
    public static void main(String[] args){
        URL location = Main.class.getResource("Main.class");
        String dir = location.getPath();
        Calculadora calc = new Calculadora("");;

        try(BufferedReader buff = new BufferedReader(new FileReader(dir.substring(0,dir.indexOf("Main"))+"/expresion.txt"))) {
            
            String linea ;
            
            while ((linea = buff.readLine()) != null){
                calc = new Calculadora(linea);
                calc.infixToPostfix();
                System.out.println(calc.getInfix());
                System.out.println("El resultado es: "+calc.getResultado());
            }
            
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
