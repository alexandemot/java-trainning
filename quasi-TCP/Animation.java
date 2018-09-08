
import java.util.concurrent.TimeUnit;

public class Animation {
	
	public static String cleancolors = "\u001B[0m";
	public static String resetscreen = (char)27 + "[2J";
	
	public static final String redchar 	  = "\u001B[31m";
	public static final String greenchar  = "\u001B[32m";
    public static final String yellowchar = "\u001B[33m";
    public static final String bluechar   = "\u001B[34m";
	
	// defining the transmition diagram sketch
	public static	String animationtop  = ("\t ___                      ___");
	public static	String animationbody = ("\t|___|====================|___|");
	
	
	/* ----- plays an animation os screen -----*/
	public static void TransmissionStatusDiagram (boolean idlechannel){
		
		String color_pattern, message;
		
		if ( idlechannel == true ) {
			color_pattern = bluechar;
			message 	  = "\n\t"+color_pattern+"Idle!"+cleancolors;
		}
		else {
			color_pattern = redchar;
			message 	  = "\n\t"+color_pattern+"JAM!!!"+cleancolors;
		}
		
		// printing the transmition diagram on screen
		System.out.println(animationtop);
		System.out.println(animationbody);
		System.out.println(message);
		
		// wait t miliseconds before execute the package travel animation
		int waitingtimebeforeanimation = 1000;
		
		try {
			Thread.sleep(waitingtimebeforeanimation);}	
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();}
	}
	
	/* ----- plays an animation of a package traveling on medium -----*/
	public static void PlayTransmissionAnimation(){
		
		System.out.println("\n" +  resetscreen);
		
		try {
				for (int i = 6; i <= (animationbody.length() - 6); i++){
				
						
				if (i % 2 == 0){
					System.out.println(yellowchar+"\tsending..."+cleancolors);
				}
				else{
					System.out.println();
				}		
				
				System.out.println(animationtop);
				System.out.println(animationbody.substring(0,i) + yellowchar + animationbody.substring(i,i+1) + cleancolors + animationbody.substring(i+1,animationbody.length()));

				
				Thread.sleep(100);
				System.out.print(resetscreen);
				System.out.print("\n");

				}			
			}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
	}
}