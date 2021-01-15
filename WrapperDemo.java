package ex;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer bi1 = new Integer(10);
		
		int i1= bi1.intValue();
		
		System.out.println(i1);
		
		double d= bi1.doubleValue();
		System.out.println(d);
		
		Integer bi2=10;
		int i2=bi2 + 20;
		System.out.println(i2);
		
		String s1=Double.toString(3.14);
		Double pi = Double.parseDouble("3.14");
		Integer bi3 = Integer.valueOf("11",16);
		
	}
}
