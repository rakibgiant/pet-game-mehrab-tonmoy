package PetGame;

public class Cat extends Pet {
    public Cat(String n,int hl, int tl, int cl,int al, String ec) {
		super(n,hl,tl,cl,al,ec);
	}
	public void awesome(){
		System.out.println("being more awesome than dog...");
	} 
}