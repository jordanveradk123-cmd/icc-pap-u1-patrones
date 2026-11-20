package icc.Comportamiento.observer2;

import java.util.function.Consumer;

import icc.Comportamiento.observer2.observers.ControlAsistencia;
import icc.Comportamiento.observer2.observers.ControlMatricula;
import icc.Comportamiento.observer2.observers.NotificadorRepresentante;
import icc.Comportamiento.observer2.observers.SeguimientoAcademico;
import icc.Comportamiento.observer2.observers.SeguimientoIntegral;

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

        // Observador 3
        ControlAsistencia ctAsistencia = new ControlAsistencia();

        // Observer4
        ControlMatricula ctMmatricula = new ControlMatricula();

        // Observer5
        SeguimientoIntegral sgIntegral = new SeguimientoIntegral();

        // Observer 6
        NotificadorRepresentante nRepresentante = new NotificadorRepresentante();

        ana.suscribir(auditoria);
        ana.suscribir(obAcademico);
        ana.suscribir(ctAsistencia);
        ana.suscribir(ctMmatricula);
        ana.suscribir(sgIntegral);
        ana.suscribir(nRepresentante);

        luis.suscribir(auditoria);
        luis.suscribir(obAcademico);
        luis.suscribir(ctAsistencia);
        luis.suscribir(ctMmatricula);
        luis.suscribir(sgIntegral);
        luis.suscribir(nRepresentante);

        maria.suscribir(auditoria);
        maria.suscribir(obAcademico);
        maria.suscribir(ctAsistencia);
        maria.suscribir(ctMmatricula);
        maria.suscribir(sgIntegral);

        // ana.setPromedio("6.7")
        ana.setPromedio(6.7);

        // anan.setOPromedio("7.8")
        ana.setPromedio(7.8);

        // Luis.setAsistencia
        luis.setAsistencias(7);

        // Maria.setMatricula ah suspendida
        maria.setMatricula(Matricula.Suspendido);

        // maria.setMatricula ah Activa
        maria.setMatricula(Matricula.Activo);

        // luis.setPromedio
        luis.setPromedio(6.4);

        // Maria.setMismos valores
        maria.setAsistencias(0);
        maria.setPromedio(9.1);

        // ana.setPromedio
        ana.setPromedio(5.5);

        // luis.setAsistenciaas
        luis.setAsistencias(8);

        // ana.setMetricula
        ana.setMatricula(Matricula.Suspendido);

        // Prueba de que no recibe los de Maria

        maria.setPromedio(4.0);
        maria.setAsistencias(10);
        maria.setMatricula(Matricula.Suspendido);

    }

}
