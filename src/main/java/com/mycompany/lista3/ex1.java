/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista3;

/**
 *
 * @author leonardo.35903
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[3];
        int soma = 0;
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        
        for(int i = 0; i < nums.length; i++){
        
            soma += nums[i];
            
        }
        
        System.out.print("a soma dos numeros é " + soma);
    }
    
}
