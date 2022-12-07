
public class KoreanStew {
	Stew stew=new KimchiStew(); //인터페이스 타입 필드 선언과 초기 구현 객체 대입
	
	void cook() {
		stew.cook(); //인터페이스에서 설명된 cook() 메소드 호출
	}
}
