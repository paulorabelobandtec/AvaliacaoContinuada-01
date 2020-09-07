package br.com.bandtec.avalicaocontinuada1;

public class JogoXbox extends Jogos{

    private Double valor, porcentagemVenda;

    public JogoXbox(String nome, Integer condigo, Integer quantidade, Double valor, Double porcentagemVenda) {
        super(nome, condigo, quantidade);
        this.valor = valor;
        this.porcentagemVenda = 0.2;
    }

    @Override
    public Double getCalculaValor() {
        return null;
    }

    @Override
    public String toString() {
        return "JogoXbox{" +
                "valor=" + valor +
                ", porcentagemVenda=" + porcentagemVenda +
                "} " + super.toString();
    }
}
