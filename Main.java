public class Main{
    public static void main(String[] args) {

        String str = "racecar";
        String reversed = "";

        // Practice Problem #1
        for(int i = 0; i < str.length(); i++){
            reversed = str.substring(i, i+1) + reversed;
        }
        System.out.println(reversed);
    

        // Practice Problem #2
        System.out.println(str + reversed);

        // Practice Problem #3

        if (str.equals(reversed)){
            System.out.println("This is a Palindrome!");
        }
        else{
            System.out.println("This is not a Palindrome :(");
        }
        
}
}