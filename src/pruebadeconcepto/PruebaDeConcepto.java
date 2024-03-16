package pruebadeconcepto;

import java.util.Scanner;

public class PruebaDeConcepto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalogo c = new Catalogo();
        Votacion v= new Votacion();
        int op = 0;
        System.out.println("Bienvenido a Cinemex");
        System.out.println("Que desea hacer?");
        System.out.println("1. Ver catalogo.");
        System.out.println("2. Votar por una pelicula.");
        System.out.println("3. Consultar votaciones");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
        op = sc.nextInt();
        do{
            switch(op){
                case 1:
                    System.out.println("CATALOGO DE PELICULAS------------------------------");
                    c.mostrarCatalogo();
                    break;
                case 2:
                    System.out.println("VOTAR POR UNA PELICULA------------------------------");
                    System.out.print("Ingrese el id/numero de pelicula: ");
                    int aux = sc.nextInt();
                    v.votar(aux);
                    break;
                case 3:
                    System.out.println("RECUENTO DE VOTOS----------------------------------");
                    v.consultarVotacion();
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
            System.out.println("1. Ver catalogo.");
            System.out.println("2. Votar por una pelicula.");
            System.out.println("3. Consultar votaciones");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while(op != 4);
        System.out.println("Gracias por participar");
    }
}
