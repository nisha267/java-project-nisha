package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vowel {
public static void main(String[]args)throws IOException {
	File f=new File("input.txt");
	String[]s=null;
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String st;
	int flag=0;
	while((st=br.readLine())!=null)
	{
	s=st.split(" ");
	for(int i=0;i<s.length;i++) {
		for (int j=0;j<s[i].length();j++)
		{char ch=s[i].charAt(j);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			flag=1;
		}}
if(flag==1)
{System.out.println(s[i]);}
flag= 0;
		


}
}}}
