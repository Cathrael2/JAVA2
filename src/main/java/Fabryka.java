import java.util.Iterator;


public class Fabryka {
	SamochodBuilder builder;
	
	public void prepareCar(SamochodBuilder builder) {
        this.builder = builder;
    }
	
	public Samochod getCar() {
        builder.setModel();
        builder.addWyposazenie();
        return builder.getSamochod();
    }
	
    @SuppressWarnings("rawtypes")
	public void printFaktura(Samochod s) {
        System.out.println(s.getModel());
        Iterator it = s.getWyposazenie().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
