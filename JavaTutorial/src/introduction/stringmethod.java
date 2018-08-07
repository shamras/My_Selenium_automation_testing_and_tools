package introduction;

public class stringmethod {

	public static void main(String[] args) {

		String str = "This is the test string jouMa";
		
		String str1 = "Tsek";
		String str2 = "Tsek";
		String str3 = "Huise toe";
		String str5 = "";
		String str6 = "     Awe world Awe    ";
		String str7 = "Hello";
		
		System.out.println("Length of the string:"+str.length());
		System.out.println("Character at index 3:"+str.charAt(3));
		System.out.println(str.concat(" combining a sentence with the above string"));
		System.out.println("Contains check 1:"+str.contains("the"));
		System.out.println("Contains check 2:"+str.contains("will"));
		System.out.println("starts with check 1:"+str.startsWith("This"));
		System.out.println("starts with check 2:"+str.startsWith("about"));
		System.out.println("Ends with check 1:"+str.endsWith("jouMa"));
		System.out.println("Ends with check 2:"+str.endsWith("shait"));
		System.out.println("Check content are equal:"+str1.equals(str2));
		System.out.println("Check if content are equal:"+str1.equals(str3));
		
		System.out.println("index of 'h' is:"+str.indexOf("h"));
		System.out.println("Check if sting is empty 1:"+str.isEmpty());
		System.out.println("Check if string is empty 2:"+str5.isEmpty());
		System.out.println("Trim the leading and trailing spaces:"+str6.trim());
		
		System.out.println("replace example:"+str7.replace('e', 'a'));
		
		System.out.println("substring example 1:"+str.substring(5));
		System.out.println("substring example 2:"+str.substring(5,10));
		
		char [] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index "+i+" is: "+charArray[i]);
		}
		
	}

}
