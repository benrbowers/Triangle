public class Main {
	public static void main(String[] args) {
		Triangle tri1 = new Triangle();
		Triangle tri2 = new Triangle(2.0, 1.0, 1.0); // "Flat" triangle. Should have 0 area
		Triangle tri3 = new Triangle(2.0, 2.0, 1.0);

		System.out.printf(tri1.toString() + " has an area of %.2f.\n", tri1.getArea());
		System.out.printf(tri2.toString() + " has an area of %.2f.\n", tri2.getArea());
		System.out.printf(tri3.toString() + " has an area of %.2f.\n", tri3.getArea());
	}
}
