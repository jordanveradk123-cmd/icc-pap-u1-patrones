package icc.estructurales.Practica2;

public class NotificacionAcademica extends Notificacion {

    public NotificacionAcademica(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje, String destinatario) {
        canal.enviar("Not académico: " + mensaje, destinatario);
       
    }

}
