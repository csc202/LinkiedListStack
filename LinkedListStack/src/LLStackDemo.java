
public class LLStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLStack <String>aStack = new LLStack <String>();
		aStack.push("Clay");
		aStack.push("Debbie");
		
		System.out.println(aStack);
		System.out.println(aStack.top());
		try {
			aStack.pop();
		} catch (StackUnderflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(aStack);
		System.out.println(aStack.top());
		try {
			aStack.pop();
			aStack.pop();
		} catch (StackUnderflowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
