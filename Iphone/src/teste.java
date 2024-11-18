
public class teste {
    public static void main(String[] args) {
        AparelhoTelefonico meuIphone = new Iphone(); // estou criando um objeto de iphone usando como referencia a interface Aparelho eletronico, dessa forma o objeto meuIphone terá os metodos somente da interface da referencia e sendo um objeto de iphone
        meuIphone.ligar("123456");
        meuIphone.iniciarCorreioVoz();
        meuIphone.atender();
    }

}
