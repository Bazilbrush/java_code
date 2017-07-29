package com.FirstProgram.ex1;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Spring;




public class FirstProgram {



	public static void main(String[] args ) {
		
		//Array of constants
		int[] constArray = { 0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5,
				   0xd807aa98, 0x12835b01, 0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174,
				   0xe49b69c1, 0xefbe4786, 0x0fc19dc6, 0x240ca1cc, 0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da,
				   0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 0x06ca6351, 0x14292967,
				   0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85,
				   0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070,
				   0x19a4c116, 0x1e376c08, 0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3,
				   0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2};
		

		Scanner reader = new Scanner(System.in);  // Reading from System.in 
		System.out.println("user input "); 
		String n = reader.nextLine();  
		System.out.println(n);  
		int p = n.length();   //original message length
		if (p < 55){

			String n1 = String.format("%-56s", n).replace(' ', '0');    //may change to 55 chars
			int p1 = n1.length();
			int b1 = n1.getBytes().length;
			int b = n.getBytes().length;
			System.out.println(b1*8);  //new message length /8 to get bits
			System.out.println(b*8);  //original length
			System.out.println(n1);
			//convert to string 64 bits long
			int OriginalMessage = b*8;  // pad string length to take up 64 bits in memory
			String PaddedMessage = String.format("%8s", OriginalMessage).replace(' ', '0');
			System.out.println(PaddedMessage);
			//tac paddedmessage onto new message
			n1 = n1.concat(PaddedMessage);
			System.out.println(n1);
			//int FinalLength = n1.length();
			//System.out.println(FinalLength);
			//find out bit length of original message and padded
			/* a = b;
		    int c = 0;

		    c = a >> 1;
			System.out.println(c);*/
			//Convert message to hex
			//stick into array step through it
			

			char[] MessageArray = n1.toCharArray();
			System.out.println(MessageArray.length);
			String fullString = "";
			for(int i = 0; i < MessageArray.length; i ++) {
			String toHex =String.format("%02X", (int)MessageArray[i]);  //size of the hex number
			//System.out.println(toHex);
			fullString = fullString.concat(toHex);
			
			}
			System.out.println("full string in hex: "+fullString);  //full string
			System.out.println("length of hex string in chars "+fullString.length());
			fullString = fullString.concat(String.format("%-384s", "").replace(' ', '0'));
			List<String> splitArray = new ArrayList<String>();
			for (int i = 0; i<=(fullString.length()  - 8); i+=8) { // fullString.length() - 4  32
			   String splitString = fullString.substring(i, i+8);
			   //List<String> splitArray = new ArrayList<String>();
			   splitArray.add(splitString);  //append every 4 chars as a member of an array
			   //System.out.println(splitArray); //display the array
			  //check order of array
			   
			}
			
			int length = splitArray.size();
			System.out.println(splitArray);
			System.out.println(length);
			//extend the array
			List<String> shiftedArray = new ArrayList<String>();
			for (int i = 16; i<64; i++){
				//parseInt(DATA, format) => parseInt(data, 16) for base 16
				int s0 =(Integer.parseInt(splitArray.get(i-15), 16) >> 7) ^ (Integer.parseInt(splitArray.get(i-15), 16) >> 18) ^ (Integer.parseInt(splitArray.get(i-15), 16) >>> 3);
				
				int s1 =(Integer.parseInt(splitArray.get(i-2), 16) >> 17) ^ (Integer.parseInt(splitArray.get(i-2), 16) >> 19) ^ (Integer.parseInt(splitArray.get(i-2), 16) >>> 10);
				
				shiftedArray.add(Integer.toString(Integer.parseInt(splitArray.get(i-16), 16)+s0+Integer.parseInt(splitArray.get(i-7), 16)+s1));
				//	shiftedArray.add(Integer.toString(Integer.parseInt(splitArray.get(i-16))+s0));
				
				
			}
			System.out.println(shiftedArray);
	}
	//System.out.println(p);

}
}

