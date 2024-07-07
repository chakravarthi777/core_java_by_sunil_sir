package final_keyord;

public class FinalVariable {

	public static void main(String[] args) {
		final int a=20;
		//	a=20;
		System.out.println(a);
	}

}

/*
 	final variable cannot be re-initialzed.
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
The final local variable a cannot be assigned. It must be blank and not using a compound assignment*/