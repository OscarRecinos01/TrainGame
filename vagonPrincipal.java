package homework.code;

public class vagonPrincipal extends Vagones {

    public vagonPrincipal(){
        this.cantidadRuedas = 8;
        this.capacidadKg = 500;
    }

    public  void acelerar(){
        System.out.println("Acelerando....");
    };

    public  void tocarClaxon(){
        System.out.println("tocando claxon....");
    };

    public  void frenar(){
        System.out.println("frenando....");
    }

}
