/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes; María Alejandra Paute Eras; Nixon Javier Vuele Irene
 *
 */
public class Ejecutor {

    /*
    Crear clase Ejecutora que permita crear:

    Generar un menú que permita al usuario decidir si desea ingresar datos por 
    teclado para un préstamo de tipo PrestamoAutomovil o PrestamoEducativo.
    Independiente del tipo de préstamo, se debe imprimir la representación del 
    objeto (toString)
    El proceso de ingreso de prestamos termina cuando el usuario lo decide.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int eleccionSalida = 1;
        boolean salida = true;
        do {
            System.out.printf("Que prestamo desea realizar:\n1) Prestamo "
                    + "Automovil\n2) Prestamo Educativo\n> ");
            int tipoPrestamo = entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Ingrese el nombre del Cliente:\n> ");
            String nombreClient = entrada.nextLine();
            System.out.printf("Ingrese el apellido del Cliente:\n> ");
            String apellidoClient = entrada.nextLine();
            System.out.printf("Ingrese el tiempo de préstamo en meses:\n> ");
            int tiempoMeses = entrada.nextInt();
            System.out.printf("Ingrese la ciudad del banco:\n> ");
            entrada.nextLine();
            String city = entrada.nextLine();
            Persona cliente = new Persona(nombreClient, apellidoClient);
            if (tipoPrestamo == 1) {
                System.out.printf("Ingrese el tipo de automovil:\n> ");
                String tipoAuto = entrada.nextLine();
                System.out.printf("Ingrese la marca del vehiculo:\n> ");
                String marcaVehi = entrada.nextLine();
                System.out.printf("Ingrese el costo de su Vehiculo:\n> ");
                Double valorVehi = entrada.nextDouble();
                PrestamoAutomovil prestamosAutoX = new PrestamoAutomovil(
                        tipoAuto, marcaVehi, cliente, valorVehi, tiempoMeses,
                        city);
                prestamosAutoX.setCiudad(city);
                prestamosAutoX.setPagoMensual();
                System.out.println(prestamosAutoX);
            } else {
                System.out.printf("Ingrese su nivel de estudios:\n> ");
                String nivelEstudio = entrada.nextLine();
                System.out.printf("Ingrese el nombre del centro Educativo:"
                        + "\n> ");
                String centroEducativo = entrada.nextLine();
                System.out.printf("Ingrese el costo de la carrera:\n> ");
                double valorCarrera = entrada.nextDouble();
                PrestamoEducativo prestamosEduX = new PrestamoEducativo(
                        nivelEstudio, centroEducativo, valorCarrera, cliente, 
                        tiempoMeses,
                        city);
                prestamosEduX.setCiudad(city);
                prestamosEduX.setPagoMensual();
                System.out.println(prestamosEduX);
            }

            System.out.printf("\nEliga lo opcion que desea realizar:"
                    + "\n1) Ingresar otro prestamo\n2) Salir del programa\n> ");
            entrada.nextLine();
            eleccionSalida = entrada.nextInt();
            System.out.println("");
            if (eleccionSalida == 1) {
                salida = true;
            } else {
                System.out.println("\u001B[34m====Gracias por preferirnos====");
                salida = false;
            }

        } while (salida);

    }
}
