package icc.creacionales.bridge;

public class NotificacionAcademica extends Notificacion {

    public NotificacionAcademica(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Not académico: " + mensaje);
    }
    

}
