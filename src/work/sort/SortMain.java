package work.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMain {
	
	public static Map<String,int[]> map = new HashMap<String,int[]>();
	public static void main(String[] args) {
		
	}
	
	
	public void exportResult(){
		Set<String> set = map.keySet();
		List<String> writeList = new ArrayList<String>();
		for(String key : set){ 
			if(map.get(key)[1] < 10){
				String value = key + map.get(key)[0] + map.get(key)[1];
				writeList.add(value);
			}
		}
		//write
	}
	
	public void filterRepeat(){
		for(;;){
			String key = "seed";
			int urlCount = 10;
			int newsCount = 10;
			int[] arr = new int[2];
			arr[0] = urlCount;
			arr[1] = newsCount;
			if(map.containsKey(key)){
				if(map.get(key)[1]>newsCount || map.get(key)[0]>urlCount){
					map.put(key, arr);
				}
			}else{
				map.put(key, arr);
			}
		}
	}

}
