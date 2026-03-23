
package com.mycompany.beecrowd1007;

import java.util.Scanner;
        
public class Beecrowd1007 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        
        int DIFERENCA = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
