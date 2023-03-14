package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1 = new HashMap<>();
		// <> 에는 소문자로 된것을 사용하지 않는다 첫번째 integer은 Key타입 (키는 우리가 맘대로 정할 수 있음)
		List<String> list1 = new ArrayList<>();

		map1.put(1, "안녕하세요");
		System.out.println(map1.put(2, "hello"));
		// put도 리턴이 된다 
		// 직전에 지정한 값이 2번째에 출력됨
		System.out.println(map1.put(2, "ㅎㅎㅎㅎㅎㅎㅎ")); //출력 hello
		System.out.println(map1.get(2)); // 출력 ㅎㅎㅎㅎㅎㅎㅎ
		
		String val1 = map1.get(1);
		System.out.println(val1);
		
		map1.remove(2);
		System.out.println(map1.get(2)); // 마지막 2번째 담는것을 삭제 null로 표시됨
		
		for(Integer Key : map1.keySet()) {// Integer ot int 둘다 가능
			System.out.println(Key);
			System.out.println(map1.get(Key));
		}
	}

}
