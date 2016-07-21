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

/**
 *
 * @author wadeowen
 */
public class Main {
    
    
    public static void main(String[] args){
        File archivo = null;
        Scanner sc;
        Calculadora calc = new Calculadora("");;

        try(BufferedReader br = new BufferedReader(new FileReader("/home/wadeowen/NetBeansProjects/HojaDeTrabajo#2-Stacks-Estructuras/build/classes/StacksPackage/expresion.txt"))) {
            String line = br.readLine();
            calc = new Calculadora(line);
        } catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println(calc.getResultado());
        System.out.println(calc.getInfix());
        
        calc.infixToPostfix();
        System.out.println(calc.getResultado());

    }
    
}
