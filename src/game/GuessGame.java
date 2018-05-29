package game;

public class GuessGame {
// C������� ��� ���������� ���������� ��� ���� �������� Player
	Player p1;
	Player p2; 
	Player p3;
	
// ������� ��� ������� Player � ����������� ��  ���� ���������� ����������	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

// ��������� ��� ���������� ��� �������� ��������� �� ������� ������		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

// ��������� ��� ���������� ��� �������� ������������ � �� ������������ (true ��� false) ������� �������		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
// C������ ����� ������� ������ ������ �������		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("� ��������� ����� �� 1 �� 9...");
		
		
		while (true) {
			System.out.println("�����, ������� ����� �������, - " + targetNumber);
			
// �������� ����� guess() �� ������� ������� Player			
			p1.guess();
			p2.guess();
			p3.guess();
			
// ��������� �������� ������� ������ (���������� ������ �� ������� guess() ������� ������ � �� ���������� number)			
			guessp1 = p1.number;
			System.out.println("������ ����� ������, ��� ��� " + guessp1);
			
			guessp2  = p2.number;
			System.out.println("������ ����� ������, ��� ��� " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("������ ����� ������, ��� ��� " + guessp3);
			
// ��������� �������� ������� �� ������� �� ������������ ����������� �����. ���� ����� ������ �� �����������
// ��������������� ���������� �������� true (�������, ��� �� ��������� ��� ������ �������� false).
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				
				System.out.println("� ��� ���� ����������!");
				System.out.println("������ ����� ������?" + p1isRight);
				System.out.println("������ ����� ������?" + p2isRight);
				System.out.println("������ ����� ������?" + p3isRight);
				System.out.println("����� ����");
				break;
				
			}else {
			// �� ������ ����������, ��� ��� ����� �� ������!	
			System.out.println("������ ������ ����������� ��� ���.");
			
			}// ����� if/else
		}// ����� ����� 
	
	}// ����� ������

}// ����� ������
