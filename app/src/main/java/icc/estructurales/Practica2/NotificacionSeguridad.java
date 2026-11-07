package icc.estructurales.Practica2;

public class NotificacionSeguridad extends Notificacion {
    public NotificacionSeguridad(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje, String destinatario) {
        canal.enviar("Seguridad: " + mensaje, destinatario);
    }

}
