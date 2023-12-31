package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		//싱글톤이므로 객체는 1개
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourMorning = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourMorning.getCarNum());
	}

}
