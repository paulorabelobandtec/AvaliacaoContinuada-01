package br.com.bandtec.avalicaocontinuada1;

public class JogoPs4 extends Jogos {

    private Double valor, porcentagemVenda;

    public JogoPs4(String nome, Integer condigo, Integer quantidade, Double valor, Double porcentagemVenda) {
        super(nome, condigo, quantidade);
        this.valor = valor;
        this.porcentagemVenda = 0.3;
    }

    @Override
    public Double getCalculaValor() {
        return valor * porcentagemVenda;
    }

    @Override
    public String toString() {
        return "JogoPs4{" +
                "valor=" + valor +
                ", porcentagemVenda=" + porcentagemVenda +
                "} " + super.toString();
    }

    public Double getValor() {
        return valor;
    }

    public Double getPorcentagemVenda() {
        return porcentagemVenda;
    }
}
