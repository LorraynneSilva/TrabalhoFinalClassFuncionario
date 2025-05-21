//www.github.com/LorraynneSilva
// @LôSilva  - Estudante de Programação - Ciência da Computação - UNINH - BH/MG
public class Funcionario {

// Inicializando variaveis
    private int id;
    private String nome;
    private String cargo;
    private Double salario;

    public Funcionario(int id, String nome, String cargo, Double salario) {
        // criando construtor
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    // metodos get and set
    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }




}
