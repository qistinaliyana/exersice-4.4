
public class RedApple extends Apple {
	private double price, weight;
	
	public RedApple (String name, String taste,String typeFruit, double price, double weight) {
		super(name, taste, typeFruit);
        this.weight = weight;
		this.price = price;
	//overloading
		    
		        if (this.weight < 10) {
		            totalprice(); //overloading with no arguments
		            System.out.println("\tIf weight less than 10, Total price: RM" + totalprice());
		        
		        }
		            else if (this.weight > 10 && this.weight < 50) {
		            double pp = 1.99;
		            totalprice(pp); //overloading with 1 argument
		            System.out.println("\tIf weight MORE than 10, Total price: RM" + totalprice(pp));
		        }
		        
		            else {
		            double pr = 0.99;
		            int ww = 50; 
		            totalprice(ww, pr); //overloading with 2 arguments
		            System.out.println("\tIf weight MORE than 100, Total price: RM" + totalprice(pr, ww));
		            
		            }
}
		        
		        public double totalprice() {
		        	return this.price * this.weight;
		        }
		        public double totalprice(double pr) {
		        	return pr * this.weight;
		        }
		        public double totalprice(double pr, double ww) {
		        	return pr * ww;
		        }
	//overriding
	public String toString() {
		return "\tThe Fruit is: " + name + "\n\tThe taste is : " + taste + "\n\tThe type of fruit : " + typeFruit;
	}

}
