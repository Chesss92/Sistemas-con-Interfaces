public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBAS DE ACCESO POR ROL ---");

        // Ejemplo con Administrador
        Administrador admin = new Administrador();
        if (admin.iniciarSesion("admin", "admin2026")) {
            System.out.println("Acceso concedido al Administrador.");
            admin.gestionarDatos();
            admin.generarReporte();
        }

        System.out.println("\n--- PRUEBAS DE ACCESO CAJERO ---");
        Cajero cajero = new Cajero();
        if (cajero.iniciarSesion("cajero01", "error123")) {
            cajero.gestionarDatos();
        } else {
            System.out.println("Error de Cajero: Credenciales incorrectas.");
        }
    }
}