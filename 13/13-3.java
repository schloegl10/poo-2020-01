import java.util.Scanner;
import  java.util.List;
import  java.util.ArrayList;
import java.io.*;
class arvore {
    char valor;
    arvore direita;
    arvore esquerda;
}
public class Main {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int indexadorPre = 0;
    static void imprimePosordem(arvore Tree)
    {
        if (Tree == null) {
            return;
        }
        imprimePosordem(Tree.esquerda);
        imprimePosordem(Tree.direita);
        System.out.print(Tree.valor);

    }
    static int procura(String inOrdem,char alvo,int left, int right){

        for(int i = left ; i <= right ; i++){

            if(alvo == inOrdem.charAt(i)){

                return i;

            }

        }

        return right;

    }



    static arvore pos_ordem(String preOrdem, String inOrdem, int left, int right){

        if(left > right) {
            return null;
        }
        arvore arvoreTemp = new arvore();
        arvoreTemp.valor = preOrdem.charAt(indexadorPre++);
        if(left == right){
            return arvoreTemp;
        }

        int indexadorIn = procura(inOrdem,arvoreTemp.valor,left,right);

        arvoreTemp.esquerda = pos_ordem(preOrdem,inOrdem,left,indexadorIn-1);

        arvoreTemp.direita = pos_ordem(preOrdem,inOrdem,indexadorIn+1,right);

        return arvoreTemp;

    }



    public static void main(String args[]) throws IOException {
        List<String> entradas = new ArrayList<String>();
        String entrada = "";
        arvore Tree = new arvore();
        char erro = 1;
        try {
            while(br.ready()) {
                entrada = br.readLine();
                erro = entrada.charAt(0);
                entradas.add(entrada);
            }
        } catch (Exception e) {

        }
        int C = entradas.size();
        for(int i = 0 ; i < C ; i++){

            String preOrdem, inOrdem;
            String[] resultado = entradas.get(i).split(" ");
            preOrdem = resultado[0];
            inOrdem = resultado[1];
            indexadorPre=0;
            int tamanho = preOrdem.length() - 1;
            Tree = pos_ordem(preOrdem,inOrdem,0,tamanho);
            imprimePosordem(Tree);
            System.out.print("\n");
        }
    }
}