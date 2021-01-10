package abstractFactory;

public class AlgoritmicaFactory extends AbstractFactory{

	@Override
	public Eveniment getEveniment(TipEveniment denumire) {
		if(TipEveniment.ALGORITMICA_INCEPATOR == denumire) {
			return new AlgoritmicaIncepator();
		}
		else if(TipEveniment.ALGORITMICA_MEDIU == denumire) {
			return new AlgoritmicaMediu();
		}
		else if(TipEveniment.ALGORITMICA_AVANSAT == denumire) {
			return new AlgoritmicaAvansat();
		}
		return null;
	}

}
