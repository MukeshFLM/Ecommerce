package RegisterFunctionality;

import java.util.Date;

public class RandomGmailCreation {
	public String RandomGmailCreation() {
		return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
	}
	

}
