package smartphone;

import smartphone.funcionalidades.AparelhoTelefonico;
import smartphone.funcionalidades.NavegadorInternet;
import smartphone.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    public void selecionarMusica() {
        
      System.out.println("Selecionando música.");
    }

  
    public void tocar() {
        System.out.println("Tocando música.");
    }

  
    public void pausar() {
        System.out.println("Pausando música.");
    }

  
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

   
    public void adicionarNovaAba() {
        System.out.println("Adicinando aba.");
    }

   
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

   
    public void ligar() {
        
        System.out.println("Ligando.");
    }

  
    public void atender() {
        System.out.println("Ligando.");
    }

   
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    
}
