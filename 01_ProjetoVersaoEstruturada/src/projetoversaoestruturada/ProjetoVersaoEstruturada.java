package projetoversaoestruturada;

import br.com.luizcarlos.Programa1;

public class ProjetoVersaoEstruturada {

    public static void main(String[] args) {
        System.out.println("Iniciando Venda (1).");
        Programa1 venda = new Programa1();
        venda.criarDadosTeste();
        venda.realizarVenda();
        System.out.println("Venda Concluída");
        
    }
    
}
