public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();


        System.out.println("Função Telefone");

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Função Reprodutor de Música");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("Função Navegador Web");

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();


    }
}
