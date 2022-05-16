public class operadoresLogicos01 {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // Conjunção
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        // Disjunção
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        // Disjunção exclusiva
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        // Negação
        System.out.println("b1 " + b1);
        System.out.println("!b1 " + !b1);
        System.out.println("b2 " + b2);
        System.out.println("!b2 " + !b2);
    }
}
