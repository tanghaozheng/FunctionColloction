package fileOperate.fileOperate;

import java.io.File;
import java.io.IOException;

public class FunctionColloction {
	public static void main(String[] args) {
		String path = "D:/中文";
//		createDirectory(path);
//		deleteFile(path);
		traverseDirectory(path);
	}
	
	/**
	 * 创建文件夹
	 * @param directoryPath 文件夹路径及名称
	 */
	public static void createDirectory(String directoryPath){
		File dir = new File(directoryPath);
		boolean flag = dir.mkdir();
		if(flag){
			System.out.println(directoryPath+"创建成功！");
		}else{
			System.err.println(directoryPath+"创建失败！");//红色字体打印
		}
	}
	
	/**
	 * 创建文件
	 * filePath 文件路径
	 * @throws IOException
	 */
	public static void creatTxtFile(String filePath) throws IOException {
		File fileName = new File(filePath);
		if (!fileName.exists()) {
			fileName.createNewFile();
			System.out.println(fileName + "已创建！");
		}else{
			System.err.println(fileName + "已存在！");
		}
	}
	
	/**
	 * 删除文件
	 * @param filePath 要删除文件的路径
	 */
	public static void deleteFile(String filePath){
		File file = new File(filePath);
		if(!file.exists()){
			System.err.println("文件不存在！");
		}else{
			boolean flag = file.delete();
			if(flag){
				System.out.println("删除"+filePath+"成功！");
			}else{
				System.err.println("删除"+filePath+"失败！");
			}
		}
	}

	/**
	 * 列出目录下的内容
	 * @param directoryPath 目录的路径
	 */
	public static void traverseDirectory(String directoryPath){
		File dir = new File(directoryPath);
		if(dir.isDirectory()){
			String[] fileList = dir.list();
			for(int i = 0;i < fileList.length;i++){
				System.out.println(fileList[i]);
			}
			System.out.println("遍历目录"+directoryPath+"成功！");
		}
	}
}
