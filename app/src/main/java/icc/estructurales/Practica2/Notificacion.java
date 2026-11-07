package icc.estructurales.Practica2;

public abstract class Notificacion {

    protected final CanalEnvio canal;

    // Constructor dependiente
    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String mensaje , String destinatario);

}
