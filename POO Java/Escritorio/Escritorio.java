import mesaEstojo.Caneta;

public class Escritorio{

    public static void main (String[] args){

        Caneta c1 = new Caneta();
        c1.setCor ("Azul");
        c1.setMarca ("Bic");
        c1.setCarga = 10;
        c1.setPonta = 0.5f;
        c1.setTampada = true;

        System.out.println();
        System.out.println("Caneta 1");
        System.out.println("Marca: " + c1.getMarca);
        System.out.println("Cor: " + c1.getCor);
        System.out.println("Carga:" + c1.getcarga);
        System.out.println("Ponta: " + c1.getPonta);
        System.out.println("Esta tampada? " + c1.getTampada);
        System.out.println();

        Caneta c2 = new Caneta();
        c2.setCor ("Preta");
        c2.setMarca ("Bic");
        c2.setCarga = 8;
        c2.setPonta = 1.0f;
        c2.setTampada = false;

        System.out.println();
        System.out.println("Caneta 2");
        System.out.println("Marca: " + c2.getMarca);
        System.out.println("Cor: " + c2.getCor);
        System.out.println("Carga:" + c2.getcarga);
        System.out.println("Ponta: " + c2.getPonta);
        System.out.println("Esta tampada? " + c2.getTampada);
        System.out.println();  
        
        c1.escrever();
        c2.escrever();
        c2.recarregar();
        System.out.println("Carga:" + c2.getcarga);
                
    }
}