package icc.estructurales.simple.facade;
/**
 * esta clase es la facade porque cordina los componentes necesarios para una accion determinada 
 * Reproductor
 */

public class CineEnCasa {
    private final Proyector proyector;
    private final Reproductor reproductor;

    public CineEnCasa() {
        this.proyector = new Proyector();
        this.reproductor = new Reproductor();
    }

    public void iniciarPelicula(String pelicula) {
        proyector.encender();
        reproductor.reproducir(pelicula);

    }

}
