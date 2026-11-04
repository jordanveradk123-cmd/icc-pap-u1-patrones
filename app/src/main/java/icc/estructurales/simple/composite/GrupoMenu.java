package icc.estructurales.simple.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite agrupa productos elementos de menú. Implementa la interfaz
 * ElementoMenu para poder ser tratado como un elemento individual.
 * calcula las sumas de los precios de los elementos que contiene.
 * GrupoMenu
 */

public class GrupoMenu implements ElementoMenu {

    private List<ElementoMenu> items;

    public GrupoMenu() {
        items = new ArrayList<>();
    }

    @Override
    public double precio() {
        // double total = 0;
        // for (ElementoMenu elemento : items) {
        // total += elemento.precio();
        // }
        // return total;

        return items.stream().mapToDouble(ElementoMenu::precio).sum();
    }

    public void addItem(ElementoMenu item) {
        items.add(item);
    }

}
