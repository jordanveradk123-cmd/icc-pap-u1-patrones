package icc.Comportamiento.observer2.observers;

import java.util.function.Consumer;
import icc.Comportamiento.observer2.CambioEstudiante;
import icc.Comportamiento.observer2.Estudiante;
import icc.Comportamiento.observer2.Matricula;

public class NotificadorRepresentante implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        Estudiante e = cambio.est();

        // 1. Promedio inferior a 6.0
        if (e.getPromedio() < 6.0) {
            System.out.println(
                    "[REPRESENTANTE] Notificar a representante de " + e + " - Promedio bajo: " + e.getPromedio());
        }

        // 2. Inasistencias iguales o superiores a 8
        if (e.getAsistencias() >= 8) {
            System.out.println("[REPRESENTANTE] Notificar a representante de " + e + " - Inasistencias criticas: "
                    + e.getAsistencias());
        }

        // 3. Cambio de matricula a SUSPENDIDO
        if (e.getMatricula() == Matricula.Suspendido) {
            System.out.println("[REPRESENTANTE] Notificar a representante de " + e + " - Matricula SUSPENDIDA");
        }
    }
}