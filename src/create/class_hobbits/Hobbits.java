package create.class_hobbits;

public class Hobbits {
	String name;
	public static void main (String [] args) {
		
		Hobbits [] h = new Hobbits [3];

		//int z = -1;
		int z = 0;
		
		//while (z < 2)
		while (z < 3) {
			
		//z = z + 1;
			
		h [z] = new Hobbits();
		h [z].name = "������";
		
		if (z == 1) {
			h[z].name = "�����";
		}
		if (z == 2) {
			h[z].name = "���"; 
		}
		System.out.print(h[z].name + " - ");
		System.out.println("��� �������� �������");
		z = z + 1;
		} 
		
	}
}
