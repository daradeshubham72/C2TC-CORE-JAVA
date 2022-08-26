package com.cg.Strings;

public class StringJoinTheNameSurname1 {

	public static void main(String[] args) {
		String s=new String("Avantika");
		s.concat("Bhist");//String immutable(cannot be changed)
		                 //concat.used to get the string words together
		                 //in this case to make name and surname together
         System.out.println(s);
	


         StringBuffer s1=new StringBuffer("Avantika");//StringBuffer is mutable(can be changed)
         s1.append("Bisht");  // append is used instead of concat while using StringBuffer
         System.out.println(s1);
         
         
         }
         
         
}
         