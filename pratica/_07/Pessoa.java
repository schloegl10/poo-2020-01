package _07;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private String corDosOlhos;
    private String corDaPele;
    private String corDoCabele;
    private double pesoKG;
    private double alturaM;
    private String nomePai;
    private String nomeMae;
    private String localNascimento;
    private Identidade identidade;
    private Passaporte passaporte;
    private Endereco endereco;

    public Pessoa(String nome, int anoNascimento, int mesNascimento, int diaNascimento, String corDosOlhos, String corDaPele, String corDoCabele, float pesoKG, float alturaM, String nomePai, String nomeMae, String localNascimento, Identidade identidade, Passaporte passaporte, Endereco endereco) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
        this.corDosOlhos = corDosOlhos;
        this.corDaPele = corDaPele;
        this.corDoCabele = corDoCabele;
        this.pesoKG = pesoKG;
        this.alturaM = alturaM;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.localNascimento = localNascimento;
        this.identidade = identidade;
        this.passaporte = passaporte;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public String getCorDoCabele() {
        return corDoCabele;
    }

    public void setCorDoCabele(String corDoCabele) {
        this.corDoCabele = corDoCabele;
    }

    public double getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(float pesoKG) {
        this.pesoKG = pesoKG;
    }

    public double getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(float alturaM) {
        this.alturaM = alturaM;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public Passaporte getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(Passaporte passaporte) {
        this.passaporte = passaporte;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "\nnome='" + nome + '\'' +
                ", \nanoNascimento=" + anoNascimento +
                ", \nmesNascimento=" + mesNascimento +
                ", \ndiaNascimento=" + diaNascimento +
                ", \ncorDosOlhos='" + corDosOlhos + '\'' +
                ", \ncorDaPele='" + corDaPele + '\'' +
                ", \ncorDoCabele='" + corDoCabele + '\'' +
                ", \npesoKG=" + pesoKG +
                ", \nalturaM=" + alturaM +
                ", \nnomePai='" + nomePai + '\'' +
                ", \nnomeMae='" + nomeMae + '\'' +
                ", \nlocalNascimento='" + localNascimento + '\'' +
                ", \nidentidade=" + identidade +
                ", \npassaporte=" + passaporte +
                ", \nendereco=" + endereco +
                '}';
    }
}
