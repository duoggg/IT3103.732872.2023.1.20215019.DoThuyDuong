package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		System.out.println("Do Thuy Duong 20215019");
		
		// Su dung toan tu + de noi chuoi
		System.out.printf("Operator + : ");
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0 ; i < 65536; i++)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis()-start);
		
		// Su dung StringBuilder() de noi chuoi
		System.out.printf("StringBuilder : ");
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < 65536; i++)
			sb.append(r.nextInt(2));
		
		s = sb.toString();
		System.out.println(System.currentTimeMillis()-start);
		
}

}
