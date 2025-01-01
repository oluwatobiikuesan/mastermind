import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import swiftbot.SwiftBotAPI;
import swiftbot.Underlight;

public class MasterMind {
	static String text;
	static String mode;
	static SwiftBotAPI swiftbot = new SwiftBotAPI();
	static Scanner userinput = new Scanner(System.in);
	static int colourIndex, imageIndex;
	static Underlight[] underlight = new Underlight[] {
			Underlight.BACK_LEFT, Underlight.BACK_RIGHT, Underlight.FRONT_LEFT,
			Underlight.FRONT_RIGHT,	Underlight.MIDDLE_LEFT, Underlight.MIDDLE_RIGHT
	};
	static int[][] colourArray = {};
	static int[][] imagePixelArray = {};
	
	public static void main(String[] args) throws IOException{
		System.out.println("//////////////////////////////////////////////////////////\n" +
							"/////////////////////////////////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"////////////////Master	Mind//////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"//////////////////     |____///////////////2025/////////\n"+
							"/////////////////___________|/////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n"+
							"/////////////////////////////////////////////////////////\n");
		
	
		switch(mode) {
		case "A":
			DefaultMode();
			break;
		case "B":
			CustomisedMode();
			break;
		default:
			System.out.println("You did not select anything valid."
					+ "Try pressing either A for the Default mode or B for customised mode");
		}
	}

	//Start the default mode game process.
	public static  void DefaultMode() {
		/*
		 * This mode enable you to play using the
		 */

	}
	
	private static void CustomisedMode() {
	/*
	 * This is a customised mode for the master mind, where you play against another player.
	 */

	}
	
	
	
	
	/*A private class section which is the subprocess of the 
	 program as describe on the alogirth design*/
	
	private void RandomColourGen() {
	

	}
	private class CardValidation{
		
	}
	
	private class ImageProcessing{
		
		public void initialiseCamera() {
			System.out.println("Start");
		}
	}
	
}
