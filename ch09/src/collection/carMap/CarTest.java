package collection.carMap;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);
		
		Car bmw1 = factory.createCar("전기 차");
		Car bmw2 = factory.createCar("전기 차");
		System.out.println(bmw1 == bmw2);
		
		System.out.println(sonata1 == bmw1);

	}

}
