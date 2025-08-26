package aula04metodosEspeciais;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    boolean tampada;

    // Construtor
    public void Caneta(String m, String c, double p){
        setModelo(m);
        setCor(c);
        setPonta(p);
        tampar();
    }

    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("Ponta: " +this.getPonta());
        System.out.println("Cor: " +this.cor);
        System.out.println("Tampada: " +this.tampada);
    }

    public String getModelo(){
        return modelo;
    }

    private void setModelo(String m){
        this.modelo = m;
    }

    public String getCor(){
        return cor;
    }

    private void setCor(String c){
        this.cor = c;
    }

    public double getPonta(){
        return ponta;
    }

    private void setPonta(double p){
        this.ponta = p;
    }

    public void tampar(){
        tampada = true;
    }

    public void destamapr(){
        tampada = false;
    }
}
