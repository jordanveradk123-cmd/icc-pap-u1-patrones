package icc.estructurales.simple.adapter;

public final class DecoradorSeguridad {

    private final boolean permitido;

    private final Cargador cargador;

    public DecoradorSeguridad(Cargador cargador, boolean permitido) {
        this.cargador = cargador;
        this.permitido = permitido;
    }

    if(permitido){

    public void cargar() {
        System.out.println("iniciar carga con...");
        cargador.cargarCelular();
        System.out.println("carga finalizada");
    

    }else{

    public void cargarCelular() {
        System.out.println("Carga no permitida");
    }
}

}
