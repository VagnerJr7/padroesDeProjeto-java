package abstractFactory;

public class SemContratosFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		if("A".equals(requestedGrade)) { 
			return new BrasiliaCar(100, "Cheio", "Azul");
		} else if("B".equals(requestedGrade)) {
			return new GolCar(80, "Metade", "Branco");
		} else {
			return null;
		}
	}

}
