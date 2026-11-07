package icc.creacionales.bridge;

public class NotificacionSeguridad extends Notificacion {
    public NotificacionSeguridad(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Seguridad: " + mensaje);
    }

}
