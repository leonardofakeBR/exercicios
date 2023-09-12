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
public class ex8 {
    public static void main( String args[]){
    Scanner sc = new Scanner(System.in);
        int quantidade;
        boolean first = true;
        
        
        System.out.print("digite a quantidade de numeros: ");
        quantidade = sc.nextInt();
        
        
        
        int[] nums1 = new int[quantidade];
        int[] organizado = new int[quantidade];
        
        
        
        for(int i = 1; i <= quantidade; i++){
            
            System.out.print("digite o " + i + "° valor: ");
            nums1[i - 1] = sc.nextInt();
        
        }
        for(int i = 0; i < quantidade; i++){
        
            for(int i2 = i; i2 < quantidade; i2++){
                if(i == 0){
                    i++;
                    
                }
                if(nums1[i] > nums1[i2] && nums1[i2] != organizado[i - 1]){
                    organizado[i] = nums1[i2];
                    
                }/*else if(nums1[i] == nums1[i2] && i != i2){
                    organizado[i] = nums1[i2];
                    
                }*/
            if(first && i == 1){
                i--;
                first = false;
            }
            }
            
        }
        System.out.print("A lista organizada fica assim: ") ;
        for(int i = 0; i < quantidade; i++){
            
        System.out.print(organizado[i] + "; ");
        
        }
}  
}

