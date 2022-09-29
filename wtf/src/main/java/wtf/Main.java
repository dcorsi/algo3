package wtf;

public class Main {

	public static void main(String[] args) {
		Integer ten = Integer.parseInt("10");
		System.out.println(ten == Integer.valueOf(10));
		
		Integer thousand = Integer.parseInt("1000");
		System.out.println(thousand == Integer.valueOf(1000));
	}

}
