package sha256;

import java.util.ArrayList;
import java.util.List;

public class preProcess {
	
	
	public String padMes(String input){
		//Pad message to correct length
		int p = input.length();   //original message length
		//create new string padded to 56 chars;
		String input1 = String.format("%-56s", input).replace(' ', '0');    //may change to 55 chars
		
		int p1 = input1.length();  //new length
		
		int b1 = input1.getBytes().length;  //new length is bytes
		
		int b = input.getBytes().length;   //old length is bytes
		
		//test outputs----------------------------------------------
		//System.out.println("new Mess: "+b1*8+" bits");  //new message length /8 to get bits
		//System.out.println("old mess: "+b*8+" bits");  //original length
		//System.out.println("new message: "+input1);  //new message
		//------------------------------------------------------------
		
		int OriginalMessage = b*8;  // pad string length to take up 64 bits in memory
		String PaddedMessage = String.format("%8s", OriginalMessage).replace(' ', '0');
		System.out.println(PaddedMessage);
		//tac paddedmessage onto new message
		input1 = input1.concat(PaddedMessage);
		
		System.out.println("new Message with length on the end: "+input1);
	return input1;   //returns the value of the message for further process
	}
	
	
	
	public List<String> toHex(String input1){
		
		char[] MessageArray = input1.toCharArray();  //copy our string to a char array
		
		
		//System.out.println(MessageArray.length);  //length in chars
		String fullString = "";   //initialise an empty string
		//step through the array and covert each character to hex and add to array
		for(int i = 0; i < MessageArray.length; i ++) {
			
			//String toHex = toHexString(MessageArray[i]);
			
			String toHex =String.format("%x", (int)MessageArray[i]);  //size of the hex number &02X
			//int toint = Integer.parseInt(toHex);
			
			//int hex = Integer.parseInt(toint, 16);
			//System.out.println(toHex);
			fullString = fullString.concat(toHex);
		
		}
		//System.out.println("Full string in hex: "+fullString);  //full string
		
		System.out.println("length of hex string in chars "+fullString.length());
		
		//pad string to 512 positions
		fullString = fullString.concat(String.format("%-384s", "").replace(' ', '0'));  
		//create array to old them
		List<String> splitArray = new ArrayList<String>();
		//step through the string splitting each number into 1 array member
		for (int i = 0; i<=(fullString.length()  - 8); i+=8) { // fullString.length() - 4  32
		   String splitString = fullString.substring(i, i+8);
		   //
		   splitArray.add(splitString);  //append every 4 chars as a member of an array
		   //System.out.println(splitArray);//display the array
		  //check order of array
		}
		
		//System.out.println(splitArray);
		return splitArray;
	}
	
