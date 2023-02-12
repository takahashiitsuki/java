package practice6;

import java.util.ArrayList;
import java.util.Comparator;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void printInfo() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
}

public class Practice6_4 {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));
		
		/*　ラムダ式
		pointList.forEach(p -> {int tmp = p.y; p.y = p.x; p.x = tmp;});
		 */
		
		/* ラムダ式未使用
		pointList.forEach(new Consumer<Point>() {
			public void accept(Point p) {
				int tmp = p.y;
				p.y = p.x;
				p.x = tmp;
			}
		});*/
		
		/* ラムダ式使用
		pointList.sort((p0, p1) -> (p1.y) - (p0.y));
		*/
		
		pointList.sort(new Comparator<Point>() {
			public int compare(Point p0, Point p1) {
				return p1.y - p0.y;
			}
		});
		
		for(Point p : pointList) {
			p.printInfo();
		}
	}
}
