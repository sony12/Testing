package SeleniumQTP;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SET_java {

	public static void main(String[] args) {
		Set<String> of = new HashSet(); // in a set their is no duplicate elements
		of.add("book");
		of.add("kittin");
		of.add("pen");
		System.out.println(of.size());
		of.add("pen");
		of.add("opo");
System.out.println(of.size());
Iterator<String> it= of.iterator();
while(it.hasNext())
	System.out.println(it.next());

	}

}
