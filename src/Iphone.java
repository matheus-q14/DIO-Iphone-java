import interfaces.Navegador;
import interfaces.ReprodutorMusica;
import interfaces.ReprodutorVideo;

public class Iphone implements ReprodutorMusica, ReprodutorVideo, Navegador {
    private String musica;
    private String video;
    private String mensagemVoz;

    public Iphone() {
    }

    public void ligar(String numeroCelular) {
        System.out.printf("Ligando para %s%n", numeroCelular);
    }

    public void atender() {
        System.out.println("Atendendo telefone");
    }

    public void gravarCorreioVoz(String mensagem) {
        this.mensagemVoz = mensagem;
    }

    public void reproduzirMensagemVoz() {
        System.out.println(this.mensagemVoz);
    }

    public void exibirPagina(String pagina) {
        System.out.printf("A página %s está sendo exibida%n", pagina);
    }

    public void adicionarAba() {
        System.out.println("Uma nova aba foi adicionada");
    }

    public void atualizarPagina() {
        System.out.println("A página foi atualizada com sucesso");
    }

    public void tocarMusica() {
        System.out.printf("A música %s está sendo tocada%n", this.musica);
    }

    public void pausarMusica() {
        System.out.println("A música foi pausada");
    }

    public void adicionarMusica(String musica) {
        this.musica = musica;
        System.out.printf("Música %s foi seleionada%n", musica);
    }

    public void reproduzirVideo() {
        System.out.printf("Reproduzindo %s%n", this.video);
    }

    public void adicionarVideo(String nomeVideo) {
        this.video = nomeVideo;
        System.out.printf("Video %s selecionado%n", nomeVideo);
    }

    public void pausarVideo() {
        System.out.println("Video pausado");
    }
}
