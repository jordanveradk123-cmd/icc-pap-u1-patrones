package icc.estructurales.Practica2;

public class AppCliente {
    public static void main(String[] args) {
        ProxyCanalEnvio proxy = new ProxyCanalEnvio(new CanalCorreo(), false);
        Notificacion notificacionAcademica = new NotificacionAcademica(proxy);
        notificacionAcademica.notificar("Examen final el 20 de junio", "estudiante@universidad.edu");

        System.out.println("--------------------------------------------------");

        ProxyCanalEnvio proxy2 = new ProxyCanalEnvio(new CanalPush(), true);
        Notificacion notificacionSeguridad = new NotificacionSeguridad(proxy2);
        notificacionSeguridad.notificar("Se detectó un acceso no autorizado", "admin@universidad.edu");
        System.out.println("--------------------------------------------------");

        ProxyCanalEnvio proxy3 = new ProxyCanalEnvio(new CanalSms(), true);
        Notificacion notificacionAdministrativa = new NotificacionAdministrativa(proxy3);
        notificacionAdministrativa.notificar("Se ha actualizado el horario de clases", "estudiante  @universidad.edu");

    }
}