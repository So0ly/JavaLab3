package dekorator;

public class OpcjaZChromowaniem extends OpcjaLakierowania{
	String opis = ", z chromowaniem";
	double cena = 2000;
	public OpcjaZChromowaniem(LakierowanieSamochodu lakierowanie){ 
		super(lakierowanie);
	}
	@Override
	public double getCena() {
		return super.getCena() + cena;
	}
	@Override
	public String getOpis() {
		return super.getOpis() + opis;
	}
}
