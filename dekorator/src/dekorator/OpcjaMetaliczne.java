package dekorator;

public class OpcjaMetaliczne extends OpcjaLakierowania{
	String opis = ", metaliczne";
	double cena = 600;
	public OpcjaMetaliczne(LakierowanieSamochodu lakierowanie){ 
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
