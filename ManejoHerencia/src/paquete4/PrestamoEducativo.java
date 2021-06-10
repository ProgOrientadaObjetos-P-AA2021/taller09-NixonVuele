/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes nivel de estudio nombre de centro educativo valor de la
 * carrera valor mensual del pago del préstamo del valor de la carrera
 */
public class PrestamoEducativo extends Prestamo {

    String nivelStudio;
    String centroEducativo;
    double valorCarrera;
    double pagoMensual;

    public PrestamoEducativo(String nivelStudio, String centroEducativo,
            double valorCarrera, Persona beneficiario,
            int tiempoPrestamo, String ciudad) {
        super(beneficiario, tiempoPrestamo, ciudad);
        this.nivelStudio = nivelStudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    public void setNivelStudio(String nivelStudio) {
        this.nivelStudio = nivelStudio;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }
//carrera es igual al (valor de la carrera dividido para el número de meses) 
    //menos 10% del (resultado del valor de la carrera dividido para el número de meses)

    public void setPagoMensual() {
        this.pagoMensual = (valorCarrera / tiempoPrestamo)
                - ((10 * (valorCarrera / tiempoPrestamo)) / 100);
    }

    public String getNivelStudio() {
        return nivelStudio;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n==========Prestamo Educativo:===="
                + "======\n"
                + "   > Nivel de Estudios: %s\n"
                + "   > Centro Educativo: %s\n"
                + "   > Valor de la carrera: %.2f$\n"
                + "   > valor mensual a pagar: %.2f$",
                cadenaFinal,
                nivelStudio,
                centroEducativo,
                valorCarrera,
                pagoMensual);

        return cadenaFinal;
    }
}
