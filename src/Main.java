/**
 * Classe Main é a classe principal que demonstra o uso das classes criadas.
 */
public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes
        // Animal representa um animal genérico com atributos como nome, idade, peso e espécie.
        Animal animal = new Animal("Leão", 5, 200.0, "Mamífero");

        // Ave é uma subclasse de Animal e adiciona o atributo envergaduraAsa. Implementa a interface Treinavel.
        Ave ave = new Ave("Águia", 2, 5.0, "Ave", 2.5);

        // Funcionario representa um funcionário genérico com atributos como nome, cargo e salário.
        Funcionario funcionario = new Funcionario("João", "Atendente", 2500.0);

        // Mamifero é uma subclasse de Animal e adiciona o atributo tipoPelagem. Possui o método amamentar().
        Mamifero mamifero = new Mamifero("Gato", 3, 4.5, "Felino", "Curto");

        // Treinavel é uma interface com o método realizarTruque(). Ave implementa essa interface.
        Treinavel treinavel = new Ave("Papagaio", 1, 0.5, "Ave", 0.8);

        // Veterinario é uma subclasse de Funcionario e adiciona o atributo especialidade. Possui o método realizarExame().
        Veterinario veterinario = new Veterinario("Pedro", "Veterinário", 5000.0, "Clínico Geral");

        // Zoo é uma classe que representa um zoológico e contém arrays de animais e funcionários.
        Zoo zoo = new Zoo(5, 3);

        // Demonstrações dos métodos e polimorfismo
        animal.movimentar(); // Animal se moveu de forma padrão -- // Utilização da sobrecarga de métodos em Animal.

        ave.movimentar("voando"); // Águia se moveu de forma específica: voando -- // Utilização da sobrecarga de métodos em Ave.
        veterinario.realizarExame(animal); // Pedro está realizando um exame no(a) Leão -- // Utilização do polimorfismo para chamar o método realizarExame() específico de Veterinario.
        mamifero.amamentar(); // Gato está amamentando -- // Utilização do polimorfismo para chamar o método amamentar() específico de Mamifero.
        treinavel.realizarTruque(); // Papagaio realizou um truque voador -- // Utilização do polimorfismo para chamar o método realizarTruque() de Ave.
        veterinario.realizarExame(animal); // Pedro está realizando um exame no(a) Leão -- // Utilização do polimorfismo para chamar o método realizarExame() específico de Veterinario.

        // Adição de animais ao zoológico
        zoo.adicionarAnimal(animal, 0);
        zoo.adicionarAnimal(ave, 1);
        zoo.adicionarAnimal(mamifero, 2);
        zoo.adicionarAnimal(new Mamifero("Cachorro", 2, 7.0, "Canino", "Médio"), 3);
        zoo.adicionarAnimal(new Ave("Pinguim", 4, 10.0, "Ave", 1.2), 4);

        // Adição de funcionários ao zoológico
        zoo.adicionarFuncionario(funcionario, 0);
        //zoo.adicionarFuncionario((Funcionario) treinavel, 1);
        zoo.adicionarFuncionario(veterinario, 2);

        // Demonstrações dos métodos dos animais no zoológico
        Animal[] animais = zoo.getAnimais();
        for (Animal animalZoo : animais) {
            animalZoo.movimentar(); // Chamando o método movimentar de forma padrão para cada animal no zoológico
        }

        // Demonstrações dos métodos dos veterinários no zoológico
        Funcionario[] funcionarios = zoo.getFuncionarios();
        for (Funcionario funcionarioZoo : funcionarios) {
            if (funcionarioZoo instanceof Veterinario) {
                ((Veterinario) funcionarioZoo).realizarExame(animal); // Chamando o método realizarExame do veterinário no animal
            }
        }
    }
}

