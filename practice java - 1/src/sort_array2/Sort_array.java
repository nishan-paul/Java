package sort_array2;

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
public class Sort_array { 
    public static void main (String[] args) { 
        Student ar[] ={ new Student(111, "bbbb", "london"),
                        new Student(131, "aaaa", "nyc"),
                        new Student(151, "dddd", "jaipur"),
                        new Student(121, "ffff", "dhaka"),
                        new Student(141, "cccc", "chittagong")
        }; 

        System.out.println("\\Unsorted\\"); 
        for (int i=0; i<5; i++) 
            System.out.println(ar[i].toString()); 

        Arrays.sort(ar, new Sortbyroll());

        System.out.println("\n\\Sorted by rollno\\"); 
        for (int i=0; i<5; i++) 
            System.out.println(ar[i].toString()); 
    } 
}
