public class Demo014 {
    public static void main(String[] args) {
        int a = 5;
        int b = +a; 
        System.out.println("Unary Plus: " + b);
        int c = -a;
        System.out.println("Unary Minus: " + c); 
        
        int d = ++a;  
        System.out.println("Pre-increment: " + d); 
        
        int e = a++; 
        System.out.println("Post-increment: " + e);
        System.out.println("Value of a after post-increment: " + a); 

        int f = --a; 
        System.out.println("Pre-decrement: " + f); 
        
        int g = a--;  
        System.out.println("Post-decrement: " + g); 
        System.out.println("Value of a after post-decrement: " + a);
        
    
        boolean h = true;
        boolean i = !h;  
        System.out.println("Logical NOT: " + i); 
    }
}
