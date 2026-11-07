package icc.estructurales.Practica2;

public class CanalPush implements CanalEnvio {
    @Override
    public void enviar(String mensaje , String destinatario) {
        System.out.println("Push: " + mensaje + " para " + destinatario);
    }
    

}
