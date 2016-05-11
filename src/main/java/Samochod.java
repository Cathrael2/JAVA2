import java.util.ArrayList;
import java.util.List;


public class Samochod {
	//to jest komentarz
	private List<String> wyposazenie;
	private String model;
	
	public Samochod() {
        super();
        wyposazenie = new ArrayList<String>();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("to jest samochod");
	}
	
	public void setModel(String model) {
        this.model = model;
    }
	
	public List<String> getWyposazenie() {
        return wyposazenie;
    }

	public void addWyposazenie(String opcja) {
		// TODO Auto-generated method stub
		this.wyposazenie.add(opcja);
	}
	
	public String getModel() {
        return model;
    }

}

