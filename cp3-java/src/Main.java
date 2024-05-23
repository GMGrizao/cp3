import br.com.fiap.loja.Eletronico;
import br.com.fiap.loja.Livro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Pre-instanciando produtos
        Livro livro = new Livro("Café com Deus pai", "Um livro onde você irá tomar café com Deus", 50.00, 55, "Junior Rostirola", "Vida");
        Eletronico eletronico = new Eletronico("iPhone 15 Pro Max", "Último iPhone lançado!", 7000.00, 15, "Celular", "Apple");

        // Exibindo informações do livro
        JOptionPane.showMessageDialog(null, "Informações do livro:\n" +
                "Nome: Café com Deus Pai\n" + "Descrição: Um livro onde você irá tomar café com Deus\n" +
                "Preço: 50.0\n" + "Quantidade em Estoque: 55\n" + "Autor: Junior Rostirola\n" +
                "Editora: Vida");

        // Aplicando descontos para o livro
        String cupomLivro = JOptionPane.showInputDialog(null, "Insira o código de desconto para o livro: ");
        double precoComDescontoLivro = livro.calcularDescontoPorCupom(cupomLivro);
        JOptionPane.showMessageDialog(null, "Preço do br.com.fiap.loja.Livro com desconto por cupom: " + precoComDescontoLivro);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar o desconto padrão?", "Desconto Padrão", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            precoComDescontoLivro = livro.calcularDescontoPadrao();
            JOptionPane.showMessageDialog(null, "Preço do br.com.fiap.loja.Livro com desconto padrão: " + precoComDescontoLivro);
        }

        resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar um desconto por porcentagem?", "Desconto Por Porcentagem", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            String porcentagemStr = JOptionPane.showInputDialog(null, "Informe a porcentagem de desconto: ");
            double porcentagemDescontoLivro = Double.parseDouble(porcentagemStr);
            precoComDescontoLivro = livro.calcularDescontoPorPorcentagem(porcentagemDescontoLivro);
            JOptionPane.showMessageDialog(null, "Preço do br.com.fiap.loja.Livro com " + porcentagemDescontoLivro + "% de desconto: " + precoComDescontoLivro);
        }

        //Exibindo informações do eletrônico
        JOptionPane.showMessageDialog(null, "Informações do Eletrônico:\n" +
                "Nome: Iphone 15 Pro Max\n" + "Descrição: Último iPhone lançado!\n" +
                "Preço: 7000.0\n" + "Quantidade em Estoque: 15\n" + "Categoria: Celular\n" +
                "Fabricante: Apple");

        // Aplicando descontos para o eletrônico
        String cupomEletronico = JOptionPane.showInputDialog(null, "Insira o código de desconto para o eletrônico: ");
        double precoComDescontoEletronico = eletronico.calcularDescontoPorCupom(cupomEletronico);
        JOptionPane.showMessageDialog(null, "Preço do Eletrônico com desconto por cupom: " + precoComDescontoEletronico);

        resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar o desconto padrão?", "Desconto Padrão", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            precoComDescontoEletronico = eletronico.calcularDescontoPadrao();
            JOptionPane.showMessageDialog(null, "Preço do Eletrônico com desconto padrão: " + precoComDescontoEletronico);
        }

        resposta = JOptionPane.showConfirmDialog(null, "Deseja aplicar um desconto por porcentagem?", "Desconto Por Porcentagem", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            String porcentagemStr = JOptionPane.showInputDialog(null, "Informe a porcentagem de desconto: ");
            double porcentagemDescontoEletronico = Double.parseDouble(porcentagemStr);
            precoComDescontoEletronico = eletronico.calcularDescontoPorPorcentagem(porcentagemDescontoEletronico);
            JOptionPane.showMessageDialog(null, "Preço do Eletrônico com " + porcentagemDescontoEletronico + "% de desconto: " + precoComDescontoEletronico);
        }
    }
}