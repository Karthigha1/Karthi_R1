
public class Calc {

	public static void main(String[] args)
	{
		int x,y;
		x=10;
		y=5;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(Math.pow(x, y));
		System.out.println(Math.random());
		
		System.out.println();
		String str="This is a sample Text";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));
		System.out.println(str.contains("sample"));
		System.out.println(str.replaceAll("is","was"));
		System.out.println(str.substring(0,4));
		

	}

}
