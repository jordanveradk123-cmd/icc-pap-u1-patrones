package icc.estructurales.simple.decorator;
/**
 * Leche es un decorador que añade leche a una bebida.
 * Leche ---> general puede ser cualquier bebida, pero en este caso se usa con CafeSimple.
 */
public final class Leche implements Bebida {

    protected final Bebida bebida;

    public Leche(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + " con leche";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.5;
    }

}
