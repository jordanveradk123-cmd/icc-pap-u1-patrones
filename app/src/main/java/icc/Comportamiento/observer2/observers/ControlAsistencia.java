package icc.Comportamiento.observer2.observers;

import java.util.function.Consumer;

import icc.Comportamiento.observer2.CambioEstudiante;

public class ControlAsistencia implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("asistencia")) {
            return;

        }

        int anterior = (int) cambio.old();
        int nuevo = (int) cambio.nuevo();

        if (anterior >= 0 && nuevo <= 2) {
            System.out.println("[ACADEMICO] Asistencia Normal" + cambio.est());
        }

        if (anterior >= 3 && nuevo <= 5) {
            System.out.println("[ACADEMICO] Advertencia" + cambio.est());

        }

        if (anterior >= 6 && nuevo < 6) {
            System.out.println("[ACADEMICO] Critica" + cambio.est());
        }

    }

}
