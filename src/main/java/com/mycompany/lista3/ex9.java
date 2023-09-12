/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class ex9 {
        public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int quantidade, elemento;
        
        
        System.out.print("digite a quantidade de numeros: ");
        quantidade = sc.nextInt();
        
        
        
        int[] nums1 = new int[quantidade];
        
        
        
        for(int i = 1; i <= quantidade; i++){
            
            System.out.print("digite o " + i + "° valor: ");
            nums1[i - 1] = sc.nextInt();
        
        }
        
        
        System.out.print("digite o elemento que você quer da lista: ");
        elemento = sc.nextInt();
        
        
        for(int i = 0; i < quantidade; i++){
        
            if(nums1[i] == elemento){
                
                System.out.print("o elemento " + elemento + " está na posição " + i);
                break;
                
            }else if(i + 1 == quantidade){
            
                System.out.print("o elemento não está na lista.");
                
            }
        }
            
}
}