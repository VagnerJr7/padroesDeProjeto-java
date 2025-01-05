package exercicioFactoryMethod;

 class ContratoFabrica extends Fabrica{

	@Override
	Carro recuperarCar(String gradeSolicitada) {
		if("A".equals(gradeSolicitada)) {
			return new CivicCarro(150, "chumbo");
		} else if ("B".equals(gradeSolicitada)) {
			return new AudiCarro(200, "preto");
		} else if ("C".equals(gradeSolicitada)) {
			return new BmwCarro(220, "branco");
		} else {
			return null;
		}
	}

}
