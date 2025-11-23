package day7Assignments;

public class APIClient {
public void sendRequest(String endpoint) {
	System.out.println("The end point is : "+ endpoint);
}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println("The endpoint: "+ endpoint);
	System.out.println("The request body is: " + requestBody);
	if (requestStatus) {
		System.out.println("request status is " + requestStatus);
	}
	else {
		System.out.println("request status is " + requestStatus);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
APIClient api= new APIClient();
api.sendRequest("www.amazon.com");
api.sendRequest("www.amazon.com", "Name: lakshmi ; status : active", true);
api.sendRequest("www.amazon.com", "Name: karthik ; status : inactive", false);
	}

}
