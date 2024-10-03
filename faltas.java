import java.util.Scanner;

public class faltas {
    public static void main(String[] args) throws Exception {
        float faltas;
        float umaAula;
        float cargaHoraria;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("qual a carga horária da matéria? digite apenas numeros.");
        cargaHoraria = sc1.nextInt();

        System.out.println("nesta matéria, quantas horas um dia de aula possui? digite apeans numeros");
        umaAula = sc1.nextInt();

        System.out.println("qual a taxa de presença do seu curso? digite sem o %");
        float presenca = sc1.nextInt();

        float diasAula = (cargaHoraria / umaAula);
        float diasObrigatorios = diasAula * (presenca / 100);
        float diasFalta = diasAula - diasObrigatorios;

        System.out.println("\nesta matéria possui "+ diasAula +" dias de aula.\n");
        System.out.println("é obrigatório participar apenas de "+ diasObrigatorios +" dias.");
        System.out.println("voce pode faltar no total "+ diasFalta +" vezes.\n");
        

        System.out.println("quantas vezes você já faltou, ou pretente faltar? apenas numeros");
        faltas = sc1.nextInt();

        System.out.println("você ainda pode faltar "+ (diasFalta - faltas) +" dias.");


    }

}