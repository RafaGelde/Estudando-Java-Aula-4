public class principal {
    public static void main(String[] args) {

        // Classe Abstrata não pode ser instanciada
        Empregado marcelo = new Estagiario();
        Empregado andre = new Junior();

        marcelo.cadastroEmpregado("Marcelo", 42);
        andre.cadastroEmpregado("Andre", 19);

        System.out.println(marcelo.toString());
        System.out.println(andre.toString());

        marcelo.toString();
        andre.toString();


        System.out.println(marcelo.calcularAumentoSalario(2000));
        System.out.println(andre.calcularAumentoSalario(5000));
    }
}