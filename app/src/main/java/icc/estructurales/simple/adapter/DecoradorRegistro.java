package icc.estructurales.simple.adapter;

public class DecoradorRegistro extends DecoradorCargador {

    public DecoradorRegistro(Cargador cargador) {
        super(cargador);
    }

    @Override
    public void cargarCelular() {
        System.out.println(" Inicio de carga...");
        super.cargarCelular();
        System.out.println(" Fin de carga, registrado.");
    }

}
