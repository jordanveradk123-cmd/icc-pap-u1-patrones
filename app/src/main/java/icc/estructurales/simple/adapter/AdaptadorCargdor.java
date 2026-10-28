package icc.estructurales.simple.adapter;

public class AdaptadorCargdor implements Cargador {

    // Dependecia del cargador antiguo
    private final CargadorAntiguo cargadorAntiguo;

    public AdaptadorCargdor( CargadorAntiguo cargadorAntiguo) {
        this.cargadorAntiguo = cargadorAntiguo;
    }

    @Override
    public void cargarCelular() {
        cargadorAntiguo.cargar();


    }

}
