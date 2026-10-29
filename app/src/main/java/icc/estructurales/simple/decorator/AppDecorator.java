package icc.estructurales.simple.decorator;

public final class AppDecorator {
    public static void main(String[] args) {

        // Creamos un cafe simple
        Bebida cafe = new CafeSimple();
        System.out.println("\n" + cafe.descripcion() + " $" + cafe.precio());

        // Decoramos el cafe simple con leche
        Bebida cafeConLeche = new Leche(cafe);
        System.out.println("\n" + cafeConLeche.descripcion() + " $" + cafeConLeche.precio());

        // Decoramos un nuevo cafe con leche
        Bebida cafeConLeche2 = new Leche(new CafeSimple());
        System.out.println("\n" + cafeConLeche2.descripcion() + " $" + cafeConLeche2.precio());

        // Comprobamos que los objetos son diferentes
        System.out.println("\n" + (cafe == cafeConLeche)); 

        // Decoramos el cafe simple con chocolate
        Bebida cafeConChocolate = new Chocolate(new CafeSimple());
        System.out.println("\n" + cafeConChocolate.descripcion() + " $" + cafeConChocolate.precio());

        // Decoramos el cafe con leche con chocolate
        Bebida cafeConLecheYChocolate = new Chocolate(cafeConLeche);
        System.out.println("\n" + cafeConLecheYChocolate.descripcion() + " $" + cafeConLecheYChocolate.precio());

        // Decoramos el cafe con chocolate con leche
        Bebida cafeConChocolateYLeche = new Leche(cafeConChocolate);
        System.out.println("\n" + cafeConChocolateYLeche.descripcion() + " $" + cafeConChocolateYLeche.precio());

        // Decoramos el cafe con chocolate chocolate y leche
        Bebida cafeChocolateChocola1 = new Chocolate(cafeConChocolate);
        Bebida cafeChocolateChocola2 = new Leche(cafeChocolateChocola1);
        System.out.println("\n" + cafeChocolateChocola2.descripcion() + " $" + cafeChocolateChocola2.precio());
    }

}
