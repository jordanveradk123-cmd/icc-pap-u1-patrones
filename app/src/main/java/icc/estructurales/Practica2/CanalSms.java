package icc.estructurales.Practica2;

public class CanalSms implements CanalEnvio {
    @Override
    public void enviar(String mensaje , String destinatario) {
        System.out.println("SMS: " + mensaje + " para " + destinatario);
    }

}
