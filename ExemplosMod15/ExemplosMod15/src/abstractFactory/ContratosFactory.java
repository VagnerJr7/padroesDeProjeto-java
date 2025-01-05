package abstractFactory;

public class ContratosFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		if("A".equals(requestedGrade)) { 
			return new CorollaCar(100, "Cheio", "Azul");
		} else if ("B".equals( requestedGrade)) {
			return new BmwCar(150, "Cheio", "Preto");
		} else {
			return null;
		}
		
	}

}
