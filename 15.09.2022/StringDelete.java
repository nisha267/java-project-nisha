//Write a Java Program to Delete All Repeated Words in String.
package string.com;

public class StringDelete {
public static void main(String[]args)
{String s="I want to go to Rajasthan";

String r="";
String[] words=s.split(" ");
for (int i=0;i<words.length;i++) {
	for (int j=i+1;j<words.length;j++)
	{ if(words[i].equals(words[j])){
		words[j]="remove";
	}
}
}
for(String w:words) {
	if(w!="remove") {r=r+w+"";
		
		
	}
}System.out.println("The sentence after removing the duplicate words"+r);
}
}
