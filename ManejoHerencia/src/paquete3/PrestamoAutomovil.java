/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes tipo de automóvil marca de automóvil garante1 tipo Persona
 * valor de automóvil valor mensual de pago préstamo automóvil
 */
public class PrestamoAutomovil extends Prestamo {

    String tipoAuto;
    String marcaAuto;
    Persona garante1;
    double valorAuto;
    double pagoMensual;

    public PrestamoAutomovil(String tipoAuto, String marcaAuto,
            Persona beneficiario, double valorAuto, int tiempoPrestamo,
            String ciudad, Persona garante1) {
        super(beneficiario, tiempoPrestamo, ciudad);
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }

    public void setPagoMensual() {
        //El valor mensual del pago del préstamo del automóvil es igual al valor del automóvil dividido para el número de meses.
        this.pagoMensual = valorAuto / tiempoPrestamo;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }
    //El método para establecer la ciudad del préstamo de tipo PrestamoAutomovil debe asignar el valor siempre en minúscula.

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase();
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n==========Prestamo del Automovil:===="
                + "======\n"
                + "   > Tipo de automóvil: %s\n"
                + "   > Marca de automóvil: %s\n"
                + "   > Nombre del Garante: %s\n"
                + "   > Apellido del Garante: %s\n"
                + "   > Valor del automóvil: %.2f$\n"
                + "   > valor mensual a pagar: %.2f$",
                cadenaFinal,
                tipoAuto,
                marcaAuto,
                garante1.getNombre(),
                garante1.getApellido(),
                valorAuto,
                pagoMensual);

        return cadenaFinal;
    }

}
