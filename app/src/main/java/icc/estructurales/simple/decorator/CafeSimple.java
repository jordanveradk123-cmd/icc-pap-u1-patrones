package icc.estructurales.simple.decorator;

public final class CafeSimple implements Bebida {

    @Override
    public String descripcion() {
        return "Un cafecito riquito riquito";
    }

    @Override
    public double precio() {
        return  2.00;
    }

}
