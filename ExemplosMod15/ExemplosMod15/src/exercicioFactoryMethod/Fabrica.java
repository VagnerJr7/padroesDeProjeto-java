package exercicioFactoryMethod;

abstract class Fabrica {
	
	public Carro create(String gradeSolicitada) {
		Carro carro = recuperarCar(gradeSolicitada);
		carro = prepareCar(carro);
		return carro;
	}
	
	private Carro prepareCar(Carro carro){  
        carro.limpo();
        carro.carroIniciado();
        carro.txtPotencia();
        return carro;
    }

	abstract Carro recuperarCar(String gradeSolicitada);
}
