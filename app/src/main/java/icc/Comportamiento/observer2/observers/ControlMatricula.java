package icc.Comportamiento.observer2.observers;

import java.util.function.Consumer;

import icc.Comportamiento.observer2.CambioEstudiante;
import icc.Comportamiento.observer2.Matricula;

public class ControlMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        // Solo si cambió la matrícula
        if (!cambio.atributo().equals("matricula")
                && !cambio.atributo().equals("estadoMatricula")) {
            return;
        }

        // El valor viene como enum Matricula, no como String
        Object valor = cambio.nuevo();
        Matricula nuevo;
        if (valor instanceof Matricula) {
            nuevo = (Matricula) valor;
        } else {
            // Por si viene como String "Suspendido"
            nuevo = Matricula.valueOf(String.valueOf(valor));
        }

        System.out.println("[MATRICULA] " + cambio.est() + " cambio matricula: " + cambio.old() + " -> " + nuevo);

        if (nuevo == Matricula.Suspendido) {
            System.out.println("[MATRICULA] Estudiante SUSPENDIDO");
        }

        if (nuevo == Matricula.Retirado) {
            System.out.println("[MATRICULA] Estudiante RETIRADO");
        }

        if (nuevo == Matricula.Activo) {
            System.out.println("[MATRICULA] Estudiante REACTIVADO - Matricula ACTIVA");
        }
    }

}
