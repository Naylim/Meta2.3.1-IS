package pruebadeconcepto;

public class Votacion {
    Catalogo catalogo = new Catalogo();
    
    public void votar(int id){
        catalogo.peliculas.get(id-1).setVotos(catalogo.peliculas.get(id-1).getVotos()+1);
        System.out.println("HAZ VOTADO POR "+catalogo.peliculas.get(id-1).getNombre());
    }
    
    public void consultarVotacion(){
        for (int i = 0; i < catalogo.peliculas.size(); i++) {
            System.out.println(catalogo.peliculas.get(i).nombre + " tiene: " +
                catalogo.peliculas.get(i).getVotos()+ " votos");
        }
    }
}
