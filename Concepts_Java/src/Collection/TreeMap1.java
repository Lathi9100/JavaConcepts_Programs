package Collection;

import java.util.TreeMap;
//maintains sorting order
public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap treemap = new TreeMap();
		treemap.put(100, "ABC");
		treemap.put(105, "BBB");
		treemap.put(101, "POI");
		//treemap.put("IJY", "ASD");//Class cast Exception runtime
		treemap.put(104, "ASD");
		treemap.put(102, "HIJ");
		System.out.println(treemap);//{100=ABC, 101=POI, 102=HIJ, 104=ASD, 105=BBB}
	//	treemap.put(null, "IUY");//Nullpointer Exception runtime
		
	}
}
