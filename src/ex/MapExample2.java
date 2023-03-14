package ex;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map2 = new HashMap<>();
		
		map2.put("첫번째", "java");
		map2.put("두번째", "mysql");
		map2.put("세번째", "spring");
		
		//위에것을 꺼낼때
		System.out.println(map2.get("두번째")); //Key로 접근한다
		
		map2.remove("세번째"); //remove도 키로 접근해야함

		// map 반복문으로 접근
		for(String Key : map2.keySet()){
			// Key값 확인    keyset for each 형식으로 씀
			System.out.println(Key); // Key값 확인
			System.out.println(map2.get(Key)); // value값 확인
			
			
		}
		
	}

}
