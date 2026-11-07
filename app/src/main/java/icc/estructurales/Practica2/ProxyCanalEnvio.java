package icc.estructurales.Practica2;

public class ProxyCanalEnvio implements CanalEnvio {
    private CanalEnvio canal;
    private Boolean autorizado;

    public ProxyCanalEnvio(CanalEnvio canal, Boolean autorizado) {
        this.canal = canal;
        this.autorizado = autorizado;
    }

    @Override
    public void enviar(String mensaje, String destinatario) {
        if (!autorizado) {
            System.out.println(" El canal no está autorizado no se puede enviar el mensaje.");
            return;
        }
        canal.enviar(mensaje, destinatario);
    }
}
