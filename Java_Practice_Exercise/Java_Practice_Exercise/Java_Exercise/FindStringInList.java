package Java_Exercise;

import java.util.ArrayList;
import java.util.List;

public class FindStringInList {
	List<String> strList;
	
	public FindStringInList(String[] strArray) {
		this.strList = new ArrayList<String>();
		
		int arrLength = strArray.length;
		
		for(int i = 0; i < arrLength; i++) {
			this.strList.add(strArray[i]);
		}
	}
	
	public void PrintStringInListBool (String str) {
		System.out.println(this.strList.contains(str));
	}
}
