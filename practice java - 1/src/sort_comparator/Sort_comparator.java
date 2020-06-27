package sort_comparator;

import java.util.*; 
class Student{ 
    int rollno; 
    String name;
    String address; 
    public Student(int rollno, String name, String address) { 
            this.rollno = rollno; 
            this.name = name; 
            this.address = address; 
    } 
    @Override
    public String toString() { 
        return this.rollno + " " + this.name + " " + this.address; 
    }
} 
class Sortbyroll implements Comparator<Student> { 
        @Override
	public int compare(Student a, Student b) { 
		return a.rollno - b.rollno; 
	}
} 
public class Sort_comparator { 
	public static void main (String[] args) 
	{ 
		ArrayList<Student> ar = new ArrayList<>(); 
		ar.add(new Student(111, "bbbb", "london")); 
		ar.add(new Student(131, "aaaa", "nyc")); 
		ar.add(new Student(151, "dddd", "jaipur"));
		ar.add(new Student(121, "ffff", "dhaka"));
		ar.add(new Student(141, "cccc", "chittagong"));

		System.out.println("\\Unsorted\\"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\n\\Sorted by rollno\\"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
	} 
}
