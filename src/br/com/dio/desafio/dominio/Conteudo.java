package br.com.dio.desafio.dominio;

public abstract class Conteudo {

     //controlador de acesso => protected static
    //criar uma constante XP_PADRAO
    //Utilizar final e tipo double

    protected  static double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //metodo abstrato
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
