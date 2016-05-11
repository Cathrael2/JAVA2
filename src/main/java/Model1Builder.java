

public class Model1Builder implements SamochodBuilder {
	private Samochod auto;
	
	public Model1Builder() {
		auto = new Samochod();
	}
	public void addWyposazenie() {
		// TODO Auto-generated method stub
		auto.addWyposazenie("klimatyzacja");
		auto.addWyposazenie("ABS");
		auto.addWyposazenie("szyberdach");
	}

	public void setModel() {
		// TODO Auto-generated method stub
		auto.setModel("Model nr 1");
	}
	
	public Samochod getSamochod() {
        return auto;
    }
}
