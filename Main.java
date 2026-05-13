public class Main{
    public static void main(String[] args) {
        Imprimible certificado = new Certificado();
        Imprimible acta = new ActaNotas();
        Imprimible horario = new HorarioAcademico();

        System.out.println("--- SISTEMA DE GESTIÓN ACADÉMICA ---");
        certificado.imprimir();
        acta.imprimir();
        horario.imprimir();
    }
}