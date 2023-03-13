package cuentas;
/**
 * Clase que representa una cuenta bancaria. Permite consultar el saldo, ingresar dinero y retirar dinero.
 *
 * @author Emma Varela Pet
 * @version 1.0
 * @since 10/03/2023
 * 
 */

public class CCuenta {

    // Campos privados para el nombre, cuenta y saldo de la cuenta 
    private String nombre;
    private String cuenta;
    private double saldo;

    /**
     * Constructor vacío para la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor para la clase CCuenta.
     *
     * @param nom nombre del titular de la cuenta
     * @param cue número de cuenta
     * @param sal saldo inicial de la cuenta
     * @param tipo tipo de cuenta 
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta bancaria.
     *
     * @param cantidad cantidad a ingresar en la cuenta
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta bancaria.
     *
     * @param cantidad cantidad a retirar de la cuenta
     * @throws Exception si la cantidad es negativa o si no hay suficiente saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     *
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta.
     *
     * @return saldo 
     */
    public double getSaldo() {
        return saldo;
    }
}
