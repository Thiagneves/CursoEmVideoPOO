package staticlist;

public class Principal {
    public static void main(String[] args){
        //Tipos começados com letras maiúsculas se tornam Classes;

        int valorInteiro;
        long valorLong = 5;

        //Conversão
        //transforma o objeto em String;
        Integer x = Integer.valueOf("765");
        Float z = Float.valueOf("2.9");
        Float y = Float.parseFloat("3"); //De string para primitivo

        valorInteiro = (int) valorLong;
        // valorLong = valorInteiro;

        ListaEstatica <Integer> listaEstatica = new ListaEstatica <Integer>();

        listaEstatica.inserirDados(5);
        listaEstatica.inserirDados(7);
        listaEstatica.inserirDados(6);
        listaEstatica.inserirDados(9);
        listaEstatica.imprimirDados();
        System.out.println(" ");
        System.out.println(listaEstatica.buscarIndice(3));
        System.out.println(listaEstatica.buscarValor(6));

        ListaEstatica <Aluno> lista = new ListaEstatica<Aluno>();

        Aluno joao = new Aluno("João");
        lista.inserirDados(new Aluno("Thiago"));
        lista.inserirDados(new Aluno("Kamila"));
        lista.inserirDados(joao);

        System.out.println(lista.buscarValor(joao));
        System.out.println(lista.buscarValor(new Aluno("Thiago")));
        //não vai achar, estou criando "new" outra variavel
        System.out.println();
        lista.imprimirDados();
    }
}
