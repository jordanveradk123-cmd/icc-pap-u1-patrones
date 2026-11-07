package icc.estructurales.simple.adapter;

public final class DecoradorRegistro {

    private final Cargador cargador;

    public DecoradorRegistro(Cargador cargador) {
        this.cargador = cargador;
    }
     
    @Override
    public void cargar() {
        System.out.println("Iniciando carga de datos...");
        cargador.cargar();
        System.out.println("Carga de datos finalizada.");
    }
}
