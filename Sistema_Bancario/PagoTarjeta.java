public class PagoTarjeta implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Tarjeta: Procesando transacción de $" + monto);
        } else {
            System.out.println("El Monto de tarjeta es inválido ($" + monto + ").");
        }
    }
}