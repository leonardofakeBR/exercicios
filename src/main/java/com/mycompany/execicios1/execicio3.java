/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.execicios1;
import java.util.Scanner;


/**
 *
 * @author leonardo.35903
 */
public class execicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   int num1, num2, num3, resultado;
      System.out.print("digite um numero: ");
      num1 = scanner.nextInt();
      System.out.print("digite outro numero: ");
      num2 = scanner.nextInt();
      System.out.print("digite outro numero: ");
      num3 = scanner.nextInt();
      resultado = num1 * num2 * num3;
      System.out.print("a multplicação dos numeros é " + resultado);
    }
    
}
