/**
 * Classe Ave representa uma ave que herda características da classe Animal e implementa a interface Treinavel.
 */
public class Ave extends Animal implements Treinavel {
    private double envergaduraAsa;

    /**
     * Construtor da classe Ave.
     */
    public Ave(String nome, int idade, double peso, String especie, double envergaduraAsa) {
        super(nome, idade, peso, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    // Métodos getters e setters
    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    /**
     * Método que permite a ave voar.
     */
    public void voar() {
        System.out.println(getNome() + " está voando");
    }

    /**
     * Método da interface Treinavel que permite a ave realizar um truque voador.
     */
    @Override
    public void realizarTruque() {
        System.out.println(getNome() + " realizou um truque voador");
    }
}