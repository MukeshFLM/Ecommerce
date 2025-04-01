package CommonUtils;

import java.util.Date;

public class RandomGmailCreation {
	public static String GmailCreation() {
		return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
	}
	

}
