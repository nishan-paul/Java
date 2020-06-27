class A {
    static void a() {
        int[] a=new int[5];//declaration and instantiation  
        a[0]=10;//initialization  
        a[1]=20;  
        a[2]=70;  
        a[3]=40;  
        a[4]=50;  
        //traversing array  
        for(int i=0;i<a.length;i++) { //length is the property of array  
            System.out.println(a[i]);
        }
    }

    static void b() {
        int[] a={33,3,4,5};//declaration, instantiation and initialization  
        //printing array
        for(int i=0;i<a.length;i++) { //length is the property of array  
            System.out.println(a[i]);
        }  
    }
    
    static void c() {
        int[] arr={33,3,4,5};  
        //printing array using for-each loop  
        for(int i:arr) {
            System.out.println(i); 
        }
    }
    
    static void d(int[] arr){  
        int min=arr[0];  
        for(int i=1;i<arr.length;i++) {
            if(min>arr[i])  
                min=arr[i];  
        }
        System.out.println(min);
    }
    
    static void e(int[] arr) {
        for(int i=0;i<arr.length;i++) { //length is the property of array  
            System.out.println(arr[i]);
        }
    }
    
    static int[] f() {
        return new int[]{10,22,44,66};
    }
    
    static void g() {
        int[][] arr={{1,2,3},{2,4,5},{4,4,5}};//declaring and initializing 2D array  
        //printing 2D array  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
                System.out.print(arr[i][j]+" ");  
            }
            System.out.println();  
        }
    }
    
    static void h() {
        //declaring a 2D array with odd columns  
        int[][] arr = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for(int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;
   
        //printing the data of a jagged array   
        for(int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }
    }
    
    static void i() {
        //declaration and initialization of array  
        int arr[]={4,4,5};  
        //getting the class name of Java array
        Class c=arr.getClass(); 
        String name=c.getName();
        //printing the class name of Java array
        System.out.println(name);
    }
    
    static void j() {
        int[] a = {1,2,3};
        int[] b = a.clone();
        System.out.println( a==b );
    }
}

public class d_arrays_class {

    public static void main(String[] args) {
        A.a();
        
        A.b();
        
        A.c();
        
        int[] a={33,3,4,5};//declaring and initializing an array  
        A.d(a);
        
        A.e(new int[]{10,22,44,66});//passing anonymous array to method 
        
        int[] arr = A.f();
        for(int i=0;i<arr.length;i++) { //length is the property of array  
            System.out.println(arr[i]);
        }
        
        A.g();
        
        A.h();
        
        A.i();
        
        A.j();
    }

}
