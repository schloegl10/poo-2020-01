package _13;

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
    private boolean segundaLocacao;



    public Locacao(Date dataInicial, Motorista motorista, double quilometragemInic, Carro carro, double precoKm, double precoDia, boolean segundaLocacao) {
        this.dataInicial = dataInicial;
        this.motorista = motorista;
        this.quilometragemInic = quilometragemInic;
        this.carro = carro;
        this.precoKm = precoKm;
        this.precoDia = precoDia;
        this.segundaLocacao = segundaLocacao;
    }

    public boolean compativel(Motorista motorista, Carro carro) {
        if((motorista.getCarteira() == Motorista.Carteira.C) || (motorista.getCarteira() == Motorista.Carteira.D)+(motorista.getCarteira() == Motorista.Carteira.C)) {
            return true;
        } else if((motorista.getCarteira() == Motorista.Carteira.A)) {
            return false;
        } else {
            if(Carro.Tipo.PASSEIOSIMPLES == carro.getTipo()) {
                return true;
            } else if(Carro.Tipo.PASSEIOSUPERLUXO == carro.getTipo()) {
                return true;
            } else if(Carro.Tipo.PASSEIOLUXO == carro.getTipo()) {
                return true;
            } else {
                return false;
            }
        }
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
        double preco = ((quilometragemFim - quilometragemInic) * precoKm) + (((dataFinal.getTime() - dataInicial.getTime()) / (1000 * 60 * 60 * 24)) * precoDia);
        double precoFinal = preco;
        if(carro.getTipo() == Carro.Tipo.PASSEIOSIMPLES) {
            precoFinal = preco;
        }
        if(carro.getTipo() == Carro.Tipo.PASSEIOLUXO) {
            precoFinal = precoFinal + preco * 0.1;
        }
        if(carro.getTipo() == Carro.Tipo.PASSEIOSUPERLUXO) {
            precoFinal = precoFinal + preco * 0.2;
        }
        if(carro.getTipo() == Carro.Tipo.UTILITARIO) {
            precoFinal = precoFinal + preco * 0.15;
        }
        if(motorista.getAnosDeEmpresa() >= 5) {
            precoFinal = precoFinal + preco * 0.05;
        }
        if(segundaLocacao) {
            precoFinal = precoFinal - preco * 0.1;
        }
        return precoFinal;
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
