/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("COLOQUE PARA PESAR");
		 int kg = s.nextInt();
		 int di = kg - 500;
		 int mu = di * 4;
		 if (kg > 500)
			 System.out.println("A quantidade a mais de peso foi de" + " " + di + " " + "e terá de ser pago" + " " + mu);
			 else
			 System.out.println("Não há multa por excedente de peso");
		 }
}
