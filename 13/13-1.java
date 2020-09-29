import java.util.Scanner;
import  java.util.List;
import  java.util.ArrayList;
import java.io.*;
public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro numero:");
            int primeiro = sc.nextInt();
            System.out.println("Digite o segundo numero:");
            int segundo = sc.nextInt();
            int soma = primeiro + segundo;
            System.out.printf("Soma: %d", soma);
        } catch (Exception e) {
            System.out.println("Foi digitado algo invalido!");
        }
    }
}