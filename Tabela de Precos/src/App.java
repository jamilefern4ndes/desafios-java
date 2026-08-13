// Desafio 2: Tabela de Preços do Mercado (Nível: Médio)
// Foco: Map (HashMap) e busca por chave

// Na Main (ou em uma nova classe):
// Crie um Map<String, Double> chamado tabelaPrecos usando HashMap.
// Adicione pelo menos 4 produtos com seus respectivos preços usando .put() (ex: "Café" -> 14.50, "Leite" -> 4.80, "Açúcar" -> 3.20).
// Faça uma verificação com o método .containsKey():
// Se o produto "Café" existir no Map, busque o preço dele com .get("Café") e imprima: "O preço do Café é R$ 14.50".
// Percorra o Map usando um laço for e .entrySet() para imprimir todos os produtos e seus preços formatados.
import java.util.HashMap;
import java.util.Map;
public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Double> tabelaPrecos = new HashMap<>();
        tabelaPrecos.put("Leite", 10.00);
        tabelaPrecos.put("Café", 15.99);
        tabelaPrecos.put("Pão", 5.99);  

        if(tabelaPrecos.containsKey("Café")){
            System.out.println("O preço do café é R$" + tabelaPrecos.get("Café"));
        }

        System.out.println("\n--- Lista Completa de Produtos ---");

        // Percorrendo cada par (Entry) do Map:
        for (Map.Entry<String, Double> item : tabelaPrecos.entrySet()) {
            String produto = item.getKey();  
            Double preco = item.getValue();    

            System.out.println("Produto: " + produto + " | Preço: R$ " + preco);
        }
    }

}
