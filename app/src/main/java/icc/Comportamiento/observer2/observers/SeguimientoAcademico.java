package icc.Comportamiento.observer2.observers;

import java.util.function.Consumer;

import icc.Comportamiento.observer2.CambioEstudiante;

//ObserverDos
//Cosumer es una interface 
public class SeguimientoAcademico implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("promedio")) {
            return;
        }

        double anterior = (double) cambio.old();
        double nuevo = (double) cambio.nuevo();

        if (anterior >= 7.0 && nuevo < 7.0) {
            System.out.println("[ACADEMICO] Bajo Rendimiento" + cambio.est());
        }

        if (anterior < 7.0 && nuevo >=7.0) {
            System.out.println("[ACADEMICO] Recuperacion Academica" + cambio.est());

        }

    }
}
