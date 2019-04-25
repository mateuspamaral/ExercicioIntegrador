package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instantiating
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();
        Livraria livraria = new Livraria();
        Integer option = 0;

        //Test
        Livro senhorAneis = new Livro(111, "Senhor dos Aneis", "JJK", 1960, "1234567891234",300,98.80);
        Livro gameThrones = new Livro(222,"Game of Thrones","Velinho Sinistro", 2000,"0987654321098",0,98.32);
        livraria.adicionarLivro(senhorAneis);
        livraria.adicionarLivro(gameThrones);

        while (true) {
            //Greetings
            System.out.println("O que deseja fazer? Digite apenas o número da opção desejada e aperte ENTER.");

            //Menu
            System.out.println("1 - Cadstrar livro\n" +
                                "2 - Consultar livro por codigo\n" +
                                "3 - Efetuar venda\n" +
                                "4 - Sair");

            try {
                option = scanner.nextInt();
            } catch (Exception ex) {
                System.out.println("Por favor digite apenas o número da opção desejada e aperte ENTER.");
                continue;
            }

            switch (option) {
                case 1:
                    livraria.cadastrarLivro();
                    break;
                case 2:
                    livraria.consultaLivro();
                    break;
                case 3:
                    livraria.vendeLivro();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
