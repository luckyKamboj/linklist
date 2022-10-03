package collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashVsIdentityMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1","11");
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put("1","11");

        // checks elements from string constant pool
        System.out.println(hashMap.containsKey("1"));                               // true
        System.out.println(identityMap.containsKey("1"));                           // true

        // Run time String Object creation
        // new object gets created, and we will get the reference of object which
        // is present in heap memory.
        System.out.println(hashMap.containsKey(new String("1")));            // true
        System.out.println(identityMap.containsKey(new String("1")));        // false

        // Run time String Object creation
        // Hence it gets generated in heap memory.
        System.out.println(hashMap.containsKey(String.valueOf(1)));                 // true
        System.out.println(identityMap.containsKey(String.valueOf(1)));             // false

    }
}
