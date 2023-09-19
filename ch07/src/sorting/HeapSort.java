package sorting;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] numbers) {
		System.out.println("Heap Sort ascending");
		
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("Heap Sort descending");

	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}

}
