import java.util.Scanner;

public class exercicioOperadores2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual � o dia: ");
        String dia = input.next();

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;

            case "Ter�a":
                System.out.println(3);
                break;

            case "Quarta":
                System.out.println(4);
                break;

            case "Quinta":
                System.out.println(5);
                break;

            case "Sexta":
                System.out.println(6);
                break;

            case "Sabado":
                System.out.println(7);;
                break;

            case "Domingo":
                System.out.println(1);
                break;

            default:
                System.out.println("Dia inv�lido");
                break;
        }

    }
}