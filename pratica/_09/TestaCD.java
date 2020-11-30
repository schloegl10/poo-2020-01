package _09;

import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class TestaCD {
    public static void main(String args[]) {
        Pessoa cantor = new Pessoa("Nome");
        ArrayList<Pessoa> cantorList = new ArrayList<Pessoa>();
        cantorList.add(cantor);
        CD cd = new CD(new Date(), "CD", cantorList);

        cd.adicionaCantor(cantor);
        System.out.println(cd);
    }
}
