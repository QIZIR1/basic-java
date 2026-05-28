
public class Counter {

	private int count;
	private String unusedVariable = "ga dipakai";
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}

	public String countString(String prefix) {
		return prefix.toUpperCase() + count;
	}	
	
}
