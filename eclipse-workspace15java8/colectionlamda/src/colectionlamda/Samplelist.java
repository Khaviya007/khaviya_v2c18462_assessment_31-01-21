package colectionlamda;
import java.util.ArrayList;
import java.util.Collections;
public class Samplelist {
		public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(3,"Ram",44.5f));
	al.add(new Student(5,"Sam",24.3f));
	al.add(new Student(4,"John",97.5f));
	al.add(new Student(1,"Aji",34.5f));
	al.add(new Student(2,"Tom",76.5f));
	
	System.out.println("Elements of the ArrayList before sorting : ");
	for(Student s:al) {
	System.out.println( s.id+" "+s.name+" "+s.marks);
	}
	
	Collections.sort(al, (a,b) ->{
		return a.id.compareTo(b.id);
		});
	System.out.println("After sorting the id : ");
	for(Student s1:al) {
	System.out.println( s1.id+" "+s1.name+" "+s1.marks);	
     }
	
	Collections.sort(al, (o1,o2) ->{
		return o1.name.compareTo(o2.name);
		});
	System.out.println("After sorting the name : ");
	for(Student s1:al) {
	System.out.println( s1.id+" "+s1.name+" "+s1.marks);	
     }
	
	Collections.sort(al, (a,b) ->{
		return a.marks.compareTo(b.marks);
		});
	System.out.println("After sorting the marks : ");
	for(Student s1:al) {
	System.out.println( s1.id+" "+s1.name+" "+s1.marks);	
     }
	
	  
}	
}
	class Student{
		Integer id;
		String name;
	   Float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	}
	

