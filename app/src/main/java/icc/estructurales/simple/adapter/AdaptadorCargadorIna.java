package icc.estructurales.simple.adapter;

public class AdaptadorCargadorIna implements Cargador{

   private final CargadorInalambrico cargadorIna;

   public AdaptadorCargadorIna(CargadorInalambrico cargadorIna) {
       this.cargadorIna = cargadorIna;
   }

   @Override
   public void cargarCelular() {
       cargadorIna.cargarBase();
   }
}
