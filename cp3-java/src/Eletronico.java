class Eletronico extends Produto {
    private String categoria;
    private String fabricante;

    public Eletronico(String nome, String descricao, double preco, int quantidadeEmEstoque, String categoria, String fabricante) {
        super(nome, descricao, preco, quantidadeEmEstoque);
        this.categoria = categoria;
        this.fabricante = fabricante;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        System.out.println("Categoria: " + categoria);
        System.out.println("Fabricante: " + fabricante);
    }
}