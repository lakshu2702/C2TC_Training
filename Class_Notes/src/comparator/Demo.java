package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(28,"Lakshmi","Bang"));
		ar.add(new Student(45,"Janvi","Mysore"));
		ar.add(new Student(2,"Soso","Delhi"));
		System.out.println("-----------------");
		//ar.sort(a,b->b.compare)
		Collections.sort(ar,new SortRoll());
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar,new SortName());
		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
	}
	}
}