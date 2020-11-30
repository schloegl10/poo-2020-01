package _09;

import java.util.Map;

public class Animal {
    private String nome;
    private Map amigos;

    public Animal(String nome, Map amigos) {
        this.nome = nome;
        this.amigos = amigos;
    }

    public String amigosAnimal() {
        return amigos.toString();
    }

    public void adicionaAmigo(Animal amigo) {
        if(!amigos.containsKey(amigo.getNome())) {
            amigos.put(amigo.getNome(), amigo);
            amigo.adicionaAmigo(this);
        }
    }

    public void removeAmigo(Animal amigo) {
        if(amigos.containsKey(amigo.getNome())) {
            removeAmigo(amigo.getNome());
            amigo.removeAmigo(this);
        }
    }

    public void removeAmigo(String nomeAmigo) {
        amigos.remove(nomeAmigo);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
