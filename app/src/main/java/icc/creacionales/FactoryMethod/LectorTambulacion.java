package icc.creacionales.FactoryMethod;

public class LectorTambulacion implements LectorLinea {
    @Override
    public Lector leerLinea(String linea) {
        String[] partes = linea.split("\t");
       
        return new Lector(partes[0], Double.parseDouble(partes[1]), partes[2]);
    }

}
