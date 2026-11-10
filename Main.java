public class Main {
    public static void main(String[] args) {
        String[] canciones = {"cancion 1 ", "cancion 2 " , "cancion 3" };
        ListaReproduccion lista = new ListaReproduccion("favoritas", canciones);
        System.out.println("reproduciendo: " + lista.obtenerPistaActual());
        lista.siguiente();
        System.out.println("reproduciendo: " + lista.obtenerPistaActual());

        lista.siguiente();
        lista.siguiente();

        System.out.println("reproduciendo: " + lista.obtenerPistaActual());

        lista.anterior();
        System.out.println("reproduciendo: " + lista.obtenerPistaActual());

        lista.anterior();
        lista.anterior();

        System.out.println("reproduciendo: " + lista.obtenerPistaActual());
    }
}
