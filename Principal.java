/**
 * se importa las librerias de las listas
 * /
 * /** complejidad temporal: *0(1) de Tiempocontante
*/
import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        Libro libro100AnosSoledad = new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", 496);
        bibliotecaKonradLorenz.registrarLibro(libro100AnosSoledad);
        Libro libroElcodigoDaVinci = new Libro("ElcodigoDaVinci", "Dan Brown", 656);
        bibliotecaKonradLorenz.registrarLibro(libroElcodigoDaVinci);
        Libro milNovecientosOchentayCuatro = new Libro("1984", "GeorgeOrwell", 326);
        bibliotecaKonradLorenz.registrarLibro(milNovecientosOchentayCuatro);
        Libro elHobbit = new Libro("ElHobbit", "J.R.R.Tolkien", 310);
        bibliotecaKonradLorenz.registrarLibro(elHobbit);
        Libro laOdisea = new Libro("LaOdisea", "Homero", 448);
        bibliotecaKonradLorenz.registrarLibro(laOdisea);
    }
}
