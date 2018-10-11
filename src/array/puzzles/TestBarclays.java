package array.puzzles;

public class TestBarclays {

	public static void main(String[] args) {
		TestBarclays  t = new TestBarclays();
		int [] input = {1,2,3,4,9,8};
		System.out.println(t.getsum(input));
	}
	
	public int getsum(int [] p) {
		
		int size = p.length;
		
		int max_current = 0 ;
		int max_total =0;
		int count = 0;
		for(int j =0;j<size-1;j++) {
			if(max_current>max_total) {
				max_total = max_current;
			}
			max_current = p[j];
			count=j;
			
			for(int i =j+1;i<size;i++) {
			if(p[i] >p[count]) {
				
				if(p[i]%p[count]==0) {
			max_current = max_current + p[i];
				count = i;
				}
			}
		}
	}
		
		
		
		return max_total;
	}
	
}
