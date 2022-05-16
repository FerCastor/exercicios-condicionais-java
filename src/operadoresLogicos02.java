public class operadoresLogicos02 {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true: " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1): " + ((i1 > i2) || (f2 < f1)));

    }
}
