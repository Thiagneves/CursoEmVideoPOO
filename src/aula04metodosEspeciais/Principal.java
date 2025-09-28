package aula04metodosEspeciais;

public class Principal {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        // Uma unica linha para criar uma caneta
        c1.construtor("BIC Cristal", "Azul", 0.5);

        System.out.println(c1.getModelo());
        System.out.println(c1.getCor());
        System.out.println(c1.getPonta());
    }
}
