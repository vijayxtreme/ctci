package isUnique;

/* 
Is Unique: Implement an algorithm to determine if a string has all unique characters. <-- Not just alphabet, includes alphanumeric.
What if you cannot use additional data structures?
*/

class Algo {
    
    boolean testUnique(String str){
        if(str.length() > 128){
            return false;
        }
        
        boolean[] char_set = new boolean[128]; //constant

        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            System.out.println(val);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str = "aHelz";
        
        Algo a = new Algo();
        Boolean result = a.testUnique(str);

        if(result){
            System.out.println("Is Unique");
        }else { 
            System.out.println("Not unique");
        }
    }

}
    /*
Solution:
Ask if we are looking at all unique characters in ASCII or Unicode or something else.  Depending on the encoding, the number of values to check will be larger or smaller.   ASCII goes up to 256 characters, of which 128 are alphanumeric.

If the length of our string is greater than 128, then we are repeating characters.  So we can return false.

To check if we already came across the value before, we can get the value of the letter and convert it to ascii number, then save "true" for an array of size 128 for the ascii "index".   If we come across this number again, we know that the string is not unique.   

Time wise: 
O(N). Have to travel the entire array in worst case to see if unique.

Space wise:
O(c) for the boolean array where c is a constant, or just O(1) constant time.

*/