package icc.creacionales.prototype;

public class PlantillaEmail {
    private String asunto;
    private String mensaje;

    // Constructor lleno
    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    // Prototype metodo clone
    public PlantillaEmail clone() {
        return new PlantillaEmail(asunto, mensaje);
    }
    // Cambiar el asunto de la plantilla es el Setter de asunto con otro nombre
    public void cambiarAsunto(String asunto) {
        this.asunto = asunto;
    }
    // este es el getter del toString con otro nombre
    public String contenido() {
        return this.toString();
    }

    @Override
    public String toString() {
        return asunto + ":" + mensaje;
    }

}
