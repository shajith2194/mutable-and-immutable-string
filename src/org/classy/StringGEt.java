package org.classy;

public class StringGEt {
	public static void main(String[] args) {
		String s="shajith";
		String s1="sheikh";
		System.out.println("immutable string");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s=s.concat(" "+s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		System.out.println("------------------------");
		
		StringBuffer s2=new StringBuffer("shajith");
		StringBuffer s3=new StringBuffer("sheikh");
		System.out.println("mutable string");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
		s2.append(" "+s3);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
	}

}
