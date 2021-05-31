package lineCompare;
import java.lang.Math;
import java.util.Scanner;
public class LineCompare {
	
	public static double dist(int x1,int y1,int x2,int y2) {
		double length;
		length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
	
	public static void checkLength(int x1,int y1,int x2,int y2,int x11,int y11,int x22,int y22) {
		double line1=dist(x1,y1,x2,y2);
		double line2=dist(x11,y11,x22,y22);
		if(line1==line2)
		     System.out.println("Lines are equal");
		else
			System.out.println("Lines not equal");
	}
	public static void lengthCompare(int x1,int y1,int x2,int y2,int x11,int y11,int x22,int y22) {
		double line1=dist(x1,y1,x2,y2);
		double line2=dist(x11,y11,x22,y22);
		if(line1==line2)
		     System.out.println("Lines are equal");
		else if (line1 > line2)
			System.out.println("Lines not equal, line1 > line2");
		else
			System.out.println("Lines are not equal , line2 > line1");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to line comparison computation program");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values of coordinates of line1 ");
	    int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		System.out.println("Enter values of coordinates of line 2");
		int x11= sc.nextInt();
		int y11= sc.nextInt();
		int x22= sc.nextInt();
		int y22= sc.nextInt();
	    System.out.println("Length of line1 is:"+dist(x1,y1,x2,y2));
	    System.out.println("Length of line2 is:"+dist(x11,y11,x22,y22));
        checkLength(x1,y1,x2,y2,x11,y11,x22,y22);
        lengthCompare(x1,y1,x2,y2,x11,y11,x22,y22);
    }

}
