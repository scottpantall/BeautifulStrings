/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            BeautifulString(line);
        }
    }
    
    public static void BeautifulString(String line) {
        //System.out.println(line.length());
        char[] chars = line.toLowerCase().toCharArray();
        //boolean blah = Character.isLetter('.');
        HashMap countMap = new HashMap(); //key = letter, value = count of that letter
        
        // Get first character
        // If character is a letter...
            // Count how many times that letter is in the string.
            // Put that result into a Collection
        // Get next character
        // If character is a letter...
            // Checkt to see if it's in the Collection
            // If not then
            // Count how many times that letter is in the string.
            // Put that result into a Collection
        // Get next character
        // and on and on...
        
        for(int i = 0; i < chars.length; i++) {
            
            // If the character is a letter and is not already in the countMap
            if(Character.isLetter(chars[i]) && !countMap.containsKey(chars[i])) {
                int count = 0;
                for(int j = 0; j < chars.length; j++) {
                    if(chars[i] == chars[j]) {
                        count++;
                    }
                }
                
                countMap.put(chars[i], count);
            }
        }
        
        System.out.println(countMap.size());
        System.out.println(countMap.values());

    }
}
