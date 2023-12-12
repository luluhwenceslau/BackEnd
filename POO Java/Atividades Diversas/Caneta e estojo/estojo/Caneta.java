package estojo;

public class Caneta{
    private String modelo;
    private String cor;
    private int carga;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, int carga, float ponta){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setCarga(carga);
        this.setPonta(ponta);
        this.tampar();
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public int getCarga(){
        return carga;
    }
    public void setCarga(int carga){
        this.carga = carga;
    }

    public float getPonta(){
        return ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public boolean getTampada(){
        return tampada;
    }
    private void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    public void tampar(){
        this.setTampada(true);
    }
    public void destampar(){
        this.setTampada(false);
    }

    public void status(){
        System.out.println();
        System.out.println("------Dados da caneta:----");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor" + this.getCor());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Esta tampada? " + this.getTampada());
        System.out.println("---------------------");
    }

    public void rabiscar(){
        if (this.tampada == true){
             System.out.println();
             System.out.println("Caneta tampada, não posso rabiscar :( ");
             System.out.println();
        } else{
            System.out.println();
            System.out.println("Estou rabiscando ~~~~~~~~~~ :)");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
        }
    }

}