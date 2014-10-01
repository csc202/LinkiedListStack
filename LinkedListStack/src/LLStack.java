
public class LLStack<T> implements UnboundedStackInterface<T> {
	public Node<T> head;

	public LLStack() {
		head = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void pop() throws StackUnderflowException {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new StackUnderflowException("Stack is empty!");
		} else {
			head = head.getLink();
		}
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return head.getValue();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head == null)
			return true;
		else
			return false;
	}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<T>(element);
		newNode.setLink(head);
		head = newNode;
	}
	
	@SuppressWarnings("unchecked")
	public String toString() {
		String list = "";
		Node <T> current;
		current = head;
		while (current != null) {
			list += current.getValue() + " ";
			current = current.getLink();
		}
		return list;
	}
}
