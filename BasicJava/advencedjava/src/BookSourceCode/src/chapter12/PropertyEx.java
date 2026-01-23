package chapter12;

public class PropertyEx {

	public static void main(String[] args) {
		
		for (String var : System.getenv().keySet()) {
			System.out.println(var + "=" + System.getenv(var));
		}

	}

}
