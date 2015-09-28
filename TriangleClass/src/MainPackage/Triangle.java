package MainPackage;

public class Triangle extends GeometricObject {

		// declaring variables and generating their getters and setters
		public double side1 = 1.0;
		public double side2 = 1.0;
		public double side3 = 1.0;
		
		public double getSide1() {
			return side1;
		}

		public void setSide1(double side1) {
			this.side1 = side1;
		}

		public double getSide2() {
			return side2;
		}

		public void setSide2(double side2) {
			this.side2 = side2;
		}

		public double getSide3() {
			return side3;
		}

		public void setSide3(double side3) {
			this.side3 = side3;
		}
		
		// Creating a no-arg constructor and a constructor for the Triangle object
		public Triangle()
		{
			
		}
		
		public Triangle(double side1, double side2, double side3)
		{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
		// This method returns the area of the Triangle object
		public double getArea()
		{
			double p = (side1 + side2 + side3)/2;
			double area = Math.sqrt((p*(p-side1)*(p-side2)*(p-side3))*(1/2));
			return area;
		}
		
		// This method returns the perimeter of the Triangle object
		public double getPerimeter()
		{
			return side1 + side2 + side3;
		}
		
		
		// This method returns a string description of the triangel
		public String toString()
		{
			return "Side 1 Length: "+ side1 + "\nSide 2 Length: "+side2 + "\nSide 3 Length:"+side3;
		}
		
	}



