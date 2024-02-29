
package com.mycompany.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner teclado = new Scanner(System.in);
        
        int nm1,nm2,resultado;
        
        nm1 = teclado.nextInt();
        nm2 = teclado.nextInt();
      
        System.out.printf("digite um numero");
        nm1= teclado.nextInt();
        System.out.println("digite um numero");
        nm2 = teclado.nextInt();
        
        System.out.printf("resultado");
        resultado = + nm1 + nm2;        
        System.out.println(resultado);
      
        
        
        
        
        
        

    }
}
