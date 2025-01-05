package exercicioFactoryMethod;


public class Demo {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("A", false);
		Fabrica fabrica = getFabrica(cliente);
		Carro carro = fabrica.create(cliente.GetgradeSolicitada());
		carro.carroIniciado();
	}

	private static Fabrica getFabrica(Cliente cliente) {
		if(cliente.temContratroCompania()) {
			return new ContratoFabrica();
		} else {
			return new SemContratoFabrica();
		}
	}

}
