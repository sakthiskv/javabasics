package com.basic;
import java.util.*;

public class Runtime {
       public static void main(String args[]){  
         String input = "10 tea 20 coffee 30 tea buiscuits";  
         Scanner a = new Scanner(input).useDelimiter("\\s");  
         System.out.println(a.next());  
         System.out.println(a.next());  
         System.out.println(a.next());  
         System.out.println(a.next());  
         System.out.println(a.next()); 
         System.out.println(a.next()); 
         System.out.println(a.next()); 
         a.close();   
    }}  


