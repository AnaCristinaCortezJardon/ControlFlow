import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("¿Cuál es tu edad?: ");
	int age = in.nextInt();
	float ticketPrice = 7F;
	
	if (age >= 60) {
		ticketPrice *= 0.45F;
	} else if (age<= 5) {
		ticketPrice *= 0.40F;
	} else if (age > 5 && age < 60) {
	}
System.out.println("El costo de tu entrada es: € " + ticketPrice);
in.close();
	}
}
