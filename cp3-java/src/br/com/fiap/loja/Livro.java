package br.com.fiap.loja;

class Livro extends Produto {
    private String autor;
    private String editora;

    public Livro(String nome, String descricao, double preco, int quantidadeEmEstoque, String autor, String editora) {
        super(nome, descricao, preco, quantidadeEmEstoque);
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
    }
}