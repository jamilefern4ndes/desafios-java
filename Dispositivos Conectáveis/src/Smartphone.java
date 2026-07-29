// Crie a classe Smartphone que implementa Conectavel:
// Atributo modelo (String) e conectado (boolean).
// Implemente os métodos da interface alterando o status de conectado e exibindo mensagens no console.
public class Smartphone implements Conectavel {
    private String modelo;
    private boolean conectado;

    public Smartphone(String modelo) {
        this.modelo = modelo;
        this.conectado = false;
    }

    @Override
    public void conectarWifi() {
        this.conectado = true;
        System.out.println("Smartphone " + modelo + " conectado ao Wi-Fi!");
    }

    @Override
    public void desconectarWifi() {
        this.conectado = false;
        System.out.println("Smartphone " + modelo + " desconectado do Wi-Fi.");
    }
}

 class Televisao implements Conectavel {
    private String marca;
    private boolean conectado;

    public Televisao(String marca) {
        this.marca = marca;
        this.conectado = false;
    }

    @Override
    public void conectarWifi() {
        this.conectado = true;
        System.out.println("TV " + marca + " conectada à rede Wi-Fi da sala!");
    }

    @Override
    public void desconectarWifi() {
        this.conectado = false;
        System.out.println("TV " + marca + " desconectada.");
    }
}
