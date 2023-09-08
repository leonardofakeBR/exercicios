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
public class ex2 {
    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        int quantidade;
        float media;
        float soma;
        soma = 0;
        
        System.out.print("digite a quantidade de numeros para a media: ");
        quantidade = sc.nextInt();
        
        float[] nums = new float[quantidade]; 
        
        for(int i = 1; i <= quantidade; i++){
            
            System.out.print("digite o " + i + "° valor: ");
            nums[i - 1] = sc.nextFloat();
        
        }
        for(int i = 0; i < nums.length; i++){
        
            soma += nums[i];
            
        }
        media = soma / quantidade;
        System.out.print("a media é " + media);
    }
}
