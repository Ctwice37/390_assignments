package assignment_5.prog2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midBot;
	//returns the value in the instance vble of Bottom
	public Top(){
		mid = new Middle();
		midBot = mid.new Bottom();
	}
	int readBottom() {

		return midBot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and
		//instance vble in Bottom
		int addTopAndBottom() {

			return t + readBottom();
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				return b * t * m;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midBot.multiplyAllThree());

	}

}