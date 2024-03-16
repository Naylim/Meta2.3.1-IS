package pruebadeconcepto;

import java.util.ArrayList;

public class Catalogo {
    int numPeliculas;
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public Catalogo(){
        int id = peliculas.size()+1;
        agregarPelicula(id, "Shrek 2", "Los ogros no viven felices x siempre", "Animada", 1.45);
        id++;
        agregarPelicula(id, "Megamente", "VAto con frentota", "Animada", 1.56);
        id++;
        agregarPelicula(id, "Beti la fea", "Ay don armando", "Romance", 60.02);
        id++;
        agregarPelicula(id, "rec 3", "La peor de la saga rec", "Terror", 1.49);
        id++;
    }
    
    public void mostrarCatalogo(){
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(peliculas.get(i));
        }
    }
    
    public void agregarPelicula(int id, String nombre, String descripcion, String genero, double duracion){
        Pelicula pelicula1 = new Pelicula(id, nombre, descripcion, genero, duracion);        
        peliculas.add(pelicula1);
    }
    
    public void eliminarPelicula(int id){
        System.out.println(peliculas.get(id-1));
        peliculas.remove(id-1);
    }
    
    public void modificarPelicula(){}
}
