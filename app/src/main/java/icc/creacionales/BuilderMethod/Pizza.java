package icc.creacionales.BuilderMethod;

import java.util.List;

/**
 * 
 * Pizza clase inmutable
 * 
 * representa una pizza ya comfigurada no se puede cambiar despues de ser creada
 */
public final class Pizza {
    private final String size;
    private final List<String> ingredients;

    //Cosntructor lleno porque es una clase inmutable no tiene setters
    protected Pizza(String size, List<String> ingredients) {
        this.size = size;
        this.ingredients = ingredients;
    }

    public String Descripcion() {
        return "Pizza de tamaño: " + size + " con ingredientes: " + ingredients;
    }

}
