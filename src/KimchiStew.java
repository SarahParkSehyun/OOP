
public class KimchiStew implements Stew{
	@Override //메소드 재정의
	public void cook() {
		System.out.println("<김치찌개 끓이기>");
		System.out.println("1. 신김치 한 포기와 삼겹살을 넣어준다.");
		System.out.println("2. 김칫국물을 한 컵 정도 넣고 김치와 함께 볶아준다.");
		System.out.println("3. 물 3리터 정도 넣고 끓여준다.");
		System.out.println("4. 고춧가루 1~2스푼 넣어주고 액젓을 넣어 간을 맞춰준다.");
		System.out.println("5. 대파를 썰어서 넣고, 두부를 한 모 넣어준다.");
	}
}
