package dekorator;

public abstract class OpcjaLakierowania implements LakierowanieSamochodu{
	
	private LakierowanieSamochodu lakierowanie;
	public OpcjaLakierowania(LakierowanieSamochodu lakierowanie) {
		this.lakierowanie = lakierowanie;
	}
	@Override
	public String getOpis() {
		return lakierowanie.getOpis();
	}

	@Override
	public double getCena() {
		return lakierowanie.getCena();
	}

}
