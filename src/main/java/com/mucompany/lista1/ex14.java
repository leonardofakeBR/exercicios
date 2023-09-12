/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mucompany.lista1;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class ex14 {
    public static void main(String args[]){
        
        String texto;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite uma frase: ");
        texto = sc.nextLine().replace(" ", "").toLowerCase();
        
        char[] chars = new char[texto.length()];
        
        chars = texto.toCharArray();
        
        
        for(int i = 0; i < chars.length / 2; i++){
            
            if(chars[i] == chars[chars.length - 1 - i]){
            
            continue;
            
            }else{
            
            System.out.print("A frase não é um palindromo");
            System.exit(0);
            
            }
            
        }
        
        
        System.out.print("a frase é um palindromo");
    
    }
}
