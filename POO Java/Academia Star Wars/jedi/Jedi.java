package jedi;

import planeta.Academia;

public class Jedi {

    private String nome;
    private String lado;    
    private Forca[] forca;
    private SabreLuz sabre;
    private Academia academia;

   public Jedi(String nome, String lado, Forca[] forca, SabreLuz sabre){
       this.nome = nome;
       this.lado = lado;
       this.forca = forca;
       this.sabre = sabre;
    }

    public String getNome(){
        return nome;
    } 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getLado(){
        return lado;
    }
    public void setLado(String lado){
        this.lado = lado;
    }
    public Forca[] getForca(){
        return forca;
    }
    public void setForca(Forca[] forca){
        this.forca = forca;
    }
 
     public SabreLuz getSabre(){
        return sabre;
     }
     public void setSabre(SabreLuz sabre){
        this.sabre = sabre;
     }

     public Academia getAcademia(){
        return academia;
     }
     public void setAcademia(Academia academia){
        this.academia = academia;
     }
    
    @Override
    public String toString(){  //sobreposicao
        return "--------------------------" +
               "\nNome Jedi: " + this.getNome() +
               "\nLado: " + this.getLado() +
               "\nForca: " + this.getForca() +
               "\nCor do sabre: " + this.getSabre().getCor() +
               "\nSabre aberto? " + this.getSabre().isAberto() +
               "\nAcademia: " + this.getAcademia() +
               "\n-------------------------";
    }
}
