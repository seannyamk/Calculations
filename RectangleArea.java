import java.util.Scanner ;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

   void getData() {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Please enter the length of the rectangle");
       length = scanner.nextDouble();
       System.out.println("Please enter the width of the rectangle");
       width = scanner.nextDouble();
   }

       void computerField()
       {
           area = length*width ;
       }
       void fileDisplay(){
           System.out.println("Area: "+ area);
       }
   }
