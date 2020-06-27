package sort_comparable;

import java.util.*; 
//class Student { 
class Student implements Comparable<Student>{ 
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
    @Override
    public int compareTo(Student a) { 
        return this.rollno-a.rollno; 
    }
} 
public class Sort_comparable { 
    public static void main (String[] args) { 
        ArrayList<Student> ar = new ArrayList<>(); 
        
        ar.add(new Student(111, "bbbb", "london")); 
        ar.add(new Student(131, "aaaa", "nyc")); 
        ar.add(new Student(151, "dddd", "jaipur"));
        ar.add(new Student(121, "ffff", "dhaka"));
        ar.add(new Student(141, "cccc", "chittagong"));

        System.out.println("\\Unsorted\\"); 
        for (int i=0; i<ar.size(); i++) 
                System.out.println(ar.get(i)); 

        Collections.sort(ar);

        System.out.println("\n\\Sorted by rollno\\"); 
        for (int i=0; i<ar.size(); i++) 
                System.out.println(ar.get(i)); 
    } 
}
