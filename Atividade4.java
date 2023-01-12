package laco.Repeticao;
import java.util.*;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String continua = "s";
        int homens      = 0;
        int mulheres    = 0;
        int outres      = 0;
        int backend     = 0;
        int frontend    = 0;
        int mobile      = 0;
        int fullStack   = 0;
        int maior       = 0;
        int menor       = 0;


        while (!continua.equals("n")){
            System.out.println("-#--#--#--Seja Bem Vindis--#--#--#-");
            System.out.print("--Informe a sua idade: ");
            int idade = ler.nextInt();
            System.out.println("Com base na tabela informe seu sexo:");
            System.out.println("| 1 - Para Masculino |");
            System.out.println("| 2 - Para Feminino |");
            System.out.println("| 3 - Para Outres |");
            System.out.print("--Digite: ");
            int sexo = ler.nextInt();
            System.out.println("Com base na tabela informe seu cargo:");
            System.out.println("| 1 - Para Backend |");
            System.out.println("| 2 - Para Frontend |");
            System.out.println("| 3 - Para Mobile |");
            System.out.println("| 4 - Para FullStack |");
            System.out.print("--Digite: ");
            int categoria = ler.nextInt();
            System.out.println("--Deseja continuar inserindo dados?");
            System.out.println("| s - Para Sim e continuar |");
            System.out.println("| n - Para Náo e emcerrar a aplicação |");
            System.out.print("--Digite: ");
            continua = ler.next();

            if (sexo == 1 && categoria == 3 && idade > 40){
                maior++;
            }else if (sexo == 2 && categoria == 2){
                frontend++;
            }else
            if (sexo == 2 && categoria == 4 && idade < 30){
                menor++;
            }else
            if (categoria == 1){
                backend++;
            }else
            if (frontend == 2){
            frontend++;
            }
        }
        System.out.println("Total de pessoas desenvolvedoras Backend: "+backend);
        System.out.println("Total de mulheres desenvolvedoras Frontend: "+frontend);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 " +
                "anos: "+maior);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 " +
                "anos: "+menor);
    }
}
