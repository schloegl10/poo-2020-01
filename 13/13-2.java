import java.util.Scanner;
import  java.util.List;
import  java.util.ArrayList;
import java.io.*;
public class Exponencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o numero:");
            int primeiro = sc.nextInt();
            int resultado = 1;
            System.out.println("Digite expoente do numero ( intiero >= 0):");
            int expoente = sc.nextInt();
            for (int cont = 0; cont < expoente; cont++) {
                resultado = resultado*primeiro;
            }
            System.out.printf("Soma: %d", resultado);
        } catch (Exception e) {
            System.out.println("Foi digitado algo invalido!");
        }
    }
}