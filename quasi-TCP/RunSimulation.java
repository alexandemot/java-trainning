

import java.util.concurrent.TimeUnit;


public class RunSimulation{

	public static void main (String[] args) {
	
for (int i = 0; i <= 10; i++){	
		// initial screen formating : reseting/focusing on top
		System.out.println(resetscreen+"...");
		
		CSMACDsimulator callMethod = new CSMACDsimulator();
		callMethod.isMediumIdle(i);
		
		 
	}
	}
	
// list of cursor/screen commands	
public static final String resetscreen = (char)27 + "[2J";

}