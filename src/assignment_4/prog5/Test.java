package assignment_4.prog5;

public class Test {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Square(3),
				             new Triangle(4,5,6),
				             new Rectangle(3, 4)};

		//compute areas
		for(Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() +  "\n\tPerimeter = " + cc.computePerimeter());
			
		}
    
	}

}