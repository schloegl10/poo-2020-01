package _12;

import java.util.Calendar;

public class TestaLocacao {
    public static void main(String args[]) {
        Motorista motorista = new Motorista("Speed", "Racer");
        Carro carro = new Carro("GYM 1234");
        Calendar calendarioinicio = Calendar.getInstance();
        Calendar calendariofim = Calendar.getInstance();
        calendarioinicio.set(1999,07,01);
        calendariofim.set(2020,12,01);
        Locacao locacao = new Locacao(calendarioinicio.getTime(), motorista, 0.0, carro, 12.0,1.0);
        locacao.setDataFinal(calendariofim.getTime());
        locacao.setQuilometragemFim(10000000);
        motorista = new Motorista("Rubinho", "Barriquelo");
        carro = new Carro("BRB 4321");
        calendarioinicio.set(2020,11,25);
        calendariofim.set(2020,12,01);
        Locacao locacao2 = new Locacao(calendarioinicio.getTime(), motorista, 0.0, carro, 1.0,10.0);
        System.out.println(locacao);
        System.out.println(locacao2);
    }
}

