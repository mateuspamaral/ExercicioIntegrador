package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Livraria {
    //Variables
    private Map<Integer, Livro> livros = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private Integer key;
    private Integer qnt;

    //Methods
    public void adicionarLivro(Livro livro){
        livros.put(livro.getCodigo(),livro);
    }

    public void cadastrarLivro() {
        Integer codigo;
        String titulo;
        String autor;
        Integer anoLancamento;
        String codigoISBN;
        Integer quantidadeEstoque;
        Double preco;

        try {
            System.out.print("Digite o código do livro:");
            codigo = scanner.nextInt();
            System.out.print("Digite o titulo do livro:");
            titulo = scanner.next();
            System.out.print("Digite o autor do livro:");
            autor = scanner.next();
            System.out.print("Digite o ano de lancaçamento:");
            anoLancamento = scanner.nextInt();
            System.out.print("Digite o código ISBN:");
            codigoISBN = scanner.next();
            System.out.print("Digite a quantidade que teremos no estoque:");
            quantidadeEstoque = scanner.nextInt();
            System.out.print("Digite o valor do livro:");
            preco = scanner.nextDouble();

            Livro livro = new Livro(codigo, titulo, autor, anoLancamento, codigoISBN, quantidadeEstoque, preco);

            livros.put(codigo, livro);
        }catch (Exception ex){
            System.out.println("Digite os dados novamente.");
        }
    }

    public void consultaLivro() {
        System.out.print("Digite o código do livro que deseja pesquisar:");
        try {
            key = scanner.nextInt();
            System.out.println(livros.get(key).toString());
        } catch (Exception ex) {
            System.out.println("Por favor, digite um código de livro existente.");
        }

    }

    public void vendeLivro() {
        System.out.print("Digite o código do livro que será vendido:");
        try {
            key = scanner.nextInt();
            qnt = livros.get(key).getQuantidadeEstoque();
            if (qnt < 1) {
                System.out.println("Estoque esgotado.");
            } else {
                qnt--;
                livros.get(key).setQuantidadeEstoque(qnt);
                System.out.println(livros.get(key).toString());
            }
        } catch (Exception ex) {
            System.out.println("Por favor, digite um código de livro existente.");
        }
    }
}
