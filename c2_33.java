class GFG { 
  
    // Function to convert String to Short 
    public static short convertStringToShort(String str) 
    { 
  
        // Convert string to short 
        // using parseShort() method 
        return Short.parseShort(str); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // The string value 
        String stringValue = "1"; 
  
        // The expected short value 
        short shortValue; 
  
        // Convert string to short 
        shortValue = convertStringToShort(stringValue); 
  
        // Print the expected short value 
        System.out.println( 
            stringValue 
            + " after converting into short = "
            + shortValue); 
    } 
} 