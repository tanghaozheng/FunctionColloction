package sort;

public class MergeSort {
	
	/*归并排序的效率是比较高的，设数列长为N，将数列分开成小数列一共要logN步，每步都是一个合并有序数列的过程，时间复杂度可以记为O(N)，
	故一共为O(N*logN)。因为归并排序每次都是在相邻的数据中进行操作，所以归并排序在O(N*logN)的几种排序方法（快速排序，
	归并排序，希尔排序，堆排序）也是效率比较高的。*/
	
	//归并排序方法入口
	/**
	 * @param arr 要排序的数组
	 * @param N	  数组长度
	 */
	public void mergeSortEntrance(int[] arr){
		int n = arr.length;
		int[] temp = new int[n];
		int first = 0;
		int last = n-1;
		mergeSort(arr,first,last,temp);
	}
	
	
	/**
	 * 将有序数组a[]和b[]合并到c[]中  其中假设ab分别是有序的
	 * @param a arr a
	 * @param n length a
	 * @param b arr b
	 * @param m length b
	 * @param c arr c 归并之后的ab放在c中
	 */
	public void mergeTwoArray(int a[], int n, int b[], int m, int c[]) {
		int i, j, k;
		i = j = k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while (i < n)
			c[k++] = a[i++];
		while (j < m)
			c[k++] = b[j++];
	}

	/*可以将a，b组各自再分成二组。依次类推，当分出来的小组只有一个数据时，可以认为这个小组组内已经达到了有序，
	然后再合并相邻的二个小组就可以了。这样通过先递归的分解数列，再合并数列就完成了归并排序。*/
	/**
	 * 将有二个有序数列a[first...mid]和a[mid...last]合并。  
	 * @param a   要归并排序的数组
	 * @param first	数组的开始位置
	 * @param mid	数组的中点
	 * @param last	数组的结尾
	 * @param temp	避免在归并过程中频繁的new  temp为数组的长度
	 */
	void mergeArray(int a[], int first, int mid, int last, int temp[])  
	{  
		//将数组以中点为界限一份为二，左边和右边分别已经有序
	    int i = first, j = mid + 1;  
	    int m = mid,   n = last;  
	    int k = 0;  
	      
	    while (i <= m && j <= n)  
	    {  
	        if (a[i] <= a[j])  
	            temp[k++] = a[i++];  
	        else  
	            temp[k++] = a[j++];  
	    }  
	      
	    while (i <= m)  
	        temp[k++] = a[i++];  
	      
	    while (j <= n)  
	        temp[k++] = a[j++];  
	      
	    for (i = 0; i < k; i++)  
	        a[first + i] = temp[i];  
	}  

	/**
	 * @param a  要归并排序的数组
	 * @param first	数组的开始位置 0
	 * @param last	数组的长度 a.length-1
	 * @param temp	temp的大小取决于a.length-1 ,即数组的长度
	 */
	public void mergeSort(int a[], int first, int last, int temp[])  
	{  
	    if (first < last)  
	    {  
	        int mid = (first + last) / 2;  
	        mergeSort(a, first, mid, temp);    //左边有序  
	        mergeSort(a, mid + 1, last, temp); //右边有序  
	        mergeArray(a, first, mid, last, temp); //再将二个有序数列合并  
	    }  
	} 

}
