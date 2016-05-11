
public class Model2Builder implements SamochodBuilder {
	private Samochod auto;
	
	public Model2Builder() {
		auto = new Samochod();
	}
	public void addWyposazenie() {
		// TODO Auto-generated method stub
		auto.addWyposazenie("niepotrzeba przemoc");
		auto.addWyposazenie("GPS");
		auto.addWyposazenie("radio");
	}

	public void setModel() {
		// TODO Auto-generated method stub
		auto.setModel("Model nr 2");
	}
	
	public Samochod getSamochod() {
        return auto;
    }
}
