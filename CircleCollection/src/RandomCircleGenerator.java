import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class RandomCircleGenerator {

	public static void main(String[] args) {
		
		List<Circle> circleList = new ArrayList<Circle>();
		
		double radius = 1;
		
		do {
			radius = Math.random();
			Circle newCircle = new Circle(radius) ;
			circleList.add(newCircle);
		}while(radius >= 0.01);
		
		System.out.println(circleList.size());
		
		Iterator<Circle> i = circleList.iterator();
		
		while(i.hasNext()) {
			if(i.next().getRadius() < 0.5) {
				i.remove();
			}
		}
		
		System.out.println(circleList.size());
		
		
	}

}
