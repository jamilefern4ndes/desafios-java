// Desafio 1: O Filtro de Convidados Únicos (Nível: Fácil)
// Foco: Set (HashSet) e organização em Packages

// Crie uma estrutura de pacotes no seu projeto:
// Pacote br.com.evento.modelo: crie a classe Main.
// Na classe Main:
// Crie uma List<String> chamada listaDeEspera e adicione alguns nomes, garantindo que pelo menos dois nomes estejam repetidos (ex: "Ana", "Bruno", "Ana", "Carla", "Bruno").
// Crie um Set<String> (use HashSet) chamado convidadosConfirmados.
// Adicione todos os nomes da lista para dentro do Set.
// Imprima o tamanho da List original e depois o tamanho do Set final para comprovar que as duplicatas foram eliminadas!
package br.com.evento.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class App {
    public static void main(String[] args) throws Exception {
        List<String> listaDeEspera = new ArrayList<>();
        listaDeEspera.add("Rihanna");
        listaDeEspera.add("Katy Perry");
        listaDeEspera.add("Shakira");
        listaDeEspera.add("Miley Cyrius");
        listaDeEspera.add("Miley Cyrius");
        listaDeEspera.add("Katy Perry");
        listaDeEspera.add("Rihanna");

        Set<String> convidadosConfirmados = new HashSet<>(listaDeEspera);

        System.out.println(listaDeEspera);
        System.out.println(convidadosConfirmados);
    }
}
