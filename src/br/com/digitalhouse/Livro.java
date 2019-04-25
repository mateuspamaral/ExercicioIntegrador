package br.com.digitalhouse;

public class Livro {
    //Attributes
    private Integer codigo;
    private String titulo;
    private String autor;
    private Integer anoLancamento;
    private String codigoISBN;
    private Integer quantidadeEstoque;
    private Double preco;

    //Constructors
    public Livro() {

    }

    public Livro(Integer codigo, String titulo, String autor, Integer anoLancamento, String codigoISBN, Integer quantidadeEstoque, Double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    //Getters & Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "Codigo: " + codigo +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nAno de Lançamento: " + anoLancamento +
                "\nCódigo ISBN: " + codigoISBN +
                "\nQuantidade no estoque: " + quantidadeEstoque +
                "\nPreço: " + preco;
    }
}

