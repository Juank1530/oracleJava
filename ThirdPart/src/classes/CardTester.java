package classes;

public class CardTester {

	public static void main(String[] args) {
		
		int suitNumber = (int)(Math.random()*4.0+1);
		int faceNumber = (int)(Math.random()*13.0+1);
		Card newCard = new Card(suitNumber,faceNumber);
		System.out.println(newCard);
		int suitNumber2 = (int)(Math.random()*4.0+1);
		int faceNumber2 = (int)(Math.random()*13.0+1);
		Card newCard2 = new Card(suitNumber2,faceNumber2);
		System.out.println(newCard2);

	}

}
