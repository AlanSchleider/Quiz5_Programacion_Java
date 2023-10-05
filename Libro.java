
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /** Complejidadtemporal /* O(1) de Tiempoconstante
     * param titulo
     * param autor
     * param numeroPaginas
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /** Complejidadtemporal /* O(1) de Tiempoconstante
     * return
     */
    public String getTitulo() {
        return titulo;
    }

    /** Complejidadtemporal /* O(1) de Tiempoconstante
     * return
     */
    public String getAutor() {
        return autor;
    }

    /** Complejidadtemporal /* O(1) de Tiempoconstante
     * return
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /** Complejidadtemporal /* O(1) de Tiempoconstante
     * param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** Complejidadtemporal de O(1) de Tiempoconstante
     * param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /** Complejidadtemporal /* O(1) de Tiempoconstante
     * param numeroPaginas
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}