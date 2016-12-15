package recursion;
//问题描述：求解Fibonacci数列的第n个位置的值？（斐波纳契数列（Fibonacci Sequence），
//又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……在数学上，
//斐波纳契数列以如下被以递归的方法定义：F1=1,F2=1,Fn=F（n-1）+F（n-2）（n>2,n∈N*））。
public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(function(6));
	}
	
	/**
	 * @param n 代表数列中的第几项
	 * @return 第n项的值
	 */
	public static int function(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return function(n-1)+function(n-2);
		}
	}
}
