import java.util.*; 
import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import com.twilio.sdk.resource.list.*; 

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class HackMizzou { 
 // Find your Account Sid and Token at twilio.com/user/account 
 public static final String ACCOUNT_SID = "AC36f1ecee1aaa1ac87bbc98edf9d2e802"; 
 public static final String AUTH_TOKEN = "791d06a9f3f1745d163eef30e79268a9"; 
 
 public static void main(String[]args) throws TwilioRestException { 
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
 
	 // Build the parameters 
	 List<NameValuePair> params = new ArrayList<NameValuePair>();    
 
	 MessageList messages = client.getAccount().getMessages(params); 
	 for (Message message : messages) { 
	 	System.out.println(message.getBody()); 
	 } 
 } 
}