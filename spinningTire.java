package spinningTireActivity;

public class Main {

	public static void main(String[] args) {
		int seconds = 60;
		int rotationsPerMinute = 3000;
		int degreesOfTire = 360;
		
		System.out.println("A spinning tire makes 3000 revolutions per minutes.");
		System.out.println("Calculate how many degrees it rotates in one second.");
		
		System.out.println("\n\nFormula: (3000 x 360) / 60");
		System.out.println("3000 - rotations per minute | 1 minute = 60 seconds");
		System.out.println("360° - Tire \n\n");
		
		System.out.println("Answer : " + (rotationsPerMinute * degreesOfTire) / seconds);
		System.out.println("It rotates 18000 degrees in one second");
		
	}

}
