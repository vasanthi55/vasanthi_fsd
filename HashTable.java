/*Author: Vasanthi
 *Employee Id:844587
 *Description: Handling Unchecked Exception.
 * */
package com.collections;

import java.util.Hashtable;

public class HashTable { 
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable<Integer, String> h = 
                      new Hashtable<Integer, String>(); 
  
        Hashtable<Integer, String> h1 = 
                      new Hashtable<Integer, String>(); 
  
        h.put(3, "hi"); 
        h.put(2, "welcome"); 
        h.put(1, "world"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable<Integer, String>)h.clone(); 
  
        // checking clone h1 
        System.out.println("values in clone: " + h1); 
  
        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("after clearing: " + h); 
    } 
} 