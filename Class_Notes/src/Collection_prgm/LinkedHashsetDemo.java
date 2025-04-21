package Collection_prgm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lset=new LinkedHashSet<Integer>();
		lset.add(10);
		lset.add(30);
		lset.add(5);
		lset.add(15);
		
		TreeSet<Integer>t=new TreeSet<Integer>(lset);
		System.out.println("natural ascending sorting"+t);
		
		

	}

}