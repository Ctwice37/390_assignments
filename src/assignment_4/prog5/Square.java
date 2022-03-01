package assignment_4.prog5;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}


	@Override
	public double[] getNumberOfSides() {
		return new double[]{side, side, side, side};
	}

	@Override
	public double computePerimeter() {
		return 4*side;
	}


}
