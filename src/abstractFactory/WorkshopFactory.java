package abstractFactory;

public class WorkshopFactory extends AbstractFactory{

	@Override
	public Eveniment getEveniment(TipEveniment denumire) {
		if(TipEveniment.WORKSHOP_TEHNOLOGIE == denumire) {
			return new WorkshopTehnologie();
		}
		else if(TipEveniment.WORKSHOP_SANATATE == denumire) {
			return new WorkshopSanatate();
		}
		else if(TipEveniment.WORKSHOP_MEDIU == denumire) {
			return new WorkshopMediu();
		}
		return null;
	}
	
}
