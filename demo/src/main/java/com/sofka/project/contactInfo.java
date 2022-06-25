package com.sofka.project;

import java.util.Scanner;

public class contactInfo {
    public static void main(String[] args) {

        String NombreUsuario;
        String Celular;
        String Edad;

        Scanner caputre = new Scanner(System.in);
        System.out.println("Escribe tu Nombre de Usuario");
        String nombreUsuario= caputre.nextLine();
        System.out.println("Escribe tu Edad");
        String edad = caputre.nextLine();
        System.out.println("Escribe tu Celular");
        String celular = caputre.nextLine();


        System.out.println("Bienvenido señor "+ nombreUsuario +", es un placer para nosotros contar con una persona de " + edad + " años.Próximamente nos comunicaremos con usted al numero " + celular + ".Feliz día");
    }
}
