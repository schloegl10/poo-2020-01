import java.util.ArrayList;
public class TestaAnimais{

    private void executaOperacao(ArrayList<Animal> animais, Operacao op) {
        for(Animal animal: animais) {
            op.executa(animal);
        }
    }
    public static void main(String args[]) {
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.set(0, new Sapo());
        animais.set(1, new Boi());
        animais.set(2, new Cachorro());
        executaOperacao(animais, new ExibeSonsAnimais());
        executaOperacao(animais, new IdadeMedia());
    }
}
