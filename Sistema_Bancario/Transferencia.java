public class Transferencia implements Pagable {
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Transferencia Bancaria: Enviando $" + monto + " a la cuenta de XXXXX2345");
        } else {
            System.out.println("No se puede realizar una transferencia de negativa");
        }
    }
}