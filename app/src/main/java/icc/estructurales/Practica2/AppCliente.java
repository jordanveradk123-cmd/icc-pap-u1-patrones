package icc.estructurales.Practica2;

public class AppCliente {
    public static void main(String[] args) {
        Notificacion not1= new NotificacionAcademica(new CanalCorreo());
        Notificacion not2= new NotificacionAcademica(new CanalPush());
        Notificacion not3= new NotificacionAcademica(new CanalSms());

        Notificacion notSeg1= new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSeg2= new NotificacionSeguridad(new CanalPush());
        Notificacion notSeg3= new NotificacionSeguridad(new CanalSms());

        Notificacion notAdm1= new NotificacionAdministrativa(new CanalCorreo());
        Notificacion notAdm2= new NotificacionAdministrativa(new CanalPush());
        Notificacion notAdm3= new NotificacionAdministrativa(new CanalSms());

        String mensaje= "Solicitud aprovada";
        String mensajeSeg= "Alerta de correos Maliciosos";
        String mensajeAdm= "Pago de colegiatura";

        not1.notificar(mensaje, "destinatario1");
        not2.notificar(mensaje, "destinatario2");
        not3.notificar(mensaje, "destinatario3");   

        notSeg1.notificar(mensajeSeg, "destinatario4");
        notSeg2.notificar(mensajeSeg, "destinatario5");
        notSeg3.notificar(mensajeSeg, "destinatario6"); 

        notAdm1.notificar(mensajeAdm, "destinatario7");
        notAdm2.notificar(mensajeAdm, "destinatario8");
        notAdm3.notificar(mensajeAdm, "destinatario9");

    




        
    }

}
