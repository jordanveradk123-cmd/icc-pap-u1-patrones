package icc.creacionales.bridge;

public class AppBride {
    public static void main(String[] args) {

        Notificacion not1 = new NotificacionAcademica(new CanalCorreo());
        Notificacion not2 = new NotificacionAcademica(new CanalPush());

        String mensaje = "Examen final el 20 de diciembre";
        String mensaje2= "Se detectó un acceso no autorizado";
        
        not1.notificar(mensaje);
        not2.notificar(mensaje);

        Notificacion notSeg1 = new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSeg2 = new NotificacionSeguridad(new CanalPush());
        
        notSeg1.notificar(mensaje2);
        notSeg2.notificar(mensaje2);
        
    }

}
