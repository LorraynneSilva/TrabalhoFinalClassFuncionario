
// www.github.com/LorraynneSilva
public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes
        FuncionarioRepository repository = new FuncionarioRepository();
        FuncionarioDAO dao = new FuncionarioDAO(repository);
        FuncionarioController controller = new FuncionarioController(dao);
        FuncionarioView view = new FuncionarioView();

        // Criando e salvando funcionários
        Funcionario funcionario1 = new Funcionario(1, "Lorraynne", "Desenvolvedora", 8000.00);
        Funcionario funcionario2 = new Funcionario(2, "Carlos", "Designer", 7000.00);

        controller.salvarFuncionario(funcionario1);
        controller.salvarFuncionario(funcionario2);

        // Obtendo e exibindo um funcionário
        Funcionario funcionarioObtido = controller.obterFuncionario(1);
        view.exibirFuncionario(funcionarioObtido);

        // Atualizando dados de um funcionário
        funcionarioObtido.setCargo("Desenvolvedora Sênior");
        funcionarioObtido.setSalario(10000.00);
        controller.atualizarFuncionario(funcionarioObtido);

        // Exibindo funcionário atualizado
        view.exibirFuncionario(controller.obterFuncionario(1));

        // Excluindo um funcionário
        controller.excluirFuncionario(2);
        view.exibirFuncionario(controller.obterFuncionario(2)); // Deve informar que não foi encontrado
    }
}