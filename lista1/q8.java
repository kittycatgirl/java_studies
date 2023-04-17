/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q8 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Nota da primeira avaliação");

int n1 = s.nextInt();

System.out.println("Nota da segunda avaliação");

int n2 = s.nextInt();

System.out.println("Nota da terceira avaliação");

int n3 = s.nextInt();

System.out.println("Nota da quarta avaliação");

int n4 = s.nextInt();

int m = (n1 + n2 + n3 + n4) / 4;

System.out.println("Nota do exame");

int e = s.nextInt();

int soma = m + e;

if (m >= 7)

System.out.println("APROVADO COM MÉDIA DE VALOR" + " " + m);

else

if (soma >= 5)

System.out.println("APROVADO NO EXAME COM MÉDIA DE VALOR" + " " + soma);

else

System.out.println("REPROVADO COM MÉDIA DE VALOR" + " " + soma);

}

}