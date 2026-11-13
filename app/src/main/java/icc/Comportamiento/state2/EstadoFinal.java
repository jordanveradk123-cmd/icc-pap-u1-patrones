package icc.Comportamiento.state2;

public abstract class EstadoFinal implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Estado no perimitido");

    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Estado no perimitido");

    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Estado no perimitido");

    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Estado no perimitido");

    }

}
