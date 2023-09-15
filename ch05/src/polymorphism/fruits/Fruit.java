package polymorphism.fruits;

public class Fruit {
	//필드
	protected String name;
	protected String weight;
	protected int price;
	
	public Fruit() {}
	public void showFruitInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 무게: " + weight);
		System.out.println("과일 가격: " + price);
	}
	
}
