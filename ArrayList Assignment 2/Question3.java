import java.util.ArrayList;

public class Question3 {
    public static ArrayList<Integer> BigInt(String num) {
        ArrayList<Integer> big = new ArrayList<Integer>(num.length());
        
        for(int i = 0; i < num.length(); i++) {
            big.add(Integer.valueOf(num.substring(i,i+1)));
        }
        
        return big;
    }
    
    public static String AddBigInt(ArrayList<Integer> a, ArrayList<Integer> b) {
        String sumStr = "";
        int addToNextDigit = 0;
        int sumdigits = 0;
        
        if (a.size() > b.size()) {
            sumdigits = a.size() + 1;
            for (int i = 0; i < (a.size() - b.size() + 1); i++) {
                b.add(0, 0);
            }
        }
        else if (a.size() < b.size()) {
            sumdigits = b.size() + 1;
            for (int i = 0; i < (b.size() - a.size() + 1); i++) {
                a.add(0, 0);
            }
        }
        else sumdigits = a.size() + 1;
        
        ArrayList<Integer> sum = new ArrayList<Integer>(sumdigits);
        
        for (int i = 1; i < sumdigits; i++) {
            Integer currentsum;
            currentsum = a.get(a.size()-i) + b.get(b.size()-i) + addToNextDigit;
            if (currentsum >= 10) {
                sum.add(0, currentsum - 10);
                addToNextDigit = 1;
            }
            else {
                sum.add(0, currentsum);
                addToNextDigit = 0;
            }
        }
        if (addToNextDigit == 1) sum.add(0, addToNextDigit);
        
        for (int i = 0; i < sum.size(); i++) {
            sumStr += sum.get(i);  
        }
        
        return sumStr;
    }
    
    public static void main (String[] args) {
        String a = "9798799842";
        String b = "93456789587";
        System.out.println(a + " + " + b + " = " + AddBigInt(BigInt(a),BigInt(b)));        
    }
}