package lineCompare;
import java.lang.Math;
public class LineCompare {
	
	public static double dist(int x1,int y1,int x2,int y2) {
		double length;
		length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
	
	public static void checkLength() {
		double line1=dist(1,2,3,-4);
		double line2=dist(1,-2,3,-4);
		if(line1==line2)
		     System.out.println("Lines are equal");
		else
			System.out.println("Lines not equal");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to line comparison computation program");
        System.out.println(dist(1,2,3,-4));
        checkLength();
    }

}
