package introduction;

public class DefaultVariablesvalue {
	static byte bytevariable;
	static short shortvariable;
	static int integervariable;
	static long longvariable ;
	static float floatvariable;
	static double doublevariable;
	static boolean booleanvariable;
	static char chavariable; 

	public static void main(String[] args) {
	
		
		byte bytevariable = 0;
		System.out.println("Byte Value:" + bytevariable);
			
		short shortvariable = 1000;
		System.out.println("short Value:" + shortvariable);
		
		int integervariable = 100000;
		System.out.println("int Value:" + integervariable);
		
			
		long longvariable = 1000000000L;
		System.out.println("long Value:" + longvariable);
	
		float floatvariable = 20.1f;
		System.out.println("float Value:" + floatvariable);
		
	
		double doublevariable = 60.33;
	    System.out.println("double Value:" + doublevariable);		

	    boolean booleanvariable = true;
	    System.out.println("boolean Value:" + booleanvariable);		
				
		
	    char chavariable = 'a';
	    System.out.println("char Value:" + chavariable);	


	}

	public void oneMoreMethod() {
		System.out.println("int Value:" + integervariable);
	}
}
