
public class Apple extends Fruit {
protected String taste, typeFruit;

	
	public Apple(String name, String taste, String typeFruit) {
	super(name);
	this.taste = taste;
	this.typeFruit = typeFruit;
	}
	//getter
	public String gettaste() {
		return this.taste;
	}
	public String gettypeFruit() {
		return this.typeFruit;
	}
	//overriding
	public String toString() {
		return "\tThe Fruit is: " + name + "\n\tthe taste is : " + taste + "\n\tThe type of fruit : " + typeFruit;
	}
    	

}
