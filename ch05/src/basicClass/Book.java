package basicClass;

public class Book{ //extends Object 생략
	int bookNum;
	String bookTitle;
	
	Book(int bookNum, String bookTitle){
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}
	
	//메서드 재정의
	@Override
	public String toString() {
		return bookNum + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		// 고칠거
		return super.equals(obj);
	}
	

	
}
