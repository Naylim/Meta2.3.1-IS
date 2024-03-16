package pruebadeconcepto;

public class Pelicula {
    String nombre, descripcion, genero;
    double duracion;
    int votos, id;
    
    public Pelicula(int id, String nombre, String descripcion, String genero, double duracion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "ID:" + id + ", NOMBRE:" + nombre + ", DESCRIPCION:" + descripcion + ", GENERO:" + genero + ", DURACION:" + duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
