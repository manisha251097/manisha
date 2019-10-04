public interface Shape{
    String getName();
    double getAreaFormula();
    double getArea();
    int getNoOfSides();

} 
class triangle implements Shape{
    double base;
    double height;

    triangle(double b, double h){
        this.base=b;
        this.height=h;
    }
    public String getName(){
        return " Triangle";

    }
    public double getAreaFormula(){
        return "0.5 * b * h";

    }
    public double getArea(){
        return 0.5 * this.base *this.height;

    }
    public int getNoOfSides(){
        return 3;


    }

}
final class utilityclass(){
    public static void main(){
        triangle t= new triangle(4, 5);
        System.Out.println(t.getArea());
    }
    

}