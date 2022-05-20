package com.sofka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contactos {
    private String nombreBuscar;
    private String nombreEliminar;
    private String nombre0 = "";
    private String nombre1 = "";
    private String nombre2 = "";
    private String organizacion0 = "";
    private String organizacion1 = "";
    private String organizacion2 = "";
    private Integer telefono0 = 0;
    private Integer telefono1 = 0;
    private Integer telefono2 = 0;
    private Integer numeroContacto;

    public void Contactos(){
        menu();
    }

    private void menu() {
        Scanner input = new Scanner(System.in);
        Boolean salir = false;
        Integer opcion;

        while (!salir) {
            System.out.println("Taller 2-Contactos teléfonicos");
            System.out.println("1. Agregar contactos");
            System.out.println("2. Consultar contactos");
            System.out.println("3. Eliminar contactos");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingresa una de las opciones");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre completo:");

                        if(nombre0.equals("")){
                            nombre0 = text();
                        }else if (nombre1.equals("")){
                            nombre1 = text();
                        }else if (nombre2.equals("")){
                            nombre2 = text();
                        }

                        System.out.println("Número de contacto: ");
                        while ((numeroContacto == telefono0) || (numeroContacto == telefono1) || (numeroContacto == telefono2)){
                            System.out.println("Este número ya existe, ingresa otro: ");
                            numeroContacto = num();
                    }
                        if (telefono0 == 0){
                            telefono0 = num();
                        }else if (telefono1 == 0){
                            telefono1 = num();
                        }else if (telefono2 == 0){
                            telefono2 = num();
                        }

                        System.out.println("Ingresa organizacion o empresa: ");
                        if (organizacion0.equals("")){
                            organizacion0 = text();
                        }else if (organizacion1.equals("")){
                            organizacion1 = text();
                        }else if (organizacion2.equals("")){
                            organizacion2 = text();
                        }
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre del contacto: ");
                        nombreBuscar = text();

                        if (nombreBuscar.equals(nombre0)){
                            infoContacto(nombre0, telefono0, organizacion0);
                        }else if (nombreBuscar.equals(nombre1)){
                            infoContacto(nombre1, telefono1, organizacion1);
                        }else if (nombreBuscar.equals(nombre2)){
                            infoContacto(nombre2, telefono2, organizacion2);
                        }else {
                            System.out.println("No existe el nombre ingresado");
                        }
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n");
                        System.out.println("Ingresa el nombre del contacto a eliminar : ");
                        nombreEliminar = text();
                        while(!nombreEliminar.equals(nombre0) && !nombreEliminar.equals(nombre1) && !nombreEliminar.equals(nombre2)){
                            System.out.println("No existe el nombre ingresado, ingresa otro");
                            nombreEliminar = text();
                        }

                        if (nombreEliminar.equals(nombre0)){
                            nombre0 = "";
                            telefono0 = 0;
                            organizacion0 = "";
                            eliminarContacto(nombre0, telefono0, organizacion0);
                        }else if (nombreEliminar.equals(nombre1)){
                            nombre1 = "";
                            telefono1 = 0;
                            organizacion1 = "";
                            eliminarContacto(nombre1, telefono1, organizacion1);
                        }else if (nombreEliminar.equals(nombre2)){
                            nombre2 = "";
                            telefono2 = 0;
                            organizacion2 = "";
                            eliminarContacto(nombre2, telefono2, organizacion2);
                        }
                        System.out.println("\n");
                        break;
                    case 4:
                        salir = true;
                        break;

                    default:
                        System.out.println("\n");
                        System.out.println("Opción no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n");
                System.out.println("Debes insertar un número");
                input.next();
            }
        }
    }

    private static void infoContacto(String nombre, Integer telefono, String organizacion){
        System.out.println("Información del contacto:");
        imprimirInfoContacto(nombre, telefono, organizacion);
    }

    private static void imprimirInfoContacto(String nombre, Integer telefono, String organizacion){
        System.out.println("Nombre: "+nombre);
        System.out.println("Teléfono: "+telefono);
        System.out.println("Organización: "+organizacion);
    }

    private static void eliminarContacto(String nombre, Integer telefono, String organizacion){
        imprimirInfoContacto(nombre, telefono, organizacion);
        System.out.println("Eliminado");
    }

    private static String text() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static Integer num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
