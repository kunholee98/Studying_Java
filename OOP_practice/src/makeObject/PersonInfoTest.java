package makeObject;

public class PersonInfoTest {

	public static void main(String[] args) {
		PersonInfo person = new PersonInfo(180, 78, "Tomas", 37);
		person.showInfo();
		
		OrderInfo order = new OrderInfo("202011020003", "01023450001", "서울시 강남구 역삼동 111-333", "20201102", "130258", "35000", "0003");
		order.showOrder();
	}

}
