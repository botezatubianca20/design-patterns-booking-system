package abstractFactory;

public class HackathonFactory extends AbstractFactory{

	@Override
	public Eveniment getEveniment(TipEveniment denumire) {
		if(TipEveniment.HACKATHON_BUSINESS_INTELLIGENCE == denumire) {
			return new HackathonBusinessIntelligence();
		}
		else if(TipEveniment.HACKATHON_DEZVOLTARE == denumire) {
			return new HackathonDezvoltare();
		}
		else if(TipEveniment.HACKATHON_ANALIZA_DATE == denumire) {
			return new HackathonAnalizaDeDate();
		}
		return null;
	}

}
