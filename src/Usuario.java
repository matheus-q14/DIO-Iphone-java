public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Funções telefone
        iphone.gravarCorreioVoz("Gravando mensagem de voz pelo iphone");
        iphone.reproduzirMensagemVoz();
        iphone.atender();

        System.out.println("===========================");

        //Funções reprodutor de videos
        iphone.adicionarVideo("One Piece ep 500");
        iphone.reproduzirVideo();
        iphone.pausarVideo();

        System.out.println("===========================");

        //Funções navegador
        iphone.adicionarAba();
        iphone.exibirPagina("Investidor 10");
        iphone.atualizarPagina();

        System.out.println("===========================");

        //Funções reprodutor de musica
        iphone.adicionarMusica("Tipo Kisame - MHRap");
        iphone.tocarMusica();
        iphone.pausarMusica();
    }
}