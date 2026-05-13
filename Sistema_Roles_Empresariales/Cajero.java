public class Cajero implements Autenticable, Gestionable {
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return usuario.equals("cajero01") && clave.equals("caja123");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero: Procesando transacciones y registro de ventas.");
    }
}