public abstract class Empregado {
    // Atributos
    private String nome;
    private int idade;

    // Metodo com Corpo
    public void cadastroEmpregado (String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    // O Metodo Abstrato não pode ser Implementado
    public abstract double calcularAumentoSalario(double salario);

    // Getter e Setter
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

    @Override
    public String toString() {
        return this.getNome() + " tem " + this.getIdade();
    }
}
