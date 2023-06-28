/**
 * Classe Zoo representa um zoológico que contém animais e funcionários.
 */
public class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;

    /**
     * Construtor da classe Zoo.
     * @param numAnimais O número de animais que o zoológico pode conter.
     * @param numFuncionarios O número de funcionários que o zoológico pode ter.
     */
    public Zoo(int numAnimais, int numFuncionarios) {
        animais = new Animal[numAnimais];
        funcionarios = new Funcionario[numFuncionarios];
    }

    // Métodos getters e setters
    public Animal[] getAnimais() {
        return animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    /**
     * Método para adicionar um animal ao zoológico em uma posição específica do array.
     * @param animal O animal a ser adicionado.
     * @param index A posição do array em que o animal deve ser adicionado.
     */
    public void adicionarAnimal(Animal animal, int index) {
        if (index >= 0 && index < animais.length) {
            animais[index] = animal;
        }
    }

    /**
     * Método para adicionar um funcionário ao zoológico em uma posição específica do array.
     * @param funcionario O funcionário a ser adicionado.
     * @param index A posição do array em que o funcionário deve ser adicionado.
     */
    public void adicionarFuncionario(Funcionario funcionario, int index) {
        if (index >= 0 && index < funcionarios.length) {
            funcionarios[index] = funcionario;
        }
    }
}