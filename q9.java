/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q9 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Informe o primeiro valor");

int v1 = s.nextInt();

System.out.println("Imforme o segundo valor");

int v2 = s.nextInt();

System.out.println("Informe o terceiro valor");

int v3 = s.nextInt();

System.out.println("Informe o quarto valor");

int v4 = s.nextInt();

System.out.println("Informe o quinto valor");

int v5 = s.nextInt();

int m = (v1 + v2 + v3 + v4 + v5) / 5;

if (v1 > m)

System.out.println(v1);

if (v2 > m)

System.out.println(v2);

if (v3 > m)

System.out.println(v3);

if (v4 > m)

System.out.println(v4);

if (v5 > m)

System.out.println(v5);

else

System.out.println("A média é maior que todos os valores");

}

}
