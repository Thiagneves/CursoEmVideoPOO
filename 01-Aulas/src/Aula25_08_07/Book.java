package Aula25_08_07;

public class Book {
    public String autor;
    public String titulo;
    boolean emprestado;

    Book(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    void imprimirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Emprestado: " + (this.emprestado ? "Sim" : "Não"));
    }

    boolean isEmprestado(){
        return this.emprestado;
    }

    void emprestado(){
        this.emprestado = true;
    }

    void devolver(){
        this.emprestado = false;
    }

    void alterarEstadoEmprestimo(boolean emprestado){
        this.emprestado = emprestado;
    }

    void alterarEstadoUso(){
        this.emprestado = !(this.emprestado);
    }
}
