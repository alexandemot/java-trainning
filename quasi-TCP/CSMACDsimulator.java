
import java.util.*;

public class CSMACDsimulator {
	
	Animation callAnimation = new Animation();
	
	// list of cursor/screen commands	
	public String resetscreen = (char)27 + "[2J";

	// method for checking medium aviability
	public boolean isMediumIdle(int i){
		
		int Ethernetpackage = i;
		
		System.out.printf(resetscreen + "\n// Package #%s Listening the medium ...\n", Ethernetpackage);
	
		// create random object
		Random randomNumber = new Random();
		
		int probability_of_free_medium = randomNumber.nextInt(100);
			
		// 	if the probability of free medium
		if ( probability_of_free_medium >= 20){
			callAnimation.TransmissionStatusDiagram(true);	
			callAnimation.PlayTransmissionAnimation();			
			return true;
			} 
			
		else{
			callAnimation.TransmissionStatusDiagram(false);
			System.out.println("\t\t***tryin again!!!****");
			System.out.println(resetscreen);
		try {
			Thread.sleep(1000);}	
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();}
			
			return isMediumIdle(i);
		}
	} // end of method isMediumIdle
}