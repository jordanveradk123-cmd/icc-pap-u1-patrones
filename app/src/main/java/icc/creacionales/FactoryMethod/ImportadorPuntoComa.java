package icc.creacionales.FactoryMethod;

public class ImportadorPuntoComa extends Importador {

    @Override
    protected LectorLinea crearLector() {
        return new LectorPuntoComa();
    }

}
