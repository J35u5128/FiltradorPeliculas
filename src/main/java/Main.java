import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        System.out.println("Tenemos una lista de peliculas recomendadas para ti.");
        System.out.println("¿Prefieres filtrar por año o por titulo? (año/titulo)");
        opcion = sc.nextLine();
        if (opcion.equals("año")) {
            int anho;
            System.out.println("Introduzca el año:");
            anho = sc.nextInt();
            ServicioFiltradoPeliculas.filtrarPorAnho(anho);
            System.out.println("Resultado.csv creado con éxito.");
        } else if (opcion.equals("titulo")) {
            String titulo;
            System.out.println("Introduzca el título:");
            titulo = sc.nextLine();
            ServicioFiltradoPeliculas.filtrarPorTitulo(titulo);
            System.out.println("Resultado.csv creado con éxito.");
        }else System.out.println("Opción no valida");
    }
}
