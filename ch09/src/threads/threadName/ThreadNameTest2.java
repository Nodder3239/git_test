package threads.threadName;

public class ThreadNameTest2 {

	public static void main(String[] args) {
		//스레드 생성 - 익명 개체로 구현
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		//작업 스레드 1개 생성
		for(int i=0; i<2; i++) {
			//Thread(작업 스레드)의 객체 생성
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threadA.start();
		}
		//작업 스레드 1개 생성
		for(int i=0; i<2; i++) {
			//Thread(작업 스레드)의 객체 생성
			Thread threadB = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			//스레드 이름 변경
			threadB.setName("Chat-Thread");
			threadB.start();
		}
		
	}

}
