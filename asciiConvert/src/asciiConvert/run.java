package asciiConvert;

public class run {

	public static void main(String[] args) {
		String input = "@{}assAAA87&^%";
		char[] stringArray = input.toCharArray(); 
		for (int i=0; i<input.length(); i++){
			String toAscii = String.format("%d", (int)stringArray[i]);
			int ascii = Integer.parseInt(toAscii);
			//System.out.print(toAscii);
		if(ascii>64 && ascii< 91){
			
			int update = ascii+32;
			//System.out.print(ascii);
			String output = String.format("%c", update);
			System.out.print(output);
		}
		else if(ascii> 96 && ascii < 123){
			int update = ascii-32;
			//System.out.print(ascii);
			String output = String.format("%c", update);
			System.out.print(output);
		}
		else if(ascii >47 && ascii < 58){
			String output = String.format("%c", ascii);
			int toNum =Integer.parseInt(output);
			int timesTwo = toNum*2;
			System.out.print(timesTwo);
		}
		else {
			String output = String.format("%c", ascii);
			System.out.print(output);
		}
		}
		
		

	}

}