 public List<String> extend(List<String> x ){
	 
	 System.out.println(x);
	 //create empty array to hold the shifted stuff
	 List<String> shiftedArray = new ArrayList<String>();
		int length = x.size();
		//System.out.println(splitArray);
		System.out.println("array length: "+length);  //array length where first 16 members are the message
		//extend the array
		
		String longResult ="";
		//Step through array members pulling out each member
		for (int i = 16; i<64; i++){//i =16
			//place each member in to 1 string
			String word = x.get(i-15);
			String word1 = x.get(i-2);
			String word2 = x.get(i-16);
			String word3 = x.get(i-7);
			int s0, s1, s2, s3;
			
			//for each string step through it pulling out 4 tuples, 8/4=2  5
			for(int j = 0; j<=5; j+=2){
				
				String subWord =word.substring(j, j+2);
				int subword = Integer.parseInt(subWord, 16);   //parse the tuples as a HEX number
				//process each tuple 
				s0 =(Integer.rotateRight(subword, 7) ^  Integer.rotateRight(subword, 18) ^ (subword >> 3)); 
				//System.out.println(s0);
				//System.out.println();
				String subWord1 =word1.substring(j, j+2);
				int subword1 = Integer.parseInt(subWord1, 16);   //parse the tuples as a HEX number
				//process each tuple 
				 s1 =(Integer.rotateRight(subword1, 17) ^  Integer.rotateRight(subword1, 19) ^ (subword1 >> 10)); 
				//System.out.println(s1);
				//System.out.println();
				 
				String subWord2 =word2.substring(j, j+2);
				String subWord3 =word3.substring(j, j+2);
					//System.out.println(subWord3);
				s2 = Integer.parseInt(subWord2, 16);
				s3 = Integer.parseInt(subWord3, 16);
				int result = s2 + s0 + s3 + s1;	 
				//System.out.println(result);
				if(result != 0){
				
				String result1;
				result1 = Integer.toString(result);
				//System.out.println();
				
				longResult = result1;
				//System.out.println(result1);
				}
			}
			x.remove(i);
			x.add(i, longResult);
			//parseInt(DATA, format) => parseInt(data, 16) for base 16
			//int s0 =(Integer.parseInt(x.get(i-15), 16) >> 7) ^ (Integer.parseInt(x.get(i-15), 16) >> 18) ^ (Integer.parseInt(x.get(i-15), 16) >>> 3);
			
			//int s1 =(Integer.parseInt(x.get(i-2), 16) >> 17) ^ (Integer.parseInt(x.get(i-2), 16) >> 19) ^ (Integer.parseInt(x.get(i-2), 16) >>> 10);
			//int s0 =  (Integer.parseInt(x.get(i-16)) >> 2);  //shifts in decimal
			//shiftedArray.add(Integer.toString(s0));
			//shiftedArray.add(Integer.toString(Integer.parseInt(x.get(i-16), 16)+s0+Integer.parseInt(x.get(i-7), 16)+s1));
			//	shiftedArray.add(Integer.toString(Integer.parseInt(splitArray.get(i-16))+s0));
			
		}
		//System.out.println("string length: "+longResult.length());
		//System.out.println(x);
		/// int len = x.size();
			//System.out.println(splitArray);
			//System.out.println("array length: "+len);
		return x;
		
		
}
 
 public void compressor (List<String> x){
	 		//initialise hash values
	 //(first 32 bits of the fractional parts of the square roots of the first 8 primes 2..19):
	 		int h0 = 0x6a09e667;
			int h1 = 0xbb67ae85;
			int h2 = 0x3c6ef372;
			int h3 = 0xa54ff53a;
			int h4 = 0x510e527f;
			int h5 = 0x9b05688c;
			int h6 = 0x1f83d9ab;
			int h7 = 0x5be0cd19;
			
			//init working variables to the hash values
			long a = h0;
			long b = h1;
			long c = h2;
			long d = h3;
			long e = h4;
			long f = h5;
			long g = h6;
			long h = h7;
 
			
			//init array for constants
			int[] constArray = { 0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5,
					   0xd807aa98, 0x12835b01, 0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174,
					   0xe49b69c1, 0xefbe4786, 0x0fc19dc6, 0x240ca1cc, 0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da,
					   0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 0x06ca6351, 0x14292967,
					   0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85,
					   0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070,
					   0x19a4c116, 0x1e376c08, 0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3,
					   0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2};
				
			for (int i=0; i<=63; i++){
				long s1 = Long.rotateRight(e, 6) ^ Long.rotateRight(e, 11) ^ Long.rotateRight(e, 25);
				long ch = (e & f) ^ (~e & g);
				long temp1 = h + s1 + ch + constArray[i] + (Long.parseLong(x.get(i), 16));
				long s0 = Long.rotateRight(a, 2) ^ Long.rotateRight(a, 13) ^ Long.rotateRight(a, 22);
				long maj = (a & b) ^ (a & c) ^ (b & c);
				long temp2 = s0 + maj;
				//System.out.println(Long.parseLong(x.get(i), 16));
				
				h = g;
				g = f;
				f = e;
				e = d + temp1;
				d = c;
				c = b;
				b = a;
				a = temp1 + temp2;
			}
			long hash0 = h0 + a;
			long hash1 = h1 + b;
			long hash2 = h2 + c;
			long hash3 = h3 + d;
			long hash4 = h4 + e;
			long hash5 = h5 + f;
			long hash6 = h6 + g;
			long hash7 = h7 + h;
	 
		System.out.println(x); 
		String digest = String.format("%x", hash0)+String.format("%x", hash1)+String.format("%x", hash2)+String.format("%x", hash3)+String.format("%x", hash4)+String.format("%x", hash5)+String.format("%x", hash6)+String.format("%x", hash7);
		System.out.println("HASHES yay: "+digest);
		System.out.println(digest.length());
 }
 
}
	

	
	

