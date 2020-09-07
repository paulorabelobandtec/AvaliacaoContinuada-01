package br.com.bandtec.avalicaocontinuada1;

public abstract class Jogos {
    private String nome;
    private Integer condigo;
    private Integer quantidade;


    public Jogos(String nome, Integer condigo, Integer quantidade) {
        this.nome = nome;
        this.condigo = condigo;
        this.quantidade = quantidade;
    }

    public abstract Double getCalculaValor();

    public String getNome() {
        return nome;
    }

    public Integer getCondigo() {
        return condigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", condigo=" + condigo +
                '}';
    }
}
