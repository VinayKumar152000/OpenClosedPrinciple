package goodCode;

//better approach2- > is to create a interface shape and makes different classes to implement it's method draw
//this helps us in adding new shapes with modifying any of the class,we will just extends the interface and the implementation
//class will implement it
public interface Shape {

	public void draw();
}
