import java.util.Scanner;

public class CommissionCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la cantidad que vendiste: ");
        int sales = in.nextInt();
        float comission = 0; 

        if (sales <= 1000) {
            comission = 0;
        } else if (sales >= 1001 && sales <= 4999) {
            comission = sales * 0.1F;
        } else if (sales >= 5000 && sales <= 9999) {
            comission = sales * 0.2F; 
        } else if (sales >= 10000) {
            comission = sales * 0.3F; 
        }

        System.out.println("Tu comisión a recibir es: $ " + comission);
        in.close();
    }
}