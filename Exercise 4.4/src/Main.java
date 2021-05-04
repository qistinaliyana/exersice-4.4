
public class Main {

	public static void main(String[] args) {
			System.out.println("\t+========Welcome======+");
			Fruit a = new Fruit("\t Apple : Grape ");
			System.out.println(a);
			System.out.println();
			
			Apple b = new Apple("Apple", "Sweet", "RedApple");
			System.out.println(b);
			System.out.println();
			
			RedApple e = new RedApple ("RedApple","Sweet", "RedApple", 20, 3);
			System.out.println(e);
			System.out.println();
			
			grape c = new grape("grape", "Sweet", "Greengrape");
			System.out.println(c);
			System.out.println();
			
			Greengrape d = new Greengrape("Greengrape", "Sweet", "Greengrape", 15, 50);
			System.out.println(d);
			System.out.println("\t+============End============+");
	}		
}
