package abstractFactory;

public class FactoryCreator {
	public static AbstractFactory getFactory(TipFactory name) {
		if(TipFactory.HACKATHON == name) {
			return new HackathonFactory();
		}else if(TipFactory.ALGORITMICA == name) {
			return new AlgoritmicaFactory();
		} else if(TipFactory.WORKSHOP == name) {
			return new WorkshopFactory();
		}
		return null;
	}
}
