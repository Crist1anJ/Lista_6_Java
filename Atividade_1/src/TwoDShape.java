/*Classe para objetos de duas dimenções */
public class TwoDShape{
    private double largura;
    private double altura;
    
    public TwoDShape(double oaltura, double olargura){
        largura=olargura;
        altura=oaltura;
    }
    public double getLargura() {//get acessador e set modificador
        return largura; 
    }

    public double getAltura() {
        return altura; 
    }
    public void mostraDim(){
        System.out.println("Largura e Altura = "+ getLargura()+ " e "+ getAltura());
    }
}