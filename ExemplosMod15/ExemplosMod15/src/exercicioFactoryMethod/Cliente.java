package exercicioFactoryMethod;

public class Cliente {
	
	 private String gradeSolicitada;
	 private boolean temContratroCompania;

	 public Cliente(String gradeSolicitada, boolean temContratroCompania) {
	      this.gradeSolicitada = gradeSolicitada;
	      this.temContratroCompania = temContratroCompania;
	 }
	 public boolean temContratroCompania() {
	      return temContratroCompania;
	 }
	 public String GetgradeSolicitada() {
	     return gradeSolicitada;
	 }


}
