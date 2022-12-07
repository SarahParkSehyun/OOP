import java.util.*;
import java.io.*;

public class KoreanCuisine {

	public static void main(String[] args) throws Exception{
		Reader reader=new FileReader("C:/Temp/topic.txt"); //문자 입력 스트림 이용
		while(true) {
			int data=reader.read(); //한 문자씩 읽기
			if(data==-1) break; //파일 끝에 도달했을 경우
			System.out.print((char)data);
		}
		reader.close(); //입력 스트림을 닫음
		
		System.out.println();
		System.out.println();
		
		Eat eating=new Eat();
		Spicy spicy=new Spicy();
		Sweet sweet=new Sweet();
		Hot hot=new Hot();
		
		eating.eat(spicy); //다형성(상속)
		eating.eat(sweet); //다형성(상속)
		eating.eat(hot); //다형성(상속)
		
		System.out.println();
		
		KoreanStew ks=new KoreanStew();
		
		ks.cook();
		
		System.out.println();
		
		ks.stew=new BeanPasteStew(); //다형성(인터페이스)
		
		ks.cook();
		
		System.out.println();
		
		try {
		String[] kimchi=new String[7]; //배열 선언
		
		kimchi[0]="배추김치";
		kimchi[1]="총각김치";
		kimchi[2]="열무김치";
		kimchi[3]="오이소박이";
		kimchi[4]="동치미";
		kimchi[5]="갓김치";
		kimchi[6]="백김치";
		
		System.out.println("<김치의 종류>");
		for(int i=0;i<kimchi.length;i++) {
			System.out.print(kimchi[i]+" ");
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("--ArrayIndexOutOfBoundsException 발생--"); //예외 처리
		}
		
		System.out.println();
		System.out.println();
		
		FoodCalendar calendar=null; //열거 타입 변수 선언
		
		Calendar cal=Calendar.getInstance();
		int month=cal.get(Calendar.MONTH)+1;
		
		switch(month) {
		case 1:
			calendar=FoodCalendar.JANUARY;break;
		case 2:
			calendar=FoodCalendar.FEBRUARY;break;
		case 3:
			calendar=FoodCalendar.MARCH;break;
		case 4:
			calendar=FoodCalendar.APRIL;break;
		case 5:
			calendar=FoodCalendar.MAY;break;
		case 6:
			calendar=FoodCalendar.JUNE;break;
		case 7:
			calendar=FoodCalendar.JULY;break;
		case 8:
			calendar=FoodCalendar.AUGUST;break;
		case 9:
			calendar=FoodCalendar.SEPTEMBER;break;
		case 10:
			calendar=FoodCalendar.OCTOBER;break;
		case 11:
			calendar=FoodCalendar.NOVEMBER;break;
		case 12:
			calendar=FoodCalendar.DECEMBER;break;
		}
		
		if (calendar==FoodCalendar.JANUARY) {
			System.out.println("1월엔 떡국을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.FEBRUARY) {
			System.out.println("2월엔 비빔밥을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.MARCH) {
			System.out.println("3월엔 물김치를 먹읍시다.");
		}
		else if(calendar==FoodCalendar.APRIL) {
			System.out.println("4월엔 김밥을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.MAY) {
			System.out.println("5월엔 탕평채를 먹읍시다.");
		}
		else if(calendar==FoodCalendar.JUNE) {
			System.out.println("6월엔 삼계탕을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.JULY) {
			System.out.println("7월엔 시루떡을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.AUGUST) {
			System.out.println("8월엔 부추전을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.SEPTEMBER) {
			System.out.println("9월엔 청국장을 먹읍시다.");
		}
		else if(calendar==FoodCalendar.OCTOBER) {
			System.out.println("10월엔 백김치를 먹읍시다.");
		}
		else if(calendar==FoodCalendar.NOVEMBER) {
			System.out.println("11월엔 불고기를 먹읍시다.");
		}
		else if(calendar==FoodCalendar.DECEMBER) {
			System.out.println("12월엔 신선로를 먹읍시다.");
		}
		System.out.println();
		
		List<ForeignSimilar> similar=new Vector<ForeignSimilar>(); //ForeignSimilar 객체를 저장하는 Vector(컬렉션 프레임워크)
		
		similar.add(new ForeignSimilar("모츠나베", "곱창전골")); //ForeignSimilar 객체를 저장
		similar.add(new ForeignSimilar("바쿠테", "갈비탕")); //ForeignSimilar 객체를 저장
		similar.add(new ForeignSimilar("굴라쉬", "육개장")); //ForeignSimilar 객체를 저장
		similar.add(new ForeignSimilar("불랄로", "도가니탕")); //ForeignSimilar 객체를 저장
		similar.add(new ForeignSimilar("치킨 아프리타다", "닭볶음탕")); //ForeignSimilar 객체를 저장
		
		for(int i=0;i<similar.size();i++) {
			ForeignSimilar fs=similar.get(i);
			System.out.println("외국의 "+fs.foreign+"와 한국의 "+fs.korean+"은 비슷한 맛이 난다.");
		}
		
	 /*
	  * 과제 설명:
	  * 
	  * 한식을 주제로 다양한 내용을 담았습니다. 먼저, 문자 입력 스트림을 이용하여 주제를 출력해주었습니다.
	  * 다음은 상속을 활용하여 한식의 맛을 설명하였습니다. 이때 매개변수의 다형성을 이용하였습니다.
	  * 그 다음으로는 인터페이스를 활용하여 김치찌개와 된장찌개를 끓이는 법을 설명하였습니다. 이때는 필드의 다형성을 이용하였습니다.
	  * 그 다음으로는 배열을 생성하여 한국 김치의 종류를 저장해준 후, 출력해주었습니다. 이때 인덱스가 범위를 넘지 않는지 예외 처리를 해주었습니다.
	  * 그 다음으로는 열거 타입을 사용하여 월을 저장해주었고, java의 Calendar 클래스를 이용하여 현재의 월을 받아서 그에 맞는 음식을
	  * 출력해주도록 하였습니다. 마지막으로는 Vector에 ForeignSimilar 객체를 저장해주고, 한식과 비슷한 외국의 음식을 출력해주었습니다.
	  */
	}

}
