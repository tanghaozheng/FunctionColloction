package mathProblem;
//寻找一个数组中两个数相加之和为K的对数并展示  
//O（n）时间复杂度完成
public class FindTwoNumberSum {
	public static void main(String[] args) {
		//假设数组是有序的
		int[] arr = { -2, -1, 0, 1, 2, 3 };
		funcition(0,arr);
	}
	/**
	 * @param k 要查找的两个数组之和
	 * @param arr  传递的数组 前提是已经有序才能达到O(n)
	 */
	public static void funcition(int k,int[] arr){
		boolean found = false;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] < 0) // 和小于K，则i++
				i++;
			else if (arr[i] + arr[j] > 0) // 和大于K，则j--
				j--;
			else { // 找到了，a[i]+a[j]=k
				System.out.println(arr[i] + "+" + arr[j]);
				i++;
				j--;
				found = true;
			}
		}
		if(found == false){
			System.out.println("没有找到！");
		}
	}
}
