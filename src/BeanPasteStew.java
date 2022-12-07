
public class BeanPasteStew implements Stew{
	@Override //메소드 재정의
	public void cook() {
		System.out.println("<된장찌개 끓이기>");
		System.out.println("1. 물 1.5 종이컵에 된장, 고춧가루, 다진 마늘, 설탕, 간장을 한 데에 넣고 끓여준다.");
		System.out.println("2. 그 사이 양파, 버섯, 애호박, 청양고추, 두부를 적당한 크기로 썰어준다.");
		System.out.println("3. 끓은 된장물에 썰었던 재료를 넣어준다.");
		System.out.println("4. 애호박이 익을 때까지 끓여주고, 부족한 간은 소금을 넣어준다.");
	}
}
