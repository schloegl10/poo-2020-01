public class ExibeSonsAnimais implements Operacao {
    public void executa(Object obj) {
        System.out.println(((Animal)obj).som());
    }
}