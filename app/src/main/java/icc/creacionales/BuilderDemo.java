package icc.creacionales;

public class BuilderDemo {
    //  La clase que queremos construir
    public static class Computadora {
        private String procesador;
        private String ram;
        private String disco;
        private String grafica;
        private boolean tieneWifi;
        private boolean tieneBluetooth;

        // Constructor privado solo el Builder puede usarlo
        private Computadora(Builder builder) {
            this.procesador = builder.procesador;
            this.ram = builder.ram;
            this.disco = builder.disco;
            this.grafica = builder.grafica;
            this.tieneWifi = builder.tieneWifi;
            this.tieneBluetooth = builder.tieneBluetooth;
        }

        // BUILDER va armando la computadora
        public static class Builder {
            private String procesador;
            private String ram;
            private String disco;
            private String grafica;
            private boolean tieneWifi;
            private boolean tieneBluetooth;

            public Builder procesador(String procesador) {
                this.procesador = procesador;
                return this;
            }

            public Builder ram(String ram) {
                this.ram = ram;
                return this;
            }

            public Builder disco(String disco) {
                this.disco = disco;
                return this;
            }

            public Builder grafica(String grafica) {
                this.grafica = grafica;
                return this;
            }

            public Builder tieneWifi(boolean tieneWifi) {
                this.tieneWifi = tieneWifi;
                return this;
            }

            public Builder tieneBluetooth(boolean tieneBluetooth) {
                this.tieneBluetooth = tieneBluetooth;
                return this;
            }

            // Al final construye el objeto real
            public Computadora build() {
                return new Computadora(this);
            }
        }

        @Override
        public String toString() {
            return "Computadora [procesador=" + procesador + ", ram=" + ram + ", disco=" + disco + ", grafica=" + grafica + ", wifi=" + tieneWifi + ", bluetooth=" + tieneBluetooth + "]";
        }
    }

    // 3. Muestra de el funcionamiento
    public static void run() {
        System.out.println("=== PATRON BUILDER ===");

        // Computadora Gamer completa
        Computadora gamer = new Computadora.Builder()
                .procesador("Intel i9")
                .ram("32GB")
                .disco("1TB SSD")
                .grafica("RTX 4060")
                .tieneWifi(true)
                .tieneBluetooth(true)
                .build();
        System.out.println("Gamer: " + gamer);

        // Computadora basica sin grafica ni bluetooth
        Computadora basica = new Computadora.Builder()
                .procesador("Intel i3")
                .ram("8GB")
                .disco("256GB SSD")
                .tieneWifi(true)
                .build();
        System.out.println("Basica: " + basica);
    }

}
