/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q6 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Informe um número");

int d = s.nextInt();

if (d == 1)

System.out.println("Domingo");

else if (d == 2)

System.out.println("Segunda");

else if (d == 3)

System.out.println("Terça");

else if (d == 4)

System.out.println("Quarta");

else if (d == 5)

System.out.println("Quinta");

else if (d == 6)

System.out.println("Sexta");

else if (d == 7)

System.out.println("Sábado");

else

System.out.println("Não existe dia da semana com esse número");

}

}
