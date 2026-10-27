package icc.creacionales.Practica.pedidos;

public class PedidoEnLinea extends Pedido {
    // Constructor
    public PedidoEnLinea(String codigo, String nombre, double valorDeLaCompra) {
        super(codigo, nombre, valorDeLaCompra);
    }

    // Implementación del método abstracto procesar
    @Override
    public void procesar() {
        System.out.println("Cliente:" + nombre + " Subtotal: $"
                + getvalorDelaCompra() + " Impuesto:" + getValorDelImpuesto()
                + " Total:" + getTotal() + " Configuracion digital generada");
        // Lógica específica para procesar un pedido en línea
    }

}
