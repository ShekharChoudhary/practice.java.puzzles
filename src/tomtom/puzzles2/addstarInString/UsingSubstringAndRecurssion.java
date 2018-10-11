package tomtom.puzzles2.addstarInString;

public class UsingSubstringAndRecurssion {

	public static void main(String[] args) {
		System.out.println(manipulatedString("abcde"));
	}
	public static String manipulatedString(String s)
    {
           String finalString = null;
           int length = s.length();
           if(length == 1)
           {
        	      finalString = s;
                  return finalString;
           }
           else
           {
                  int i=0;
                  finalString = Character.toString(s.charAt(i));
                  finalString = finalString + "*" + manipulatedString(s.substring(i+1));
                  i++;
                  length--;
           }
           
           return finalString;
    } 

}
