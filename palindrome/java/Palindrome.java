// Implement a method to return true if a string is a palindrome
// and false otherwise.

// I will choose to ignore case -- so, "Aa" is a palindrome

class Palindrome {

   public static boolean isPalindrome_recursive(String s) {
      if (s == null) {
         return true;
      }
      else {
         int length = s.length();
         if (length == 0 || length == 1) {
            return true;
         }
         else if (Character.toLowerCase(s.charAt(0)) !=
                  Character.toLowerCase(s.charAt(length-1))) {
            return false;
         }
         else if (length == 2) {
            return true;
         }
         else {
            return isPalindrome_recursive(s.substring(1,length-1));
         }
      }
   }
   
   public static boolean isPalindrome_iterative(String s) {
      if (s == null) {
         return true;
      }
      else {
         int length = s.length();
         if (length == 0 || length == 1) {
            return true;
         }
         else {
            int halfLength = length / 2;
            for (int i = 0; i < halfLength; ++i) {
               if (Character.toLowerCase(s.charAt(i)) !=
                   Character.toLowerCase(s.charAt(length - 1 - i))) {
                  return false;
               }
            }
            // Never found a mismatch -- must be a palindrome
            return true;
         }
      }
   }

}
