package lab5n1;

public class Lab5n1 {

    public static void main(String[] args) {

        Cylinder cyl1 = new Cylinder(5, 10);
        Cylinder cyl2 = new Cylinder(7.5, 15.5);

        System.out.println("\nCylinder 1 :");
        System.out.println("Radius: " + cyl1.radius + " cm");
        System.out.println("Height: " + cyl1.height + " cm");
        System.out.println("Base Area: " + cyl1.getBaseArea() + " Square cm");
        System.out.println("Volume: " + cyl1.getVolume() + " Cubic cm");
        
        System.out.println("\nCylinder 2 :");
        System.out.println("Radius: " + cyl2.radius + " cm");
        System.out.println("Height: " + cyl2.height + " cm");
        System.out.println("Base Area: " + cyl2.getBaseArea() + " Square cm");
        System.out.println("Volume: " + cyl2.getVolume() + " Cubic cm");
    }   
}
