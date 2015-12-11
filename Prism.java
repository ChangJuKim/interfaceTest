public class Prism extends Rectangle implements Volume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "A prism of (length, width, height) = "+
	    "("+getLength()+", "+getWidth()+", "+height+")";
    }

    public double getVolume() {
	return getLength() * getWidth() * height;
    }
}
