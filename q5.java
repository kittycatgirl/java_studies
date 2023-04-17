/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q5 {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Digite o número do prato: \n"

+ "1 - Vegetariano \n"

+ "2 - Peixe \n"

+ "3 - Frango \n"

+ "4 - Carne");

int pra = s.nextInt();

System.out.println("Digite o número da sobremesa: \n"

+ "1 - Abacaxi \n"

+ "2 - Sorvete Diet \n"

+ "3 - Mouse Diet \n"

+ "4 - Mousse de Chocolate");

int so= s.nextInt();

System.out.println("Digite o número da bebida: \n"

+ "1 - Chá \n"

+ "2 - Suco de Laranja \n"

+ "3 - Suco de Melão \n"

+ "4 - Refrigerante Diet");

int be = s.nextInt();

if (pra == 1) {

pra = 180;

} else if (pra == 2) {

pra = 230;

} else if (pra == 3) {

pra = 250;

} else if (pra == 4) {

pra = 350;

}

if (so == 1) {

so = 75;

} else if (so == 2) {

so = 110;

} else if (so == 3) {

so = 170;

} else if (so == 4) {

so = 200;

}

if (be == 1) {

be = 20;

} else if (be == 2) {

be = 70;

} else if (be == 3) {

be = 100;

} else if (be == 4) {

be = 65;

}

int soma = pra + so + be;

System.out.println(soma + " " + "cal");

}

}
