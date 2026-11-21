package icc.estructurales.simple.adapter;

public final class AppAdapter {

    public static void main(String[] args) {
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador c1 = new AdaptadorCargdor(cAntiguo);

        CargadorInalambrico cInalambrico = new CargadorInalambrico();
        Cargador c2 = new AdaptadorCargadorIna(cInalambrico);

        c1.cargarCelular();
        c2.cargarCelular();

        // Caso 1. Antiguo con registro
        System.out.println("\n--- Caso 1. Cargador antiguo con registro ---");
        Cargador ca1 = new DecoradorRegistro(c1);
        ca1.cargarCelular();

        // Caso 2. Inalambrico con seguridad
        System.out.println("\n--- Caso 2. Cargador inalambrico  con seguridadd ---");
        Cargador ca2 = new DecoradorSeguridad(c2, true);
        ca2.cargarCelular();

        // Caso 3. Antiguo con aseguridad
        System.out.println("\n--- Caso 3. Cargador antiguop con seguridadd ---");
        Cargador ca3 = new DecoradorSeguridad(c1, false);
        ca3.cargarCelular();

        // Caso 4. Cargaor inalambrico con ambos decoradores
        System.out.println("\n--- Caso 4. Cargador inalambrico con ambos decoradores ---");
        Cargador ca4 = new DecoradorRegistro(new DecoradorSeguridad(c2, true));
        ca4.cargarCelular();

    }

}
