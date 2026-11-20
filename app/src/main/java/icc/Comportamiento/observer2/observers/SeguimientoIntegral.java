package icc.Comportamiento.observer2.observers;

import java.util.function.Consumer;
import icc.Comportamiento.observer2.CambioEstudiante;
import icc.Comportamiento.observer2.Estudiante;
import icc.Comportamiento.observer2.Matricula;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        // cambio.est() nos da el estudiante completo, no solo lo que cambió
        Estudiante e = cambio.est();

        // 1. Promedio inferior a 7.0
        boolean bajoPromedio = e.getPromedio() < 7.0;

        // 2. Al menos 6 inasistencias
        boolean muchasFaltas = e.getAsistencias() >= 6;

        // 3. Matrícula en estado ACTIVO
        boolean activo = e.getMatricula() == Matricula.Activo;

        // Solo si cumple las 3 a la vez, alerta
        if (bajoPromedio && muchasFaltas && activo) {
            System.out.println("[INTEGRAL] ¡ALERTA DE RIESGO! " + e);
            System.out.println("[INTEGRAL] Promedio: " + e.getPromedio() + " | Asistencias: " + e.getAsistencias()
                    + " | Matricula: " + e.getMatricula());
            System.out.println(
                    "[INTEGRAL] El estudiante cumple las 3 condiciones: promedio < 7.0, faltas >= 6 y matricula ACTIVO");
        }
    }
}