// Desafio 1: Filtrando e Imprimindo (Nível: Fácil)
// Foco: .stream(), .filter() e .forEach()

// Crie uma List<Integer> contendo os números de 1 a 10: Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).
// Use a Stream API para:
// Filtrar apenas os números pares (dica: n -> n % 2 == 0).
// Imprimir cada número par restante usando .forEach(n -> System.out.println(n

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println(n));
    }
}
