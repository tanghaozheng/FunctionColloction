package sort;

public class Main {

	public static void main(String[] args) {
		MergeSort t = new MergeSort();
		int[] arr = {1,3,43,6,3,7,8,2,11,15};
		t.mergeSortEntrance(arr);
		for(int n:arr){
			System.out.println(n);
		}
	}

}
