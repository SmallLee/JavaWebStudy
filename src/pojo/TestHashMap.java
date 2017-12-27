package pojo;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
//		Person p1 = new Person(11, "张三");
//		Person p2 = new Person(11, "张三");
//		HashMap<Person,String> hashMap = new HashMap<Person,String>();
//		hashMap.put(p1,"北京");
//		hashMap.put(p2,"上海");
//		Set<Entry<Person, String>> entrySet = hashMap.entrySet();
//		Iterator<Entry<Person, String>> iterator = entrySet.iterator();
//		while (iterator.hasNext()) {
//			Entry<Person, String> next = iterator.next();
//			System.out.println(next.getKey()+"------"+next.getValue());
//		}
		JumpType[] values = JumpType.values();
		for(JumpType jumpType : values) {
			System.out.println(jumpType.ordinal());
		}
		JumpType value = JumpType.valueOf("ONE");
		System.out.println(value);
		JumpType jumpValud = JumpType.valueOf(2);
		System.out.println(jumpValud.getValue());
	}
}
