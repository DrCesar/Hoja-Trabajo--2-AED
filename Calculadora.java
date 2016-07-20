/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksPackage;

/**
 *
 * @author wadeowen
 */
public class Calculadora {
    

    private StackNum numbers;
    private String infix;
    private String resultado;
    
    
    public Calculadora(String s){
        infix = "";
        numbers = new StackNum();
    }
    
    public void infixToPostfix(){
        int i = 0;
        
        while(i< infix.length()){
            switch(infix.charAt(i)){
                case ' ':
                case '(':
                case ')':
                    i++;
                    break;
                case '+':
                    numbers.push( numbers.pop() + numbers.pop() );
                    break;
                case '-':
                    numbers.push( -numbers.pop() + numbers.pop() );
                    break;
                case '*':
                    numbers.push( numbers.pop() * numbers.pop() );
                    break;
                case '/':
                    numbers.push( 1/numbers.pop() + numbers.pop() );
                    break;
                default:
                    numbers.push(Integer.parseInt( Character.toString( infix.charAt(i) ) ));
                    break;
            }
        }
        
        resultado = Integer.toString(numbers.pop());
    }
    
    public String getResultado(){
        return resultado;
    }
    
    
}
