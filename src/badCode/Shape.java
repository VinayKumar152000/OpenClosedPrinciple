package badCode;

//requirment is we need to design a class which will help us to draw shapes
//approach 1 ->create a shape class and based on value passed return the shape using if else
public class Shape {

	public void draw(String shape) {

		if (shape.equals("Circle")) {
			Circle circle =new Circle();
			System.out.println("Cicle has Been Drawn"+ circle);
		} else if (shape.equals("Triangle")) {
			Triangle triangle= new Triangle();
			System.out.println("Triangle has Been Drawn"+ triangle);
		}
		
		//if we want to add new shape we need to add new if else for that,which voilates open closed principle
		//i.e classes are closed for modification but open for extension -> we are modify our shape class
		//why ocp is better because if we use this approach code maintability will be issue if thre are lots of shapes,
		//we need to write if-else for each shape
		
		//so  in order to our code follows ocp we need to provide better approach

	}
}
