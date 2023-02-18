package text7;

import java.io.Serializable;

class Point implements Serializable{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Triangle implements Serializable{
	Point p0;
	Point p1;
	Point p2;
}
