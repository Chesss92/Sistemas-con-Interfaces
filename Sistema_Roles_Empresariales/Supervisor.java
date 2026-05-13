public class Supervisor implements Autenticable, Reportable {
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        return usuario.equals("super") && clave.equals("super789");
    }

    @Override
    public void generarReporte() {
        System.out.println("Supervisor: Revisando métricas de rendimiento del personal.");
    }
}