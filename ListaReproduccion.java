public class ListaReproduccion {
    private String nombre;
    private String[] canciones;
    private int indice;
    public ListaReproduccion(String nombre, String[] canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
        this.indice = 0;
    }
    public void siguiente() {
        if (indice < canciones.length -1) {
            indice++;
        } else {
            System.out.println("no hay mas canciones");
        }
    }
    public void anterior() {
        if (indice > 0) {
            indice--;
        } else {
            System.out.println("es la primera cancion");
        }
    }
    public String obtenerPistaActual() {
        return canciones[indice];
    }
}
