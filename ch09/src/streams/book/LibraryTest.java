package streams.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
	private String name;
	private int price;
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	
}



public class LibraryTest {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//스트림 생성하고 출력하기
		Stream<Book> stream = bookList.stream();
		stream.map(b -> b.getName())
				.forEach(s -> System.out.println(s));
		
		//모든 책의 가격의 합
		int total = bookList.stream()
				.mapToInt(b -> b.getPrice())
				.sum();
		System.out.println("모든 책의 가격의 합은 " + total + "원입니다.");
		
		//책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력
		System.out.println("=== 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력 ===");
		bookList.stream()
			.filter(b -> b.getPrice() >= 20000)
			.map(b -> b.getName())
			.sorted()
			.forEach(s -> System.out.println(s));
	}

}
