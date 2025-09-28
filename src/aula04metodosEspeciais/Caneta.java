package aula04metodosEspeciais;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;

    // Construtor
        setModelo(m);
        setCor(c);
        setPonta(p);
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
}
