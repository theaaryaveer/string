public class largestString {
    // Here, the largest string is determined lexicogrphically, which means
    //as per the number of order they're in in alphabet.
    public static void main(String[] args) {
        // out of all these, m definitely comes later than a and b so output will be mango
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i = 1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
