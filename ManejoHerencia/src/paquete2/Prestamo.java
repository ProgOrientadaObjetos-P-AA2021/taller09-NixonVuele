/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes beneficiario - de tipo Persona tiempo de préstamo en meses
 * ciudad del préstamo (de tipo String)
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudad = ciudad;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("==========Prestamo del cliente:===="
                + "======\n"
                + "   > Nombre: %s\n"
                + "   > Apellido: %s\n"
                + "   > Tiempo de prestamo: %d meses\n"
                + "   > Ciudad del préstamo: %s\n",
                beneficiario.getNombre(),
                beneficiario.getApellido(),
                getTiempoPrestamo(),
                getCiudad());

        return cadena;
    }
}
