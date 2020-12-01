package _11;

import java.util.ArrayList;

public class Pessoa {
   String nome;
    ArrayList<Telefone> telefones = new ArrayList<Telefone>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void adicionaTelefone(Telefone telefone) {
        boolean adiciona = true;
        for(int cont = 0; cont < telefones.size(); cont++){
           if(telefones.get(cont).numero == telefone.numero) {
               adiciona = false;
           }
       }
        if(adiciona) {
            telefones.add(telefone);
        }
   }

    public void removeTelefone(Telefone telefone) {

        for (int cont = 0; cont < telefones.size(); cont++) {
            if (telefones.get(cont).numero == telefone.numero) {
                telefones.remove(cont);
            }
        }
    }

        @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}
