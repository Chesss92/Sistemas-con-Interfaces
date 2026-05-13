public class ActaNotas implements Imprimible{
    private String carrera = "Desarrollo de Software";
    @Override
    public void imprimir() {
        System.out.println("\n==== Acta de Notas ====");
        System.out.println(" Carrera: " + carrera);
        System.out.println("Redes: 9,75 - Aprobado\nProgramacion: 9,33 - Aprobado\nSistemas Operativos: 8,75 - Aprobado");
    }
}
