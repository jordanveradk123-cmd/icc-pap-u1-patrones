package icc.Comportamiento.observer2;

import java.util.function.Consumer;

import icc.Comportamiento.observer2.observers.SeguimientoAcademico;

public class AppObsserverPractica {
    public static void main(String[] args) {

        Estudiante ana = new Estudiante("EST001", "Ana Torres", 8.5, 1, Matricula.Activo);
        Estudiante luis = new Estudiante("EST002", "Luis Pérez", 7.2, 4, Matricula.Activo);
        Estudiante maria = new Estudiante("EST003", "María López", 9.1, 0, Matricula.Activo);

        // Observador1 Uditoria
        Consumer<CambioEstudiante> auditoria = cambio -> {
            System.out.printf("\n[Auditoria] %s | %s: %s -> %s%n", cambio.est(), cambio.atributo(), cambio.old(),
                    cambio.nuevo());
        };

        // Obseravdor 2
        SeguimientoAcademico obAcademico = new SeguimientoAcademico();

       // ana.suscribir(auditoria);
        ana.suscribir(obAcademico);

        luis.suscribir(auditoria);
        luis.suscribir(obAcademico);

        maria.suscribir(auditoria);
        maria.suscribir(obAcademico);

        

        //ana.setCodigo("008");

        ana.setPromedio(6.7);

    }

}
