package icc.creacionales.FactoryMethod;

public class LectorPuntoComa implements LectorLinea{
    @Override
    public Lector leerLinea(String linea) {
        String[] partes = linea.split(";");
       
        return new Lector(partes[0], Double.parseDouble(partes[1]), partes[2]);
    }


}
