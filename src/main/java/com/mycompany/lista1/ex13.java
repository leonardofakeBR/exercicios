/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class ex13 {
    public static void main(String args[]){
    
        int cont = 0;
        String texto;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite uma frase: ");
        texto = sc.nextLine();
        
        char[] chars = new char[texto.length()];
        
        chars = texto.toCharArray();
    
        for(int i = 0; i < chars.length; i++){
        
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                
                cont++;
                
            }
            
        }
        
        System.out.print("a frase digitada tem " + cont + " vogais.");
    }
}
