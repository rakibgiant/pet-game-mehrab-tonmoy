package PetGame;

public class Dog extends Pet{

    public Dog(String n, int hl, int tl, int cl, int al, String ec) {
        super(n, hl, tl, cl, al, ec);
        // TODO Auto-generated constructor stub
    }
    public void wag(){
		System.out.println("wagging tail...");
	}
}