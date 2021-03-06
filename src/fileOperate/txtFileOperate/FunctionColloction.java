package fileOperate.txtFileOperate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionColloction {

	// 指定文件路径和名称
//	private static String path = "D:/suncity.txt";
//	private static File filename = new File(path);
	
	public static void main(String[] args) throws IOException {
//		creatTxtFile("D:/suncity.txt");
		readTxtFile("D:/suncity.txt");
	}
	
	
	/**
     * 读取文本文件.
     * filePath 文本文件路径
     */
    public static void readTxtFile(String filePath){
        try {
        	File fileName = new File(filePath);
        	
        	//FileReader是字符链接到文本文件的串流
        	//FileReader字符流是 以一个一个字符来读取的。
//        	FileReader fileReader = new FileReader(fileName);

        	//InputStreamReader 解决中文乱码问题
        	//InputStreamReader将字节流转换为字符流。是字节流通向字符流的桥梁。
        	InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "GBK");
        	
        	//链接到bufferReader以获得更高的效率
        	BufferedReader reader = new BufferedReader(isr);
        	
        	//line 用来承接读出来的结果
        	String line = null;
        	while((line = reader.readLine())!= null){
        		//读一行就显示一行，直到没有东西可读位置
        		System.out.println(line);
        	}
        	reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }

	/**
	 * 修改txt文件
	 * @param filePath文件路径
	 */
	public static void modifyTxtFile(String filePath){
		
	}
}
