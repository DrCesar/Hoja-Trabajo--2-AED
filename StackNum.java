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
public class StackNum implements iStackNum{
    
    private int sp;
    private int[] stack = new int[500];
    
    
    public StackNum(){
        sp = 0;
    }
    
    @Override
    public void push(int c){
        stack[sp] = c;
        sp++;
    }
    
    
    @Override
    public int pop(){
        sp--;
        return stack[sp];
    }
    
    
    @Override
    public int top(){
        return stack[sp-1];
    }
    
    @Override
    public boolean empty(){
        if(sp == 0){
            return true;
        } else{
            return false;
        }
    }
    
}
