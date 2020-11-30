package _09;

public class TestaAnimal {
    public static void main(String args[]) {
        Animal vaca = new Animal("Vaca");
        Animal cao = new Animal("cao");
        Animal gato = new Animal("gato");
        Animal elefante = new Animal("elefante");
        Animal pombo = new Animal("pombo");
        Animal macaco = new Animal("macaco");
        Animal rato = new Animal("rato");

        vaca.adicionaAmigo(vaca);
        cao.adicionaAmigo(gato);
        gato.adicionaAmigo(vaca);
        elefante.adicionaAmigo(pombo);
        pombo.adicionaAmigo(vaca);
        macaco.adicionaAmigo(vaca);
        rato.adicionaAmigo(macaco);

        System.out.println("Amigos de vaca: " + vaca.amigosAnimal());
        System.out.println("Amigos de rato: " + rato.amigosAnimal());
        pombo.removeAmigo(vaca);
        System.out.println("Amigos de pombo: " + pombo.amigosAnimal());
        System.out.println("Amgos de rato: " + rato.amigosAnimal());

    }
}
