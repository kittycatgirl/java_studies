/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Informe um valor");

        int v1 = s.nextInt();
        if (v1 % 10 == 0 || v1 % 5 == 0 || v1 % 2 == 0)
        System.out.println("Acertou!");
        else
        System.out.println("Errou :(");
}
}
