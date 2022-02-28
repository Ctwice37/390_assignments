package assignment_4.prog4;

public class Test {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3, 4)};

		//compute areas
		for(Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + "\n\tNumber of Sides = " + cc.getNumberOfSides() + "\n\tPerimeter = " + cc.computePerimeter());
			
		}
    
	}

}