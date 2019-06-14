public class test {
	public static void main(String [] args){
		int a = 0 ; 
		int b = 1 ;
		System.out.println(a);
		System.out.println(b);
		int k = a+b ;
		System.out.println(k);
		for (int i = 0 ; i < 100 ; i++){
			if(i%2== 0) {
				a = k;
				k =a+b;
				System.out.println(k);
			}
			else {
				b = k;
				k =a+b;
				System.out.println(k);
			}
		}
	}
}
