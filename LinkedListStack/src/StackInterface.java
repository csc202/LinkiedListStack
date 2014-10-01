
public interface StackInterface<T> {
	public void pop() throws StackUnderflowException;
	public T top();
	public boolean isEmpty();
}
