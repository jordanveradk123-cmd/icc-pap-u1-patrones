package icc.estructurales.simple.proxy;

public class AppProxy {
    public static void main(String[] args) {
        Documento documento = new DocumentoProxy("documento.txt");
        System.out.println("el proxy ya esta creado");
        documento.mostrar();
        documento.mostrar();

    }

}
