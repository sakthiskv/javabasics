package com.basic;
import java.util.*;
import java.lang.*;

public class Swap{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        int len=s1.length;
        //System.out.println("Is Ydto Tnemssessaerp");
    
        for(int i=0;i<len-1;i+=2)
        {
            char[] ch=s1[i].toCharArray();
            for(int j=1;j<len;j+=2)
            {
                char[] ch1=s1[j].toCharArray();
                if(ch.length==ch1.length)
                {
                    String s2=s1[i];
                    s1[i]=s1[j];
                    s1[j]=s2;
                }
                if(ch.length>ch1.length)
                {
                String s3=s1[i];
                s1[i]=s1[j];
                s1[j]=s3;
                StringBuffer sb1=new StringBuffer(s1[j]);
                s1[j]=sb1.reverse().toString();
               // System.out.println(s1[j]);
                }
                break;
            }
        }
        if(len%2!=0)
        {
        	StringBuffer sb=new StringBuffer(s1[len-1]);
           s1[len-1]=sb.reverse().toString();
        }
        for(int k=0;k<s1.length;k++)
         {
             String s6=s1[k];
             String s7=s6.substring(0,1).toUpperCase();
             String s8=s7+s6.substring(1);
             System.out.print(s8+" ");
             
         }
    }
}
      // System.out.print(s7+" ");
