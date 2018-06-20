package main;
import java.util.Arrays;
public class StringReverse {
    
    
    public String func ( String str ) {
        
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse;
    }
    
   public boolean func1( String str ) {
        
       String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);
        
       if ( str.equals(reverse) )
        {   
            return true; }
        
        else { return false;}
    }
}