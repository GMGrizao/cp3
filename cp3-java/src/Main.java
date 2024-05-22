import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pre-instanciando produtos
        Livro livro = new Livro("Java Programming", "A comprehensive guide to Java", 150.00, 55, "John Doe", "TechBooks");
        Eletronico eletronico = new Eletronico("Smartphone", "Latest model with advanced features", 1200.00, 15, "Mobile", "TechCorp");

        // Exibindo informações dos produtos
        System.out.println("\nInformações do Livro:");
        livro.exibirInformacoes();

        System.out.println("\nInformações do Eletrônico:");
        eletronico.exibirInformacoes();

        // Aplicando descontos para o livro
        System.out.print("\nInsira o código de desconto para o livro: ");
        String cupomLivro = scanner.nextLine();
        double precoComDescontoLivro = livro.calcularDescontoPorCupom(cupomLivro);
        System.out.println("Preço do Livro com desconto por cupom: " + precoComDescontoLivro);

        System.out.print("Deseja aplicar o desconto padrão? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            precoComDescontoLivro = livro.calcularDescontoPadrao();
            System.out.println("Preço do Livro com desconto padrão: " + precoComDescontoLivro);
        }

        System.out.print("Deseja aplicar um desconto por porcentagem? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Informe a porcentagem de desconto: ");
            double porcentagemDescontoLivro = scanner.nextDouble();
            precoComDescontoLivro = livro.calcularDescontoPorPorcentagem(porcentagemDescontoLivro);
            System.out.println("Preço do Livro com " + porcentagemDescontoLivro + "% de desconto: " + precoComDescontoLivro);
            scanner.nextLine(); // Consume newline
        }

        // Aplicando descontos para o eletrônico
        System.out.print("\nInsira o código de desconto para o eletrônico: ");
        String cupomEletronico = scanner.nextLine();
        double precoComDescontoEletronico = eletronico.calcularDescontoPorCupom(cupomEletronico);
        System.out.println("Preço do Eletrônico com desconto por cupom: " + precoComDescontoEletronico);

        System.out.print("Deseja aplicar o desconto padrão? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            precoComDescontoEletronico = eletronico.calcularDescontoPadrao();
            System.out.println("Preço do Eletrônico com desconto padrão: " + precoComDescontoEletronico);
        }

        System.out.print("Deseja aplicar um desconto por porcentagem? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Informe a porcentagem de desconto: ");
            double porcentagemDescontoEletronico = scanner.nextDouble();
            precoComDescontoEletronico = eletronico.calcularDescontoPorPorcentagem(porcentagemDescontoEletronico);
            System.out.println("Preço do Eletrônico com " + porcentagemDescontoEletronico + "% de desconto: " + precoComDescontoEletronico);
        }

        scanner.close();
    }
}