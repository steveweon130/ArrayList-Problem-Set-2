import java.util.ArrayList;

public class Question2 {
    public static String GoldbachConjecture(int num) {
        ArrayList<Integer> list = Question1.findPrime(num);
        Integer a;
        Integer b = 0;
        
        for (int r = 0; r < list.size(); r++) {
            for (int i = 0; i < list.size(); i++) {
                a = list.get(i);
                if (a + b == num) {
                    return num + " = " + b + " + " + a;
                }
            }
            b = list.get(r);
        }
        
        return "there is none";
    }
    
    public static void main (String[] args) {
        System.out.println(GoldbachConjecture(120));
    } 
}