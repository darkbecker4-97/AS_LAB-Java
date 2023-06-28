/**
 * Classe Animal representa um animal genérico.
 */
public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    /**
     * Construtor da classe Animal.
     */
    public Animal(String nome, int idade, double peso, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Método que permite o animal se movimentar de forma padrão.
     */
    public void movimentar() {
        System.out.println(nome + " se moveu de forma padrão");
    }

    /**
     * Método que permite o animal se movimentar de uma maneira específica.
     * @param movimento O movimento específico do animal.
     */
    public void movimentar(String movimento) {
        System.out.println(nome + " se moveu de forma específica: " + movimento);
    }
}