package builder;

public class Demo {
	public static void main(String [] args) {
		//Gerente gerente = new Gerente(new CheeseBurguerBuilder());
		Gerente gerente = new Gerente();
		gerente.setBuilder(new CheeseBurguerBuilder());
		Burguer burguer = gerente.buildBurger();
		burguer.print();
		
		//Gerente gerente1 = new Gerente(new VeganBurguerBuilder());
		gerente.setBuilder(new VeganBurguerBuilder());
		Burguer burguer1 = gerente.buildBurger();
		burguer1.print();
	}

}
