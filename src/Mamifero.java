/**
 * Classe Mamifero representa um mamífero que herda características da classe Animal.
 */
public class Mamifero extends Animal {
    private String tipoPelagem;

    /**
     * Construtor da classe Mamifero.
     */
    public Mamifero(String nome, int idade, double peso, String especie, String tipoPelagem) {
        super(nome, idade, peso, especie);
        this.tipoPelagem = tipoPelagem;
    }

    // Métodos getters e setters
    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    /**
     * Método que permite o mamífero amamentar.
     */
    public void amamentar() {
        System.out.println(getNome() + " está amamentando");
    }
}