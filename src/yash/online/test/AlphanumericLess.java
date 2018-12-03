package yash.online.test;

import java.util.ArrayList;
import java.util.List;

public class AlphanumericLess {
	
	public static void main(String[] args) {
		AlphanumericLess ap = new AlphanumericLess();
		String []  value = ap.getTokens("ab01c004");
		
	}

	void alphanumericLess(String s1, String s2) {
		
	    String[] l1 = getTokens(s1);
	    String[] l2 = getTokens(s2);
	    int length = Math.max(l1.length,l2.length);
	    
	    
	    
	    /*
	    for(int i=0;i< length;i++) {
	        if(i==l1.Length)
	            return true;
	        if(i==l2.Length)
	            return false;
	        
	        if(!isDigit(l1[i]) && !isDigit(l2[i])) {
	            if(String.Compare(l1[i],l2[i],false)<0)
	                return true;
	            else if(String.Compare(l1[i],l2[i],false)>0)
	                return false;
	        }
	        else if(isDigit(l1[i])||isDigit(l2[i])) {
	            if(isDigit(l1[i])&&isDigit(l2[i])) {
	                if(int.Parse(l1[i])==int.Parse(l2[i]))
	                    return l1[i].Length>l2[i].Length;
	                else
	                    return int.Parse(l1[i])<int.Parse(l2[i]);
	            }
	            else if(isDigit(l1[i]))
	                return true;
	            else 
	                return false;
	            
	        }
	    }
	    return false;
	    */
	    
	    
	}
	String[] getTokens(String s) {
	    List<String> result = new ArrayList<>();
	    char [] strarr = s.toCharArray();
	    boolean isDigit = false;
	    char currentC;
	    String strItem="";
	    
	    for(int index=0;index<strarr.length;index++) {
	    	
	        currentC = strarr[index];
	        if(48<=currentC && currentC <=57) {
	            if(isDigit)
	                strItem+=currentC;
	            else {
	                strItem=""+currentC;                
	            }
	            isDigit= true;
	        }
	        else {
	            result.add(""+currentC);
	            strItem="";
	            isDigit = false;
	        }
	    }
	    if(isDigit && strItem != null)
	        result.add(strItem);
	    String [] output = new String[result.size()];
	    for(int  i =0;i<output.length;i++) {
	    	output[i] = result.get(i);
	    }
	    return output;
	}
	
	/*boolean isDigit(String s) {
		try {
	    int test  = Integer.parseInt(s);
		} catch(Exception e) {
			
		}
	    return test;
	}*/
}
