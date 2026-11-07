package icc.estructurales.simple.flyweight;

/**
 * ComponenteVisual
 */
public class ComponenteVisual {

    private final String tipo;
    private final String color;
    private final String border;

    public ComponenteVisual(String tipo, String color, String border) {
        this.tipo = tipo;
        this.color = color;
        this.border = border;
    }

    public void dibujar(String text, int x, int y) {
        System.out.printf("%s [%s] en (%d, %d) , color=%s, borde %s%n", tipo, text, x, y, color, border);
    }

}
