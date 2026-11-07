package icc.creacionales.bridge;

public class AppBride {
    public static void main(String[] args) {
        Notificacion not1 = new NotificacionAcademica(new CanalCorreo());
        Notificacion not2 = new NotificacionAcademica(new CanalPush());

        Notificacion notSeg1 = new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSeg2 = new NotificacionSeguridad(new CanalPush());
        
        String mensaje = "Solicitud aprovada";
        String mensajeSeg = "Alerta de correos Maliciosos";

        not1.notificar(mensaje);
        not2.notificar(mensaje);

        notSeg1.notificar(mensajeSeg);
        notSeg2.notificar(mensajeSeg);
    
    }

}
