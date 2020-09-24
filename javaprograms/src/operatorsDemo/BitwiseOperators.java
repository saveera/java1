package operatorsDemo;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		//& also known as and Operator
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		//| or operator
		System.out.println(true | false);
		System.out.println(false | false);
		
		//^ ex-or operator
		System.out.println(false ^ false);
		System.out.println(true ^ false);

	}

}
