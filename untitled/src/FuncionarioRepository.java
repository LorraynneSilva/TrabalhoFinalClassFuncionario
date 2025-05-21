import java.util.HashMap;
import java.util.Map;

public class FuncionarioRepository {
    private Map<Integer, Funcionario> funcionarios = new HashMap<>();

    public void salvar(Funcionario funcionario) {
        funcionarios.put(funcionario.getId(), funcionario);
    }

    public Funcionario buscarPorId(int id) {
        return funcionarios.get(id);
    }

    public void atualizar(Funcionario funcionario) {
        if (funcionarios.containsKey(funcionario.getId())) {
            funcionarios.put(funcionario.getId(), funcionario);
        }
    }

    public void deletar(int id) {
        funcionarios.remove(id);
    }
}