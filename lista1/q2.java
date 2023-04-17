/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q2 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Informe seu peso");

int p = s.nextInt();

System.out.println("Informe sua altura");

int a = s.nextInt();

int imc = p / a ^2;

if (imc < 20)

System.out.println("Abaixo do peso");

else

if (imc >= 20 && imc <= 25)

System.out.println("Peso normal");

else

if (imc >= 26 && imc <= 30)

System.out.println("Sobre peso");

else

if (imc >= 31 && imc <= 40)

System.out.println("Obeso");

else

if (imc >= 41)

System.out.println("Obeso mórbido");

}

}
