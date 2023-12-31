package objectArray.dogs;

public class DogArray {

	public static void main(String[] args) {
		//Dog 인스턴스 4개를 생성해서 배열에 저장하고
		//정보를 출력하세요
		Dog[] dogs = new Dog[4];
		
		dogs[0] = new Dog("샛별", "말티즈");
		dogs[1] = new Dog("고미", "포메라니안");
		dogs[2] = new Dog("야옹", "진돗개");
		dogs[3] = new Dog("돼지", "비글");
	
		
		
		for(int i=0; i<dogs.length; i++) { 
			System.out.println("이름: " + dogs[i].getName()
					+ ", 견종: " + dogs[i].getType());
		}
		
		System.out.println("===========");
		//향상된 for문
		for(Dog dog : dogs) { 
			System.out.println("이름: " + dog.getName()
					+ ", 견종: " + dog.getType());
		}
		
	}

}
