abstract class Produto {
    protected String nome;
    protected String descricao;
    protected double preco;
    protected int quantidadeEmEstoque;

    public Produto(String nome, String descricao, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double calcularDescontoPadrao() {
        if (this.quantidadeEmEstoque > 50 && this instanceof Livro) {
            return this.preco * 0.90;
        } else if (this.quantidadeEmEstoque > 10) {
            return this.preco * 0.95;
        } else {
            return this.preco;
        }
    }

    public double calcularDescontoPorPorcentagem(double porcentagem) {
        return this.preco * ((100 - porcentagem) / 100);
    }

    public double calcularDescontoPorCupom(String cupom) {
        switch (cupom) {
            case "BEMVINDO":
                return this.preco * 0.60;
            case "NERD":
                if (this instanceof Eletronico) {
                    return this.preco * 0.80;
                }
            default:
                return this.preco;
        }
    }

    public abstract void exibirInformacoes();
}