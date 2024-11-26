package src;

public class Aims {

	public static void main(String[] args) {

		Cart CrCart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f, 3);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f, 4);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f, 5);

		CrCart.addDigitalVideoDisc(dvd1);
		CrCart.addDigitalVideoDisc(dvd3);
		CrCart.listDvd();
		System.out.println(CrCart.qtyOrdered);
		CrCart.removeDigitalVideoDisc(dvd1);
		System.out.println(CrCart.qtyOrdered);
		CrCart.listDvd();
// Print total cost of the items in the cart

	}

}
