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
