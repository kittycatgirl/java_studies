/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q4 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Informe sua idade");

int idade = s.nextInt();

if (idade < 16)

System.out.println("Não eleitor");

else if (idade >= 16 && idade == 17 && idade > 65)

System.out.println("Eleitor facultativo");

else if (idade >= 18 && idade == 65)

System.out.println("Eleitor obrigatório");

}

}

