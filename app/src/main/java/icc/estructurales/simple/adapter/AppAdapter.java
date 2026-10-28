package icc.estructurales.simple.adapter;

public final class AppAdapter {

    public static void main(String[] args) {
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador cUsb = new AdaptadorCargdor(cAntiguo);

        CargadorInalambrico cInalambrico = new CargadorInalambrico();
        Cargador cInal = new AdaptadorCargadorIna(cInalambrico);
        cUsb.cargarCelular();
        cInal.cargarCelular();
    }

}
