package icc.estructurales.simple.facade;

public class AppFacade {
    public static void main(String[] args) {
        CineEnCasa cine = new CineEnCasa();
        cine.iniciarPelicula("El Padrino");
        System.out.println("La película ha terminado");
    }

}
