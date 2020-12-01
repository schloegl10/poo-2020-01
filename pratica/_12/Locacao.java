package _12;

import java.util.Date;

public class Locacao {
    private Date dataInicial;
    private Date dataFinal;
    private Motorista motorista;
    private double quilometragemInic;
    private double quilometragemFim;
    private Carro carro;
    private double precoKm;
    private double precoDia;

    public Locacao(Date dataInicial, Motorista motorista, double quilometragemInic, Carro carro, double precoKm, double precoDia) {
        this.dataInicial = dataInicial;
        this.motorista = motorista;
        this.quilometragemInic = quilometragemInic;
        this.carro = carro;
        this.precoKm = precoKm;
        this.precoDia = precoDia;
    }

    public double getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(double precoKm) {
        this.precoKm = precoKm;
    }

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }


    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public double getQuilometragemInic() {
        return quilometragemInic;
    }

    public void setQuilometragemInic(double quilometragemInic) {
        this.quilometragemInic = quilometragemInic;
    }

    public double getQuilometragemFim() {
        return quilometragemFim;
    }

    public void setQuilometragemFim(double quilometragemFim) {
        this.quilometragemFim = quilometragemFim;
    }

    public double custo() {
        return ((quilometragemFim - quilometragemInic)*precoKm) + (((dataFinal.getTime() - dataInicial.getTime())/(1000*60*60*24))*precoDia);
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", motorista=" + motorista +
                ", quilometragemInic=" + quilometragemInic +
                ", quilometragemFim=" + quilometragemFim +
                ", carro=" + carro +
                ", precoKm=" + precoKm +
                ", precoDia=" + precoDia +
                '}';
    }
}
