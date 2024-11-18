public class Iphone implements AparelhoTelefonico, ReprodutorMusical,NavegandoNaInternet {


    //////////////////// IMPLEMENTAÇÃO DOS METODOS AparelhoTelefonico ///////////////////////
    @Override
    public void ligar(String numero) {
        System.out.println("Numero de telefone: " + numero);
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }



    //////////////////// IMPLEMENTAÇÃO DOS METODOS ReprodutorMusical///////////////////////

    @Override
    public void tocar() {
      System.out.println("Tocando musica ");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica escolhida:  " + musica);
    }


        //////////////////// IMPLEMENTAÇÃO DOS METODOS NavegandoNaInternet///////////////////////
        @Override
        public void exibirPagina(String url) {
            System.out.println("pagina: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Nova aba adicionada");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando a pagina ");
        }


    } 

