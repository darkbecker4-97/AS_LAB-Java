/**
 * Classe Veterinario representa um veterinário que herda características da classe Funcionario.
 */
public class Veterinario extends Funcionario {
    private String especialidade;

    /**
     * Construtor da classe Veterinario.
     */
    public Veterinario(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }

    // Métodos getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * Método que permite o veterinário realizar um exame em um animal.
     * @param animal O animal a ser examinado.
     */
    public void realizarExame(Animal animal) {
        System.out.println(getNome() + " está realizando um exame no(a) " + animal.getNome());
    }
}
