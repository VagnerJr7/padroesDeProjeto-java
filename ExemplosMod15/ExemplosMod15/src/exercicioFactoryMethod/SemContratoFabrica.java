package exercicioFactoryMethod;

 class SemContratoFabrica extends Fabrica{

	@Override
	Carro recuperarCar(String gradeSolicitada) {
		if("A".equals(gradeSolicitada)) {
			return new CorollaCarro(100, "prata");
		} else if ("B".equals(gradeSolicitada)) {
			return new GolfCarro(90, "branco");
		} else if ("C".equals(gradeSolicitada)) {
			return new HrvCarro(110, "chumbo");
		} else {
			return null;
		}
	}

}
