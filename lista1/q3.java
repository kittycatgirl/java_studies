/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q3 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Informe seu saldo médio");

int saldo = s.nextInt();

if (saldo >= 0 && saldo <= 500) {

System.out.println(0);

}

else

if (saldo >= 501 && saldo <= 1000) {

System.out.println(30 / 100 * saldo + saldo);

}

else

if (saldo >= 1001 && saldo <= 3000) {

System.out.println(40/ 100 * saldo + saldo);

}

else

if (saldo >= 3001) {

System.out.println(50/ 100 * saldo + saldo);

}

}

}
