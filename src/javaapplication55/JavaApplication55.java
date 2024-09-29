
package javaapplication55;

import java.util.HashMap;
import java.util.Map;


public class JavaApplication55 {

    public static void main(String[] args) {
        // TODO code application logic here
        
       Map<Integer,String> map = new HashMap<>();
       map.put(1,"Patrick");
       map.put(2, "Njabu");
       map.put(3, "Thabo");
     for(Integer i:map.keySet()){
         System.out.println("Key:"+i+"\tValue:"+map.get(i)); 
    }
        System.out.println("number 2 value is "+map.get(2));
        System.out.println("\n\n");
       map.remove(1);
       for(Integer i:map.keySet()){
         System.out.println("Key:"+i+"\tValue:"+map.get(i)); 
    }
     for(Integer i:map.keySet()){
         if(map.get(i).equalsIgnoreCase("Njabu")){
             System.out.println("found"); 
         }
     }
    }
    
}
