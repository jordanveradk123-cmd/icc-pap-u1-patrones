package icc.estructurales.Practica2;

public class NotificacionAdministrativa extends Notificacion {
    public NotificacionAdministrativa(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje, String destinatario) {
        canal.enviar("Administrativa: " + mensaje, destinatario);
    }

}
