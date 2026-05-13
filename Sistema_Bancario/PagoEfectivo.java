public class PagoEfectivo implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago en Efectivo: Se ha recibido el pago de $" + monto + " en ventanilla.");
        } else {
            System.out.println("El monto en efectivo no puede ser negativo.");
        }
    }
}