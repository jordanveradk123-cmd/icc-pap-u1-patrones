package icc.estructurales.simple.proxy;

/**
 * Proxy para un documento. Permite controlar el acceso a un documento real.
 * DocumentoProxy
 */

public class DocumentoProxy implements Documento {

    private final String path;
    private DocumentoReal documento;

    public DocumentoProxy(String path) {
        this.path = path;
    }

    @Override
    public void mostrar() {
        if (documento == null) {
            documento = new DocumentoReal(path);
        }
        documento.mostrar();
    }

}
