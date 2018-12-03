package recurssion.puzzles;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TowerOfHanoi hanoi = new TowerOfHanoi();
		
		hanoi.getMovesForTower(3, "A", "B", "C");
	}
	
	private void getMovesForTower(int n, String begTower, String auxTower, String endTower) {
		
		if(n == 1) {
			System.out.println("move 1 from "+begTower+" to "+endTower);
			return;
		}
		
		getMovesForTower(n-1,begTower, endTower, auxTower);
		getMovesForTower(1,begTower,auxTower,endTower);
		getMovesForTower(n-1,auxTower,begTower,endTower);
	}
}
