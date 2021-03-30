package lab5n1;

public class Cylinder {
    double radius;
    double height;
    
    Cylinder(){
        radius = 1;
        height = 1;
    }
    
    Cylinder(double r, double h){
        radius = r;
        height = h;
    }
    
    public void setRadius(double r){
        radius = r;
    }
    
    public void setHeight(double h){
        height = h;
    }
    
    public double getBaseArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double getVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
