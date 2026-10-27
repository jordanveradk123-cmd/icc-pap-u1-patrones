package icc.creacionales.Practica.configuracion;

public class ConfiguracionSistema {
    // Atributos
    private static ConfiguracionSistema instancia;
    private double porcentajeImpuesto;

    // Constructor privado
    private ConfiguracionSistema() {
        // Inicializar el porcentaje de impuesto con un valor predeterminado
        this.porcentajeImpuesto = 0.15; // Por ejemplo, 15%
    }

    // Método para obtener la instancia única de ConfiguracionSistema
    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    // Métodos para obtener y establecer el porcentaje de impuesto
    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    // Método para establecer el porcentaje de impuesto
    public void setPorcentajeImpuesto(double p) {
        this.porcentajeImpuesto = p;
    }

    // Método para calcular el total con impuesto
    public double calcularTotalConImpuesto(double valor) {
        return valor + (valor * porcentajeImpuesto);
    }
    
    //Método para calcular el impuesto
    public double calcularValorImpuesto(double valor) {
        return valor * porcentajeImpuesto;
    }

}
