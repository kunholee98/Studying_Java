package makeObject;

public class PersonInfo {
	public int height;
	public int weight;
	public String name;
	public int age;
	
	public PersonInfo(int h, int w, String n, int a) {
		this.height = h;
		this.weight = w;
		this.name = n;
		this.age = a;
	}
	
	public void showInfo(){
		System.out.println("키가 " + height + "이고 몸무게가 " + weight +
				"킬로인 남성이 있습니다. 이름은 "+ name + " 이고 나이는 " +age+"세입니다.");
	}
}
