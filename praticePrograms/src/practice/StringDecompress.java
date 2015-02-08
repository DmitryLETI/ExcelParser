package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * This will take input as b3a5c6 and give output as
 * bbbaaaaacccccc
 * 
 */
public class StringDecompress {
	// pre-considering string format will be just fine. 
	public String decompress(String inputText){
		char[] array = inputText.toCharArray();
		String output = "";
		if(inputText != null && inputText.length()>0){
			for(int i=1;i<array.length;i=i+2){
				char currentChar = array[i-1];
				for(int j=1;j<=Integer.parseInt(array[i]+"");j++){
					output +=currentChar;
				}
			}
		}
		return output;
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your string in following pattern a3b5c4 etc");
		try {
			String input = br.readLine();
			StringDecompress obj = new StringDecompress();
			System.out.println(obj.decompress(input));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
