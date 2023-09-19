package sorting;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] numbers) {
		System.out.println("Bubble Sort ascending");
		
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("Bubble Sort descending");

		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}

}
