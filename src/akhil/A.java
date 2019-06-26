package akhil;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
//		String system = "Direct|| Indirect Sale|| Test";
//		 List<String> validOrderTypes = Arrays.asList(system.split(Pattern.quote("|| ").trim()));
//		 String result = validOrderTypes.stream()
//	                .filter(x -> "Indirect".equals(x))
//	                .findAny()
//	                .orElse(null);
//		 system = "1,22,3";
//		   System.out.println(B.a_a.name());
		int a = 1;
		short b = 1;
		System.out.println(a==b);
	}

	public enum B{
		a_a, b_b;
		
	}
	
}
