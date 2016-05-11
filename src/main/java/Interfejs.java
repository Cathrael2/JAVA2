
public class Interfejs  {
	public void mow()
	{
		System.out.println("Czeœæ!");
		System.out.println("Rozdajemy za darmo samochody no prawie");
		System.out.println("a teraz zobacz jaka mamy oferte");
		oferta();
	}
	public void oferta()
	{
		Samochod s;
		Fabryka fabryka = new Fabryka();
		fabryka.prepareCar(new Model1Builder());
		s = fabryka.getCar();
		System.out.println(s.getModel());
		fabryka.prepareCar(new Model2Builder());
		s = fabryka.getCar();
		System.out.println(s.getModel());
	}
}
