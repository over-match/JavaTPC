import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {
		
		// �迭 ���� 1.
		int [] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// �迭 ���� 2.
		int[] b = {10,20,30,40,50};
		
		// �迭 ���� 3.
		int[] c = new int[] {10,20,30,40,50};
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}

		//--------------------------------------------------------
		
		// ��ȭ(����, ����, ���ΰ�, ���, �ð�)
		MovieVO mov = new MovieVO("��Ʈ", 12000, "������", 12, 1.3f);
		System.out.println(mov.toString());

		System.out.println("----------------------");
		
		// ��ȭ 3���� ����
		MovieVO[] marr = new MovieVO[3];
		marr[0] = new MovieVO("��Ʈ1", 12000, "������1", 12, 1.3f);
		marr[1] = new MovieVO("��Ʈ2", 13000, "������2", 11, 1.4f);
		marr[2] = new MovieVO("��Ʈ3", 11000, "������3", 13, 1.5f);
		
		System.out.println(marr[0].toString());
		System.out.println(marr[1]); //toString ������ ����
		System.out.println(marr[2]);

		System.out.println("----------------------");
		
		for(int i=0; i<marr.length; i++) {
			System.out.println(marr[i]);
		}
	}
}