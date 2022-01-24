package homework;

public class Runner{ // Setting 클래스의 초기화블럭, 생성자를 제외한 나머지 상속받음

	String name;
	int hp; // 체력
	int speed; // 속도
	int bodyMoisture; // 체내수분량
	int distance; // 거리
	final int DISTANCE = 50;
	boolean is_taking_rest = true;

	// 생성자 : 변수 초기화
	public Runner() {
		this.hp = (int) (Math.random() * 4) + 2; // 2~5까지
		this.speed = 5;
		this.bodyMoisture = (int) (Math.random() * 5) + 3; // 3~7 까지
		this.distance = 0;
	}

	@Override
	public String toString() {
		return name;
	}

	// 상태창 메소드
	void status() {
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp + "/5");
		System.out.println("속도 : " + speed + "/5");
		System.out.println("체내수분량 : " + bodyMoisture + "/10");
		System.out.println("\n");
	}
}

//	// 아이템을 랜덤으로 선택
//	public int itemChoose() {
//		return item_num;
//	}

	// 아이템을 얻는 메소드
//	void getitem(Runner runner) {
//		System.out.println("아이템 뽑기!!");
//		System.out.println(runner.name + "님이 " + Integer.toString(itemChoose()) + "을 뽑았습니다.");
//		System.out.println("아이템은 바로 적용됩니다.");

		// 아이템을 가지고 있으면 아이템의 능력치가 캐릭터의 능력치에 바로 반영됨
//		runner.hp += item.hp; 
//		runner.bodyMoisture += item.bodyMoisture;
//		runner.distance += item.distance;


