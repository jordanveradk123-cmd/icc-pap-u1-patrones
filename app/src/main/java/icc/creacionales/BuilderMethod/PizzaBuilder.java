package icc.creacionales.BuilderMethod;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Objeto Builder
 * PizzaBuilder acumulara las opciones de una pizza y creaara el producto
 * (Objeto(Pizza)) cunado se pida al metodo
 * construira (build)
 * 
 */
public final class PizzaBuilder {
    private String size;
    private Set<String> ingredients;

    public PizzaBuilder() {
        this.size = "mediana";
        this.ingredients = new LinkedHashSet<>();
        this.ingredients.add("queso");
    }

    // Opcion1
    public PizzaBuilder SetSize(String size) {
        this.size = size;
        return this;
    }

    // Opcion2
    // public PizzaBuilder addIngredient(String ing) no devuelve duplicados
    public PizzaBuilder AddIngredient(String ing) {
        this.ingredients.add(ing);
        return this;
    }

    // Metodo builder
    // Me devuelve el producto final (Pizza)
    public Pizza build() {
        return new Pizza(size, ingredients.stream().toList());
    }
}
