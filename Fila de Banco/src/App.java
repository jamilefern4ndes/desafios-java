// Desafio 3: Fila de Atendimento do Banco (Nível: Desafio)
// Foco: Queue (LinkedList como Fila) e laço while

// Crie uma fila de pessoas para atendimento usando a interface Queue:
// Queue<String> filaAtendimento = new LinkedList<>();
// Adicione 3 clientes à fila usando .add() ou .offer() (ex: "Maria", "João", "Pedro").
// Use um laço while (!filaAtendimento.isEmpty()) para simular o atendimento:
// A cada volta do laço, retire o próximo da fila usando .poll() (que remove e retorna o elemento do topo).
// Imprima: "Atendendo o cliente: [Nome do Cliente]...".
// Ao final do laço, imprima: "Todos os clientes foram atendidos. Fila vazia!".

import java.util.LinkedList;
import java.util.Queue;
public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> filaAtendimento = new LinkedList<>();
        filaAtendimento.add( "João Azevedo");
        filaAtendimento.add( "Ricardo Coutinho");
        filaAtendimento.add( "Cássio Cunha Lima");

        while (!filaAtendimento.isEmpty()) {
            System.out.println("Atendendo o cliente " + filaAtendimento.poll());
        }

        System.out.println("Todos os clientes foram atendidos, lista vazia!");
    }
}
