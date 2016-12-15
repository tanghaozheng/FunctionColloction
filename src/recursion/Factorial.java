package recursion;
//求阶乘
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(5));
		System.out.println(funcChange(5));
	}
	
	public static int func(int n){
		if(n == 1){
			return 1;
		}else{
			return n*func(n-1);
		}
	}
	
	/**
	 * 非递归算法实现  中间变量来实现
	 * @param x 
	 * @return
	 */
	public static int funcChange(int x){
		int s = 1;
		for(int i = 1; i <= x; i++){
			s = s*i;
		}
		return s;
	}

}
