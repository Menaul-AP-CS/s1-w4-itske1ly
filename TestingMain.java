public class TestingMain {
     public static void main(String[] args) {
        
        // Step 0: Declare a String object with the value "Hello World"
        // You can name the reference anything you want
         String s1 = "Hello World";


        // Step 1: Call length()
        // Q1. What do you expect the number printed is? Count carefully!
        // Q2. Call the method and print the result. Does it include spaces?
         System.out.println(s1.length());


        // Step 2: Call indexOf("H")
        // Q4. What index is printed for "W"?
        // Q5. What happens if you search for "w"? Why is the answer different?
        // Q6. What happens if the letter is not found at all?
        // Q7. What is the index of the first letter?
         System.out.println(s1.indexOf("H"));


        // Step 3: Call substring(8)
        // Q7. What is printed when you use one parameter in substring?
        // Q8. Which index does it start at, and where does it stop?
        // Q9. What do you expect substring(s.length()) would print?
         System.out.println(s1.substring(8));


        // Step 4: Call substring(1,3)
        // Q10. What is printed with two parameters?
        // Q11. Does the second parameter’s index get included or excluded?
        // Q12. Predict what happens if you flip them (substring(3,1)) —
        //       Will it work, or cause an error? Why?
         System.out.println(s1.substring(1,3));



        // Additional Question:
        // Declare a String object with the value "null" <- String x = null;
        // Try some of the methods on this object, what do you get?
        // What does the error say?
     //bgbgbg
      int a = 5;
      int b = 8;
      int c = 3;
        System.out.println(a + b / c * 2);
        System.out.println(5.0+2/4);
     }

}
