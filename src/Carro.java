public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    private double velocidadeOriginal;




    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }


    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getVelocidade() {
        return velocidade;
    }


    /*public void acelerar(double valor) {
        if (valor > 0 && velocidade + valor <= 200) {
            velocidade += valor;
        }
    }
    public void frear(double valor) {
        if (valor > 0 && velocidade - valor >= 0) {
            velocidade -= valor;
        }*/

    public void acelerar(double valor) {
        if (valor > 0 && velocidade + valor <= 200) {
            velocidade += valor;
        } else if (velocidade + valor > 200) {
            velocidade = 200; // Limite de 200 km/h
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            velocidade -= valor;
            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("A velocidade foi para: " + velocidade + " km/h");
    }
    }

