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
public class ex7 {
    public static void main(String args[]){
        
    Scanner sc = new Scanner(System.in);
        int quantidade;
        
        
        
        System.out.print("digite a quantidade de numeros: ");
        quantidade = sc.nextInt();
        
        
        
        int[] nums1 = new int[quantidade];
        int[] nums2 = new int[quantidade];
        
        
        
        for(int i = 1; i <= quantidade; i++){
            
            System.out.print("digite o " + i + "° valor: ");
            nums1[i - 1] = sc.nextInt();
        
        }
        
        for(int i = 1; i <= quantidade; i++){
            
            System.out.print("digite o " + i + "° valor para a outra lista: ");
            nums2[i - 1] = sc.nextInt();
        
        }
        
        int[] numstotal = new int[nums1.length + nums2.length];
        
        for(int i = 0; i < quantidade; i++){
        
            numstotal[i] = nums1[i];
            
        }
        
        for(int i = quantidade; i < quantidade * 2; i++){
        
            numstotal[i] = nums2[i - quantidade];
            
        }
        
        System.out.print("a junção das duas lista é: ");
        
        for(int i = 0; i < quantidade * 2; i++ ){
        
            System.out.print(numstotal[i] + "; ");
            
        }
        
    }
    
}
