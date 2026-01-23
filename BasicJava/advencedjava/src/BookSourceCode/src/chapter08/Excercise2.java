package chapter08;

public class Excercise2 {

	public static void main(String[] args) {
		
		ChildEx ce = new ChildEx();
		ParentEx pe = new ParentEx();
		/*
		pe = ce; 			// 1
		pe = (ParentEx)pe;	// 2
		ce = pe; 			// 3
		ce = (ChildEx)pe;	// 4
		*/
	}

}

