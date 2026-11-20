package icc.Comportamiento.observer2.observers;

import java.util.function.Consumer;

import icc.Comportamiento.observer2.CambioEstudiante;

public class ControlAsistencia implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("asistencias")) {
            return;

        }

        int nuevo = Integer.parseInt(String.valueOf(cambio.nuevo()));

        if (nuevo <= 2 && nuevo >= 0) {
            System.out.println("[ACADEMICO] Asistencia Normal" + cambio.est());
        }

        if (nuevo >= 3 && nuevo <= 5) {
            System.out.println("[ACADEMICO] Advertencia" + cambio.est());

        }

        if (nuevo >= 6) {
            System.out.println("[ACADEMICO] Critica" + cambio.est());
        }

    }

}
