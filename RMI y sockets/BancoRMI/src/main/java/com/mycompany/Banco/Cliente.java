package com.mycompany.Banco;
import java.rmi.Naming;
import java.util.Scanner;
public class Cliente {
       public static void main(String args[]){
	InterfazBancoCliente cotizar;
        Scanner sc =new Scanner(System.in);
        String cadena="";
        String Finicio="";
        String FFinal="";
        String FCotizar="";
	try {
	    cotizar=(InterfazBancoCliente)Naming.lookup("rmi://localhost/Cotizar");
            System.out.println("Introduce una fecha de Entrada Ej. 26-09-19");
            Finicio=sc.nextLine();
	    System.out.println();
	    System.out.println("Introduce una fecha de Salida Ej. 26-09-19");
            FFinal=sc.nextLine();
            System.out.println();
            System.out.println("Introduce una fecha de Cotizacion Ej. 26-09-19");
            FCotizar=sc.nextLine();
            System.out.println();
            System.out.println("El costo de su hospedaje en el hotel es de "+cotizar.Cotizar(Finicio, FFinal, FCotizar)+"Bs");
	}
	catch (Exception e){
	    e.printStackTrace();
	}
    } 
}