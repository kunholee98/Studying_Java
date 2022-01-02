package makeObject;

public class OrderInfo {
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String date;
	public String time;
	public String price;
	public String menuNumber;
	
	public OrderInfo(String orderNumber, String phoneNumber, String address, String date, String time, String price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrder() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : "+ phoneNumber);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNumber);
	}
}
