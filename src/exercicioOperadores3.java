import java.util.Scanner;

public class exercicioOperadores3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um número entre 1 e 5: ");
        int numero = input.nextInt();

        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;

            case 4:
                System.out.println("Errado");
                break;

            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Inválido");
                break;
        }
    }
}
