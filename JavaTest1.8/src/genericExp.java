
 class GenericExample <T>{
	
	public GenericExample(T t) {
		this.t = t;
	}
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

class genericExp
{
	public static void main(String args[])
	{
		GenericExample ge = new GenericExample(123);
		System.out.println("Generic ==="+ge.getT());
	}
	
}
