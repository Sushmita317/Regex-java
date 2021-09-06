package ClassworkRegex;

import java.util.ArrayList;

public class RegexMain {

	public static void main(String[] args) {

                ArrayList<String> validEmailList = new ArrayList<>();
				validEmailList.add("qwe@gmail.com");
				validEmailList.add("kme@gmail.com");
				validEmailList.add("nme@gmail.com");
				validEmailList.add("qoie@gmail.com");
				validEmailList.add("qye@gmail.com");
				
				Emailidvalidation emailidvalidation = new Emailidvalidation();
				for (String email : validEmailList)
				{
					System.out.println(email + "is valid = " + emailidvalidation.validation(email));
				}
//				System.out.println("------------");
//				
//				ArrayList<String> invalidEmailList = new ArrayList<>();
//				invalidEmailList.add("qwe.@gmail.com");
//				invalidEmailList.add("kme@.gmail.com");
//				invalidEmailList.add("nme@g.mail.com");
//				invalidEmailList.add("qoie@g.mail.com");
//				invalidEmailList.add("qye@gma.il.com");
//				
//				
//				for (String email : invalidEmailList)
//				{
//					System.out.println(email + "is valid = " + emailidvalidation.validation(email));
//				
//					
//				}
	
}

}

