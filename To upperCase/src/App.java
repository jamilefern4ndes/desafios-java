// Desafio 2: Transformando Nomes em Maiúsculas (Nível: Médio)
// Foco: .map() e .toList() / .collect()

// Crie uma List<String> com alguns nomes em letras minúsculas (ex: "ana", "pedro", "maria", "joão").
// Use a Stream API para:
// Transformar todos os nomes para letras maiúsculas usando .map(nome -> nome.toUpperCase()).
// Coletar o resultado em uma nova List<String> usando .toList().
// Imprima essa nova lista final.

import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("João"); nomes.add("Vitor");
        List<String> NOMES = nomes.stream().map(nome -> nome.toUpperCase()).toList();
        System.out.println(NOMES);
    }
}
