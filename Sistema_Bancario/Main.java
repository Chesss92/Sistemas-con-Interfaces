public class Main {
    public static void main(String[] args) {
        Pagable efectivo = new PagoEfectivo();
        Pagable tarjeta = new PagoTarjeta();
        Pagable transferencia = new Transferencia();

        System.out.println("=== Pagos Bancarios===");

        efectivo.procesarPago(50.0);
        tarjeta.procesarPago(120.50);
        transferencia.procesarPago(1500.0);

        System.out.println("\n=== Validacion negativ ===");

        //monto invalido
        tarjeta.procesarPago(-10.0);
    }
}