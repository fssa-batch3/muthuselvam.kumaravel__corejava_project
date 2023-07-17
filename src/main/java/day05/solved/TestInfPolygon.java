package day05.solved;





public class TestInfPolygon {

	/**
	 * @param args
	 */
	public interface Polygon {

		public double area(double a, double b);
	}
	public class Rectangle implements Polygon {

		@Override
		public double area(double a, double b) {
			System.out.println("Calculating Rectangle area");
			return a*b;
		}

	}

	public class RightAngledTriangle implements Polygon {

		@Override
		public double area(double a, double b) {
			System.out.println("Calculating RightAngledTriangle area");
			return (0.5 * a * b);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon p = new Rectangle();
		double area = p.area(5, 6);
		System.out.println("Calculated Area: " + area);
		
		p = new RightAngledTriangle();
		
		area = p.area(5,  6);
		
		System.out.println("Newly calculated Area: " + area);

	}

}