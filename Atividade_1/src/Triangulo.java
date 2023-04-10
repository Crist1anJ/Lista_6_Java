public class Triangulo extends TwoDShape {
    private String estilo;
    //falta um construtor

    public Triangulo (double olargura, double oaltura,String oestilo){
        super (olargura,oaltura);
        estilo=oestilo;
        
    }
    public String setEstilo(String estilo){
        return estilo;

    }
    public double Area(){
        return (getLargura() * getAltura()) / 2;
    }

    public void mostraEstilo(){
        System.out.println("Triangulo ="+ estilo);
    }
}
