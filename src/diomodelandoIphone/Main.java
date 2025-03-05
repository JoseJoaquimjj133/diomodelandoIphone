package diomodelandoIphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("=== Teste do Reprodutor Musical ===");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");

        System.out.println("\n=== Teste do Aparelho Telefônico ===");
        meuIphone.ligar("(11) 98765-4321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n=== Teste do Navegador Internet ===");
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}