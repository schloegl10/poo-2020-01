public class IdadeMedia implements Operacao {
    public void executa(Object obj) {
        System.out.println(((Animal)obj).idadeMedia());
    }
}