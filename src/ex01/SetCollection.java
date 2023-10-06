package ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{

	public Person() {
		System.out.println("-----");
	}
	public Person(String string) {
		System.out.println(string);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

public class SetCollection {

	public static void main(String[] args) {
		
		Set<Person> list = new HashSet();
		
		list.add(new Person("toy"));
		list.add(new Person("robot"));
		list.add(new Person("box"));
		list.add(new Person("doll"));
		
		
		}
		
					
}


