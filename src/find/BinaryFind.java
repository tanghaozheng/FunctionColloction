package find;

public class BinaryFind {
	// 二分查找
	public static int binaryFind(int[] arr, int num) {
		int low = 0;
		int hight = arr.length - 1;
		int mid;
		while (low <= hight) {
			mid = (low + hight) / 2;
			if (arr[mid] == num) {
				return mid + 1;
			} else if (arr[mid] < num) {
				low = mid + 1;
			} else {
				hight = mid - 1;
			}
		}
		return -1;
	}
}
