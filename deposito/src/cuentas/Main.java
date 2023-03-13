package cuentas;

/**
 * Clase principal que se encarga de crear y gestionar una cuenta bancaria.
 */
public class Main {
    
    /**
     * Método principal de la aplicación.
     * @param args
     */
    public static void main(String[] args) {
        // Crear una nueva cuenta con un saldo inicial de 2500
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Operar sobre la cuenta 
        operativa_cuenta(cuenta1, 0);
    }

    /**
     * Método que realiza operaciones sobre una cuenta bancaria.
     * 
     * @param cuenta1 cuenta bancaria con la que se opera
     * @param cantidad cantidad de dinero con el que operar (en este caso, no se utiliza)
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        // Obtener el saldo actual de la cuenta
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Retirar una cantidad de la cuenta
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        // Ingresar una cantidad en la cuenta
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
