package icc.Comportamiento.state2;

/**
 * Enviado
 */
public class Enviado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("El pedido ya esta pagado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido ya fue enviado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido entregado");
        pedido.changeState(new Entregado());

    }

    @Override
    public void cancelar(Pedido pedido) {
         System.out.println("No se puede cancelar");
    }

    @Override
    public String nombre() {
        return "ENTREGADO";
    }

}
