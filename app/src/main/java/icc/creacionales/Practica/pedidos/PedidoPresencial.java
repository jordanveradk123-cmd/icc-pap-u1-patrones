package icc.creacionales.Practica.pedidos;

public class PedidoPresencial extends Pedido {
    // Constructor
    public PedidoPresencial(String codigo, String nombre, double valorDeLaCompra) {
        super(codigo, nombre, valorDeLaCompra);
    }

    // Implementación del método abstracto procesar
    @Override
    public void procesar() {
        System.out.println("Cliente:" + nombre + " Subtotal: $"
                + getvalorDelaCompra() + " Impuesto:" + getValorDelImpuesto()
                + " Total:" + getTotal() + " Comprobante Generado en tienda");
        // Lógica específica para procesar un pedido presencial
    }

}
