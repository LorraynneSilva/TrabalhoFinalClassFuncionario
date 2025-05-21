public class FuncionarioView {

    public void exibirFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            System.out.println("ID: " + funcionario.getId());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: R$ " + funcionario.getSalario());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}