package dekorator;

public class OpcjaZPlomieniami extends OpcjaLakierowania{
	String opis = ", ozdobione p³omieniami";
	double cena = 1300;
	public OpcjaZPlomieniami(LakierowanieSamochodu lakierowanie){ 
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
