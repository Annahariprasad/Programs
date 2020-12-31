import java.io.*;

class Byte{
	public static void main(String[] args) throws IOExpection{
		byte b[] = "My Class is ComputerScienceEngineering".getBytes();
		Byte y = new Byte(b);
		int i = y.available();
		System.out.println("No. of Available Bytes : "+i);
		long l = y.skip(9);
		System.out.print("No. of skipped bytes : "+l);
		System.out.print("String after skipped bytes : ");
		while((i=y.read()) != -1){
			System.out.print((char)i);
			}
			y.reset();
			System.out.println();
			int j = y.available();
			System.out.println("String in upper case : ");
			while((j=y.read()) != -1){
				System.out.print("Characters to UpperCase : "+j.toUpperCase(char));
				//System.out.print(CharatertoUpperCase(char)j);
		}
	}
}