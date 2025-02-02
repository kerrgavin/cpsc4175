import java.util.*;
import java.io.*;

public class DebitCardGenerator {
	
	private int bitCount;
	private String bitString;
	static BufferedWriter out;
	
	public static void main(String args[]){
		try {
			
			
			DebitCardGenerator dbg = new DebitCardGenerator();
			dbg.setBitCount(128);
			dbg.setBitString(dbg.genBitString(dbg.getBitCount()));
			System.out.println(dbg.getBitString());
			//System.out.println(dbg.convertToInt(Integer.parseInt(dbg.getBitString()), dbg.getBitString().length(), dbg.getBitString().length()));
			dbg.convertToHex(dbg.getBitString());
			out.close();
		} catch(Exception e) {
			
		}
		
	}
	
	public DebitCardGenerator() {
		this(0);
	}
	
	public DebitCardGenerator(int bitCount) {
		try{
		out = new BufferedWriter(new FileWriter("output.txt"));
		} catch (Exception e){
			
		}
		
		setBitCount(bitCount);
	}
	
	public void setBitCount(int bitCount) {
		if(bitCount > 0) {
			this.bitCount = bitCount;
		} else {
			System.out.println("Bit count not large enough");
		}
	}
	
	public int getBitCount() {
		return this.bitCount;
	}
	
	public void setBitString(String bitString) {
		this.bitString = bitString;
	}
	
	public String getBitString(){
		return this.bitString;
	}
	
	public String genBitString(int bitCount) {
		String bitString = "";
		int bit = 0;
		for(int i = 0; i < bitCount; i++) {
			bit = (int) (Math.random() * 2);
			bitString += bit;
		}
		return bitString;
	}
	
	public int convertToInt(int bitString, int initLength, int length) {
		if(length == 0){
			return 0;
		}
		//System.out.println(((bitString%2) * (int) Math.pow(2, initLength-(length))));
		return ((bitString%2) * (int) Math.pow(2, initLength-(length))) + convertToInt(bitString/10, initLength, length-1);
	}
	
	public void convertToHex(String bitString) {
		String hex = "";
		String halfByte = "";
		int intVal = 0;
		int count = bitString.length();
		for(int i = 0; i < count/4;i++){
			if(bitString.length() > 4) {
				halfByte = bitString.substring(0, 4);
			} else {
				halfByte = bitString;
			}
			
			intVal = this.convertToInt(Integer.parseInt(halfByte),halfByte.length(), halfByte.length());
			switch(intVal) {
			case 1: 
				hex += 1;
				break;
			case 2:
				hex += 2;
				break;
			case 3:
				hex += 3;
				break;
			case 4:
				hex += 4;
				break;
			case 5:
				hex += 5;
				break;
			case 6:
				hex += 6;
				break;
			case 7:
				hex += 7;
				break;
			case 8:
				hex += 8;
				break;
			case 9:
				hex += 9;
				break;
			case 10:
				hex += "A";
				break;
			case 11:
				hex += "B";
				break;
			case 12:
				hex += "C";
				break;
			case 13:
				hex += "D";
				break;
			case 14:
				hex += "E";
				break;
			case 15:
				hex += "F";
				break;
			default:
				break;
			}
			
			bitString = bitString.substring(4);
			//System.out.println("X: "+ bitString);
			if(hex.length() == 8){
				try {
					out.append(hex);
				} catch (Exception e){
					System.out.println(e.getMessage());
				}
				hex = "";
			}
		}
	}
}
