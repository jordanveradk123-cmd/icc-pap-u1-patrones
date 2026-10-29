package icc.estructurales.simple.adapter;

public final class DecoradorRegistro {

    private final Cargador cargador;

    public DecoradorRegistro(Cargador cargador) {
        this.cargador = cargador;
    }
     
    @Override
    public void cargar() {
        System.out.println("iniciar carga con...");
        cargador.cargarCelular();
        System.out.println("carga finalizada");
    }
}
