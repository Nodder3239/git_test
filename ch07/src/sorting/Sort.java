package sorting;

public interface Sort {
	public void ascending(int[] numbers);
	public void descending(int[] numbers);
	default public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		
	}
	
}
