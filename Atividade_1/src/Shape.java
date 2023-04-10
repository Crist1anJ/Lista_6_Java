public class Shape {
    public static void main(String[] args ){
        Triangulo t1 = new Triangulo( 4.0,4.0 ," cheio");
        Triangulo t2 = new Triangulo(8.0,12.0," contorno");

        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.Area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.Area());
    }
}
