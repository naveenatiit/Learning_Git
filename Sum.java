public class Sum {
    int a = 5, b = 7;
    public int sum(int a, int b) {
        return a+b;
    }
    int c = sum(a,b);
    
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.print(s.c);
    }
}