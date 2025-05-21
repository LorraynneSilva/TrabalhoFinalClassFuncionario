public class FuncionarioController {
    private FuncionarioDAO dao;

    public FuncionarioController(FuncionarioDAO dao) {
        this.dao = dao;
    }

    public void salvarFuncionario(Funcionario funcionario) {
        dao.criar(funcionario);
    }

    public Funcionario obterFuncionario(int id) {
        return dao.ler(id);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        dao.atualizar(funcionario);
    }

    public void excluirFuncionario(int id) {
        dao.deletar(id);
    }
}

