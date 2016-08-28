import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPalindrome {

   @Test
   public void testNull() 
   {
      assertTrue(Palindrome.isPalindrome_recursive(null));
      assertTrue(Palindrome.isPalindrome_iterative(null));
   }

   @Test
   public void testEmpty() 
   {
      assertTrue(Palindrome.isPalindrome_recursive(""));
      assertTrue(Palindrome.isPalindrome_iterative(""));
   }
   
   @Test
   public void testSingleCharacter() 
   {
      assertTrue(Palindrome.isPalindrome_recursive("a"));
      assertTrue(Palindrome.isPalindrome_iterative("a"));
      assertTrue(Palindrome.isPalindrome_recursive("1"));
      assertTrue(Palindrome.isPalindrome_iterative("1"));
   }

   @Test
   public void testTwoCharacters() 
   {
      assertTrue(Palindrome.isPalindrome_recursive("aa"));
      assertTrue(Palindrome.isPalindrome_iterative("aa"));
      assertTrue(Palindrome.isPalindrome_recursive("Aa"));
      assertTrue(Palindrome.isPalindrome_iterative("Aa"));
      assertFalse(Palindrome.isPalindrome_recursive("ab"));
      assertFalse(Palindrome.isPalindrome_iterative("ab"));
      assertTrue(Palindrome.isPalindrome_recursive("11"));
      assertTrue(Palindrome.isPalindrome_iterative("11"));
      assertFalse(Palindrome.isPalindrome_recursive("1a"));
      assertFalse(Palindrome.isPalindrome_iterative("1a"));
      assertFalse(Palindrome.isPalindrome_recursive("12"));
      assertFalse(Palindrome.isPalindrome_iterative("12"));
   }

   @Test
   public void testThreeCharacters() 
   {
      assertTrue(Palindrome.isPalindrome_recursive("aba"));
      assertTrue(Palindrome.isPalindrome_iterative("aba"));
      assertTrue(Palindrome.isPalindrome_recursive("Aba"));
      assertTrue(Palindrome.isPalindrome_iterative("Aba"));
      assertFalse(Palindrome.isPalindrome_recursive("abc"));
      assertFalse(Palindrome.isPalindrome_iterative("abc"));
      assertTrue(Palindrome.isPalindrome_recursive("121"));
      assertTrue(Palindrome.isPalindrome_iterative("121"));
      assertFalse(Palindrome.isPalindrome_recursive("1ba"));
      assertFalse(Palindrome.isPalindrome_iterative("1ba"));
      assertFalse(Palindrome.isPalindrome_recursive("122"));
      assertFalse(Palindrome.isPalindrome_iterative("122"));
   }

   @Test
   public void testManyCharacters() 
   {
      assertTrue(Palindrome.isPalindrome_recursive("RaCecAr"));
      assertTrue(Palindrome.isPalindrome_recursive("RaCecAr"));
      assertTrue(Palindrome.isPalindrome_recursive("123456789AbCdcBa987654321"));
      assertTrue(Palindrome.isPalindrome_iterative("123456789AbCdcBa987654321"));
      assertTrue(Palindrome.isPalindrome_recursive("aaaaaaaaaaBaaaaaaaaaa"));
      assertTrue(Palindrome.isPalindrome_iterative("aaaaaaaaaaBaaaaaaaaaa"));
   }
}
