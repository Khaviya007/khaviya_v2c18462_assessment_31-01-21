package com.projectjava8;

interface Person
{
public	String name();
}
interface Student{
public int add(int a,int b);
}

public class Samplelamda {
	public static void main(String[] args) {
		Person p = ()->{
			return "name of the person is Ram";
		};
System.out.println(p.name());

Student d = (a,b)->{
	return 1;
};
System.out.println(d.add(2,3));

	}
}
