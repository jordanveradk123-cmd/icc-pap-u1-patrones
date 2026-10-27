package icc.creacionales.Practica.pedidos;

import icc.creacionales.Practica.configuracion.ConfiguracionSistema;

public abstract class Pedido {
    // Atributos
    protected String codigo;
    protected String nombre;
    protected double valorDeLaCompra;

    // Constructor
    public Pedido(String codigo, String nombre, double valorDeLaCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorDeLaCompra = valorDeLaCompra;
    }

    // Método abstracto para procesar el pedido
    public abstract void procesar();

    // Método para obtener el total con impuesto
    public double getTotal() {
        return ConfiguracionSistema.getInstancia().calcularTotalConImpuesto(valorDeLaCompra);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getvalorDelaCompra() {
        return valorDeLaCompra;
    }

    public Double getValorDelImpuesto() {
        return ConfiguracionSistema.getInstancia().calcularValorImpuesto(valorDeLaCompra);
    }

}
