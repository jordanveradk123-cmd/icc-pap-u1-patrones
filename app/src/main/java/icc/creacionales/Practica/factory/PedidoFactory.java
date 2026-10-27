package icc.creacionales.Practica.factory;

import icc.creacionales.Practica.pedidos.Pedido;
import icc.creacionales.Practica.pedidos.PedidoEnLinea;
import icc.creacionales.Practica.pedidos.PedidoPresencial;

public class PedidoFactory {
    // Método estático para crear pedidos según el tipo
    public static Pedido crearPedido(String tipo, String codigo, String cliente, double valor) {
        if (tipo.equalsIgnoreCase("presencial")) {
            return new PedidoPresencial(codigo, cliente, valor);
        } else if (tipo.equalsIgnoreCase("linea")) {
            return new PedidoEnLinea(codigo, cliente, valor);
        }
        throw new IllegalArgumentException("Tipo de pedido no válido");
    }

}
