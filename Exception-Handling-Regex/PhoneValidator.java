package ExceptionHandlingRegex;

import java.util.regex.*;

public class PhoneValidator {

	public static void main(String[] args) {

		String regex = "^(001|\\+1)-\\d{3}-\\d{3}-\\d{4}$";

		String phone1 = "001-765-989-3421";
		String phone2 = "+1-456-765-9345";

		System.out.println(phone1 + " : " + phone1.matches(regex));
		System.out.println(phone2 + " : " + phone2.matches(regex));
	}
}