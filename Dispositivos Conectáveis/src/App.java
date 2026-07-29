// Desafio 3: Dispositivos Conectáveis (Nível: Desafio)
// Foco: Interfaces (interface) e Múltipla implementação (implements)
// Uma interface é um "contrato" de capacidades que qualquer classe pode assumir, independente de qual família/hierarquia ela pertença.

// Crie uma interface chamada Conectavel:
// Assine dois métodos: void conectarWifi() e void desconectarWifi().
// Crie a classe Smartphone que implementa Conectavel:
// Atributo modelo (String) e conectado (boolean).
// Implemente os métodos da interface alterando o status de conectado e exibindo mensagens no console.
// Crie a classe Televisao que também implementa Conectavel (mesmo sendo uma classe completamente diferente de um celular):
// Implemente os mesmos métodos com mensagens adequadas para uma TV.
// Na Main, crie uma ArrayList<Conectavel>! Adicione um Smartphone e uma Televisao na mesma lista (usando Polimorfismo) e use um loop para chamar o .conectarWifi() de todos eles.
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Conectavel> dispositivos = new ArrayList<>();

        dispositivos.add(new Smartphone("Galaxy S23"));
        dispositivos.add(new Televisao("LG OLED"));

        System.out.println("--- Conectando todos os dispositivos ---");
        for (Conectavel dispositivo : dispositivos) {
            dispositivo.conectarWifi();
        }
    }
}
