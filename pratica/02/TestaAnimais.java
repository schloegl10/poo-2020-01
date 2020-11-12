import java.util.ArrayList;
public class TestaAnimais {
    public static void main(String args[]) {
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.set(0, new Sapo());
        animais.set(1, new Boi());
        animais.set(2, new Cachorro());
        for(Animal animal: animais) {
            System.out.println(animal.som());
        }
    }
}
