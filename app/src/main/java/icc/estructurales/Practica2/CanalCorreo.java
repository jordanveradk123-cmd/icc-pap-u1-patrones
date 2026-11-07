package icc.estructurales.Practica2;

public class CanalCorreo implements CanalEnvio {
    @Override
    public void enviar(String mensaje , String destinatario) {
        System.out.println("Correo: " + mensaje + " para " + destinatario);
    }

}
