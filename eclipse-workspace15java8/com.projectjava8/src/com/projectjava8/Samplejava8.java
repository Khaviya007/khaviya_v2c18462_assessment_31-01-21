package com.projectjava8;
import java.util.function.Function;
public class Samplejava8 {

	public static void main(String[] args) {
		Function<Integer,Integer> s=i->i-i;
		System.out.println("sub is:"+s.apply(2));
		
		Function<Integer,Integer> s1=i->i+i;
		System.out.println("add is:"+s1.apply(2));
		
		Function<Integer,Integer> s2=i->i*i;
		System.out.println("mul is:"+s2.apply(2));
		
		Function<Integer,Integer> s3=i->i/i;
		System.out.println("div is:"+s3.apply(2));
		
		Function<Integer,Integer>s4=i->i%i;
		System.out.println("Modulus is:"+s4.apply(2));

	}

}
