package dekorator;

public class LakierowanieOsobowego implements LakierowanieSamochodu{
	String opis = "Lakierowanie samochodu osobowego";
	double cena = 3750;
	@Override
	public String getOpis() {
		return opis;
	}

	@Override
	public double getCena() {
		return cena;
	}

}
