package icc.creacionales.bridge;

public abstract class Notificacion {
    protected final CanalEnvio canal;

    //Constructor dependiente 
    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }
    public abstract void notificar(String mensaje);

}
