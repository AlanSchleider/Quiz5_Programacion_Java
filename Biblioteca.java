import java.util.LinkedList; /** se importa las librerias
 */
public class Biblioteca {
    public LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    /**Complejidadtemporal /* O(1) de Tiempoconstante
     *param libro
     */
    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    /**Complejidadlineal /* O(N) de Tiempolineal
     * param titulo
     * return
     */
    public Libro buscarLibro(String titulo){
        for (int i=0; i<librosDisponibles.size();i++){
            Libro libroBuscado = librosDisponibles.get(i);
            if (libroBuscado.getTitulo().equals(titulo)){
                return libroBuscado;
            }
        }
        return null;
    }

    /**Complejidadtemporal /* O(1) de Tiempoconstante
     * return
     */
    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }
}
