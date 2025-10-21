public class Pelicula {
    private int id;
    private String titulo;
    private int anho;
    private String director;
    private String genero;

    public Pelicula(int id, String titulo, int anho, String director, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.anho = anho;
        this.director = director;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Título: '" + titulo + '\'' +
                ", Año: " + anho +
                ", Director: '" + director + '\'' +
                ", Género: '" + genero + '\'';
    }

}
