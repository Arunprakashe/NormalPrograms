 package automationFramework;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println(a);
		int [] b = new int[5];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		for(int i=0;i<=4;i++) {
			System.out.println(b[i]);
		}
for(int c:b) {
	System.out.println(c);
}
	}

}
