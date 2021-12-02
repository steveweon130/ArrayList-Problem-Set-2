import java.util.ArrayList;

public class Question1 {
    public static ArrayList<Integer> findPrime(Integer num) {
        ArrayList<Integer> list = new ArrayList<Integer>(num+1);
        list.add(2);
        int prime = 1;
        int factor = 3;
        
        for (int i = 3; i <= num; i++) {
            if (i % 2 != 0) list.add(i);
        }
        
        for (int rep = 0; rep < list.size()-prime; rep++) {
            for (int i = prime+1; i < list.size(); i++) {
                if (list.get(i) % factor == 0) {
                    list.remove(i);
                    i--;
                }
            }
            prime++;
            factor = list.get(prime);
        }
        
        return list;
    }
    
    public static void main (String[] args) {
        System.out.println(findPrime(1000));
    }
}