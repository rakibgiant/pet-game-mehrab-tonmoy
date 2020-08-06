package PetGame;
public class Pet {
    private int tiredLevel;
	private int hungryLevel;
	private int cutenessLevel;
	private int awesomeLevel;
	private String eyeColor;
	private String name;
	
	public Pet(String n,int hl, int tl, int cl,int al, String ec) {
		name = n;
		tiredLevel = tl;
		hungryLevel = hl;
		cutenessLevel = cl;
		awesomeLevel = al;
		eyeColor = ec;
	}
	public void attack(){
		System.out.println("attacking...");
	}
	public void eat(){
		System.out.println("eating...");
	
	}
	public void rest(){
		System.out.println("resting...");
	
	}
	
	public int getTiredLevel() {
		return tiredLevel;
	}
	public int getHungryLevel() {
		return hungryLevel;
	}
	public int getCutenessLevel() {
		return cutenessLevel;
	}
	public int getAwesomeLevel() {
		return awesomeLevel;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public String getName() {
		return name;
	}
}