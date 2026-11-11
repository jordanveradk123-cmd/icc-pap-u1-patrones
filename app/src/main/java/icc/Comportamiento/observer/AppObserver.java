package icc.Comportamiento.observer;

public class AppObserver {

    public static void main(String[] args) {
        Producto p = new Producto("001", 20.99, "Pizza");

        p.suscribir(cp -> System.out.println("Corre : $" + cp.nuevo()));
        p.suscribir(cp -> System.out.println("Registro : $" + cp.nuevo()));

        String codigoAnt = p.getCodigo();

        /** 
        String codOld = p.getCodigo();
        p.suscribir(producto -> {

            if (!codOld.equals(producto.getCodigo())) {

                System.out.printf("El codigo viejo es %s, y el nuevo es %s%n", codOld, producto.getCodigo());
            }

        });
        */

        p.suscribir(cp -> {
            System.out.println("se modifico el" + cp.atributo());
            System.out.println("old:" + cp.anterior() + "|new :" + cp.nuevo());
        });

        p.setPrecio(15.50);
        p.setNombre("Pdggdgd");
        p.setCodigo("004");

    }

}
