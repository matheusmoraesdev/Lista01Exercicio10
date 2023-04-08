import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
      double graus_f;
      
      Scanner reader = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
            double graus_c = reader.nextDouble();

        graus_f = (graus_c * 1.8) + 32;

        System.out.print("O resultado é " + graus_f + "° graus Fahrenheit!");
    }
}
