public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return "Sphere "+getName()+" of radius "+getRadius();
    }

    public double getVolume() {
	return 3.14159265358979*4 / 3.0 * getRadius()*getRadius()*getRadius();
    }
}
