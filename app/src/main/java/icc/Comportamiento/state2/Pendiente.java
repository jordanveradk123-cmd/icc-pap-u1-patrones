package icc.Comportamiento.state2;

public class Pendiente implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pago Realizado");
        pedido.changeState(new Pagado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Debes pagar el cafe riquito");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido no ah sido ni enviado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.changeState(new Cancelado());
    }

    @Override
    public String nombre() {
        return "PENDIENTE";
    }

}
