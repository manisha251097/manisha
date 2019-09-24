/**
 * This class is to find the area and perimeter of a cirlce.
 * 
 * @author Siva Sankar
 */
public class AreaOfCircle {
    
    private static final double PI = 3.14159;


    /**
     * This method calculates the area of the circle.
     * Use the PI variable defined in the line number 8.
     * 
     * @param radius, the radius of the circle
     * @return the area of the circle
     */
    public static double areaOfCircle(double radius) {
        double area;
        area=PI*radius*radius;
        return area;
    }

    /**
     * This method returns the perimiter of the circle.
     * Use the PI variable defined in the line number 8.
     * 
     * @param radius, the radius of the circle.
     * @return the perimeter of the circle.
     */
    public static double perimeterOfCircle(double radius) {
        return 0.0;
    }
    public static void main(String[] args) {
        System.out.println(areaOfCircle(4));
    }
}