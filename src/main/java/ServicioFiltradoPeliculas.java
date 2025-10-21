import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServicioFiltradoPeliculas {
    static String rutaArchivo = "peliculas 1.csv";
    static String rutaSalida = "resultado.csv";
    static List<Pelicula> peliculas = new ArrayList<>();
    public static void filtrarPorAnho(int anho) {
        //implementación para filtrar por año
        List<Pelicula> peliculas = new ArrayList<>();
        try (BufferedReader lectorCSV = new BufferedReader(new FileReader(rutaArchivo));
             BufferedWriter escritorCSV = new BufferedWriter(new FileWriter(rutaSalida))) {

            String linea;
            while ((linea = lectorCSV.readLine()) != null) {
                String[] campos = linea.split(",");
                // Comprobamos que haya al menos 5 campos y que el año coincida con el parámetro
                if (campos.length >= 5 && Integer.parseInt(campos[2]) == anho) {
                    int id = Integer.parseInt(campos[0]);
                    String titulo = campos[1];
                    int anhoPelicula = Integer.parseInt(campos[2]);
                    String director = campos[3];
                    String genero = campos[4];
                    peliculas.add(new Pelicula(id, titulo, anhoPelicula, director, genero));
                }
            }

            // Escribir resultado filtrado
            escritorCSV.write("ID,Título,Año,Director,Género");
            escritorCSV.newLine();
            for (Pelicula p : peliculas) {
                escritorCSV.write(p.toString());
                escritorCSV.newLine();
            }
            System.out.println("Se encontraron " + peliculas.size() + " películas con el año " + anho + ".");

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }


    public static void filtrarPorTitulo(String titulo) {
        List<Pelicula> peliculas = new ArrayList<>();

        try (BufferedReader lectorCSV = new BufferedReader(new FileReader(rutaArchivo));
             BufferedWriter escritorCSV = new BufferedWriter(new FileWriter(rutaSalida))) {

            String linea;
            while ((linea = lectorCSV.readLine()) != null) {
                String[] campos = linea.split(",");
                // Comprobamos que haya al menos 5 campos y que el título coincida con el parámetro
                if (campos.length >= 5 && campos[1].equalsIgnoreCase(titulo)) {
                    int id = Integer.parseInt(campos[0]);
                    String tituloPelicula = campos[1];
                    int anhoPelicula = Integer.parseInt(campos[2]);
                    String director = campos[3];
                    String genero = campos[4];

                    peliculas.add(new Pelicula(id, tituloPelicula, anhoPelicula, director, genero));
                }
            }

            // Escribir resultado filtrado
            escritorCSV.write("ID,Título,Año,Director,Género");
            escritorCSV.newLine();
            for (Pelicula p : peliculas) {
                escritorCSV.write(p.toString());
                escritorCSV.newLine();
            }

            System.out.println("Se encontraron " + peliculas.size() + " películas con el título \"" + titulo + "\".");

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }


}
