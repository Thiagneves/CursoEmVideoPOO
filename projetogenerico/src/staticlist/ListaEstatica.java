package staticlist;

public class ListaEstatica <T> {
    T[] valores;
    int quantidadevetor;
    int tamanhovetor;

    //Construtor, usado para criar o objeto
    ListaEstatica(){
        this.quantidadevetor = 0;
        this.tamanhovetor = 5;
        this.valores = (T[]) new Object[tamanhovetor];
    }
    //A lista e estatica e o vetor e fixo, estamos recriando o vetor.
    void recriarVetor(){
        T[] valoresTemporario = (T[]) new Object[tamanhovetor*2];
        //copia de elementos do vetor
        for(int i = 0; i < quantidadevetor; i++){
            valoresTemporario[i] = this.valores[i];
        }
        //Atualizando os valores e o tamanho do vetor
        this.valores = valoresTemporario;
        this.tamanhovetor = tamanhovetor*2;
    }

    //Metodo
    void inserirDados(T valor){
        if (this.quantidadevetor == this.tamanhovetor){
            this.recriarVetor();
        }
        this.valores[this.quantidadevetor] = valor;
        this.quantidadevetor++;
    }

    //Metodo
    void imprimirDados(){
        for(int i = 0; i < quantidadevetor; i++){
            System.out.print(this.valores[i]+" ");
        }
        System.out.println();
    }

    int tamanho(){
        //quantidade de elementos na lista
        return this.quantidadevetor;
    }

    boolean estaVazio(){
        //retorna se está vazio ou não
        return  this.quantidadevetor == 0;
    }

    void removerDados(){
        if(quantidadevetor > 0){
            this.quantidadevetor--;
            //Linha não necessaria no momento, porém quando usamos objeto ele fará diferença na mémoria.
            this.valores[this.quantidadevetor] = null;
        }
        else{
            //Anuncio de Erro!
            throw new RuntimeException("Não existem elementos");
        }
    }

    void limpar(){
        this.quantidadevetor = 0;
    }

    T buscarIndice(int indice){
        if(indice >= 0 && indice <= this.quantidadevetor){
            return this.valores[indice];
        }
        else {
            throw new RuntimeException("Elemento " +indice+ " não existe");
        }
    }

    int buscarValor(T valor){
        for (int i = 0; i < this.quantidadevetor; i++){
            if (this.valores[i] == valor){
                return i;
            }
        }
        return -1;
        //Aviso de erro / encerrar programa:
        //throw new RuntimeException("Valor [" +valor+ "] não encontrado");
    }

    void inserirNaPosicao(int indice, T valor){
        if(this.tamanhovetor == this.quantidadevetor){
            this.recriarVetor();
        }

        for(int i = this.quantidadevetor-1; i >= indice; i--){
            this.valores[i+1] = this.valores[i];
        }
        this.valores[indice] = valor;
        this.quantidadevetor++;
    }
}
