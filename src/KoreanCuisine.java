import java.util.*;
import java.io.*;

public class KoreanCuisine {

	public static void main(String[] args) throws Exception{
		Reader reader=new FileReader("C:/Temp/topic.txt"); //���� �Է� ��Ʈ�� �̿�
		while(true) {
			int data=reader.read(); //�� ���ھ� �б�
			if(data==-1) break; //���� ���� �������� ���
			System.out.print((char)data);
		}
		reader.close(); //�Է� ��Ʈ���� ����
		
		System.out.println();
		System.out.println();
		
		Eat eating=new Eat();
		Spicy spicy=new Spicy();
		Sweet sweet=new Sweet();
		Hot hot=new Hot();
		
		eating.eat(spicy); //������(���)
		eating.eat(sweet); //������(���)
		eating.eat(hot); //������(���)
		
		System.out.println();
		
		KoreanStew ks=new KoreanStew();
		
		ks.cook();
		
		System.out.println();
		
		ks.stew=new BeanPasteStew(); //������(�������̽�)
		
		ks.cook();
		
		System.out.println();
		
		try {
		String[] kimchi=new String[7]; //�迭 ����
		
		kimchi[0]="���߱�ġ";
		kimchi[1]="�Ѱ���ġ";
		kimchi[2]="������ġ";
		kimchi[3]="���̼ҹ���";
		kimchi[4]="��ġ��";
		kimchi[5]="����ġ";
		kimchi[6]="���ġ";
		
		System.out.println("<��ġ�� ����>");
		for(int i=0;i<kimchi.length;i++) {
			System.out.print(kimchi[i]+" ");
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("--ArrayIndexOutOfBoundsException �߻�--"); //���� ó��
		}
		
		System.out.println();
		System.out.println();
		
		FoodCalendar calendar=null; //���� Ÿ�� ���� ����
		
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
			System.out.println("1���� ������ �����ô�.");
		}
		else if(calendar==FoodCalendar.FEBRUARY) {
			System.out.println("2���� ������� �����ô�.");
		}
		else if(calendar==FoodCalendar.MARCH) {
			System.out.println("3���� ����ġ�� �����ô�.");
		}
		else if(calendar==FoodCalendar.APRIL) {
			System.out.println("4���� ����� �����ô�.");
		}
		else if(calendar==FoodCalendar.MAY) {
			System.out.println("5���� ����ä�� �����ô�.");
		}
		else if(calendar==FoodCalendar.JUNE) {
			System.out.println("6���� ������� �����ô�.");
		}
		else if(calendar==FoodCalendar.JULY) {
			System.out.println("7���� �÷綱�� �����ô�.");
		}
		else if(calendar==FoodCalendar.AUGUST) {
			System.out.println("8���� �������� �����ô�.");
		}
		else if(calendar==FoodCalendar.SEPTEMBER) {
			System.out.println("9���� û������ �����ô�.");
		}
		else if(calendar==FoodCalendar.OCTOBER) {
			System.out.println("10���� ���ġ�� �����ô�.");
		}
		else if(calendar==FoodCalendar.NOVEMBER) {
			System.out.println("11���� �Ұ�⸦ �����ô�.");
		}
		else if(calendar==FoodCalendar.DECEMBER) {
			System.out.println("12���� �ż��θ� �����ô�.");
		}
		System.out.println();
		
		List<ForeignSimilar> similar=new Vector<ForeignSimilar>(); //ForeignSimilar ��ü�� �����ϴ� Vector(�÷��� �����ӿ�ũ)
		
		similar.add(new ForeignSimilar("��������", "��â����")); //ForeignSimilar ��ü�� ����
		similar.add(new ForeignSimilar("������", "������")); //ForeignSimilar ��ü�� ����
		similar.add(new ForeignSimilar("����", "������")); //ForeignSimilar ��ü�� ����
		similar.add(new ForeignSimilar("�Ҷ���", "��������")); //ForeignSimilar ��ü�� ����
		similar.add(new ForeignSimilar("ġŲ ������Ÿ��", "�ߺ�����")); //ForeignSimilar ��ü�� ����
		
		for(int i=0;i<similar.size();i++) {
			ForeignSimilar fs=similar.get(i);
			System.out.println("�ܱ��� "+fs.foreign+"�� �ѱ��� "+fs.korean+"�� ����� ���� ����.");
		}
		
	 /*
	  * ���� ����:
	  * 
	  * �ѽ��� ������ �پ��� ������ ��ҽ��ϴ�. ����, ���� �Է� ��Ʈ���� �̿��Ͽ� ������ ������־����ϴ�.
	  * ������ ����� Ȱ���Ͽ� �ѽ��� ���� �����Ͽ����ϴ�. �̶� �Ű������� �������� �̿��Ͽ����ϴ�.
	  * �� �������δ� �������̽��� Ȱ���Ͽ� ��ġ��� ������� ���̴� ���� �����Ͽ����ϴ�. �̶��� �ʵ��� �������� �̿��Ͽ����ϴ�.
	  * �� �������δ� �迭�� �����Ͽ� �ѱ� ��ġ�� ������ �������� ��, ������־����ϴ�. �̶� �ε����� ������ ���� �ʴ��� ���� ó���� ���־����ϴ�.
	  * �� �������δ� ���� Ÿ���� ����Ͽ� ���� �������־���, java�� Calendar Ŭ������ �̿��Ͽ� ������ ���� �޾Ƽ� �׿� �´� ������
	  * ������ֵ��� �Ͽ����ϴ�. ���������δ� Vector�� ForeignSimilar ��ü�� �������ְ�, �ѽİ� ����� �ܱ��� ������ ������־����ϴ�.
	  */
	}

}
