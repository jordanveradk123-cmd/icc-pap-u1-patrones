package icc.creacionales.FactoryMethod;

public class ImportadorTabulacion extends Importador {

    @Override
    protected LectorLinea crearLector() {
        return new LectorTambulacion();
    }

}
