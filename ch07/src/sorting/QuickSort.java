package sorting;

public class QuickSort implements Sort{
	
	@Override
	public void ascending(int[] numbers) {
		System.out.println("Quick Sort ascending");
		
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("Quick Sort descending");

		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}

}
