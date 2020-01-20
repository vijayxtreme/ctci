package checkPermutations;
import java.util.Arrays;

class CheckPermutations {

    boolean isPermutation(String string1, String string2){
        char[] c1 = string1.toCharArray();
        char[] c2 = string2.toCharArray();
        Arrays.sort(c1);
        System.out.println(c1);
        Arrays.sort(c2);
        System.out.println(c2);
        if(new String(c1).equals(new String(c2))){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
       CheckPermutations c = new CheckPermutations();
       System.out.println(c.isPermutation("hello", "hello"));

    }
}