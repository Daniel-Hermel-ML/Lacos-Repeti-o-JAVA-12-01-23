/*
package laco.Repeticao;
import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;


        System.out.print("--Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.print("--Digite o segundo número: ");
        num2 = ler.nextInt();

        if (num1 < num2) {
            for (int contador = num1; contador <= num2; contador++){
                if (contador % 3 == 0 && contador % 5 == 0){
                    System.out.println(contador+" é múltiplo de 3 e 5");
                }
            }

        } else {
            System.out.println("Intervalo inválido");
        }




    }
}
//////////////////////////////////////////////////
package laco.Repeticao;
import java.util.*;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, par = 0, impar = 0;

        for (int contador = 1; contador < 11; contador++){
            System.out.print("--Digite o "+contador+"º número: ");
            num = ler.nextInt();

            if (num % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Total de números pares "+par+".");
        System.out.println("Total de números impares "+impar+".");
    }
}
//////////////////////////////////////////////////
package laco.Repeticao;
import java.util.*;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String continua = "s";
        int idade, menor = 0, maior = 0;

        while (!continua.equals("n")){
            System.out.print("--Digite uma idade: ");
            idade = ler.nextInt();
            if (idade < 0){
                System.out.println("--Sistema não aceita idades negativas.");
                System.out.println("--Sistema foi encerrado.");
                continua = "n";
            }else {

                if (idade < 21){
                    menor++;
                }else if (idade > 50){
                    maior++;
                }
                continua = "s";
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: "+menor);
        System.out.println("Total de pessoas maiores de 50 anos: "+maior);
    }
}
//////////////////////////////////////////////
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
/////////////////////////////////////////
package laco.Repeticao;
import java.util.*;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, resultado = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            num = ler.nextInt();
            if (num >= 1){
                resultado = resultado + num;
            }
        }while (num != 0);

        System.out.println("--A soma dos números positivos é: "+resultado);
    }
}
//////////////////////////////////////////
package laco.Repeticao;
import java.util.*;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double contador = 0;
        double num, media = 0, resultado = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            num = ler.nextInt();
            if (num % 3 == 0){
                resultado = resultado + num;
                contador++;
            }else{
                contador--;
            }

        }while (num != 0);
        media = resultado / contador;

        System.out.printf("--A média de todos os números múltiplos de " +
                "3 é: %.2f",media);
    }
}
 */