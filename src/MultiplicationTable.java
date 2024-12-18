
public class MultiplicationTable {

// To be created as part of this practice	
	public static int[][]createMultiplicationTable
	(int[] rowMultipliers){
		// Add code here
		int largest = rowMultipliers[0];
		for(int i = 1; i < rowMultipliers.length; i++) {
			if(rowMultipliers[i] > largest) {
				largest = rowMultipliers[i];
			}
		}
		int iter = 1;
		int multiplier = 2;
		boolean completed = false;
		while(!completed) {
			if(largest * multiplier < 100) {
				iter+=1;
				multiplier+=1;
			} else {
				completed = true;
			}
		}
		int[][] multipliedArray = new int[iter][rowMultipliers.length];
		for(int y = 0; y < iter; y++) {
			for(int x = 0; x < rowMultipliers.length; x++) {
				multipliedArray[y][x] = rowMultipliers[x] * (y+1);
			}
		}
		return multipliedArray;
	}
	
	//Do not run this until you are sure it works	
	public static void runMultiplicationTableAcceptanceTest(){
		(new MultiplicationTableTester()).generateCasesAndRun();
	}
	
	public static void main(String[] args) {
		runMultiplicationTableAcceptanceTest();

	}

}
