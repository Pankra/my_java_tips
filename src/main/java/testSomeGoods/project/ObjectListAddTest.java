package testSomeGoods.project;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class ObjectListAddTest {

	public static void main(String[] args) {

		ObjectExample objectExample = new ObjectExample();
		List<ObjectExample> objectList = new ArrayList<ObjectExample>();
		

		
		
		objectExample.setName("first");
		objectList.add(objectExample);
		objectExample.setName("second");
		objectList.add(objectExample);
		objectExample = new ObjectExample("third");
		objectList.add(objectExample);
		
		for (ObjectExample object: objectList) {
			System.out.println(object.getName());
		}
			
		ObjectExample checkNumSetObject = new ObjectExample();
//		checkNumSetObject.setNum(""); //нельзя
		
		ObjectExample checkDataSetObject = new ObjectExample();
//		checkDataSetObject.setDate(""); //нельзя
		
		System.out.println(new String("").isEmpty());
		
	}
	

}
