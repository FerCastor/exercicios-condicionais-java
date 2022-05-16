public class operadoresLogicos03 {

    public static void main(String[] args) {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if (recebeAuxilio){
            System.out.println("Funcionário deve receber o auxílio");
        } else {
            System.out.println("Funcionário não deve receber o auxílio");
        }
    }
}
