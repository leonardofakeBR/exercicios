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
public class ex5 {
    public static void main(String args []){
    
        Scanner sc = new Scanner(System.in);
        int quantidade;
        
        
        
        System.out.print("digite a quantidade de numeros: ");
        quantidade = sc.nextInt();
        
        int[] nums = new int[quantidade]; 
        
        
        for(int i = 1; i <= quantidade; i++){
            
            System.out.print("digite o " + i + "° valor: ");
            nums[i - 1] = sc.nextInt();
        
        }
        for(int i = 0; i < quantidade; i++){
        
            if(nums[i] % 2 == 0){
            
            }
            
        }
        
    }
    
}
