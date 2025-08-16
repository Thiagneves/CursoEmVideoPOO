package aula03visibilidade;

public class Main {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.modelo = "Bic cristal";
        c1.cor = "Azul";

        // Não posso mexer na ponta, pois ele é privado.
        // Não posso mexer na carga, pois ele é protegido
        // Essa regra vale para os demais atributos protegidos e privados.

        // O mesmo vale para os métodos, sendo possível mexer somente os métodos públicos.

        c1.status();
    }
}
