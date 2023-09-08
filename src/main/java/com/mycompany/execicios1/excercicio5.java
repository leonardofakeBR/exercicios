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
public class excercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   String nome, endereco, cpf;
      System.out.print("digite seu nome: ");
      nome = scanner.next();
      System.out.print("digite seu endereço: ");
      endereco = scanner.next();
      System.out.print("digite seu cpf: ");
      cpf = scanner.next();
      System.out.print("o seu nome é " + nome + "\no seu endereço é " + endereco + "\no seu cpf é " + cpf);
    }
    
}
