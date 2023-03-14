package ex;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, StudentDTO> studentMap = new HashMap<>();
		
		
		StudentDTO studentDTO1 = new StudentDTO();
		
		studentDTO1.studentNumber = "1111";
		studentDTO1.studentName = "김자바";
		studentDTO1.studentMajor = "컴퓨터공학";
		studentDTO1.studentMoblie = "010-1111-1111";
		
		StudentDTO studentDTO2 = new StudentDTO();
		
		studentDTO2.studentNumber = "2222";
		studentDTO2.studentName = "이자바";
		studentDTO2.studentMajor = "경영학";
		studentDTO2.studentMoblie = "010-2222-2222";
		
		StudentDTO studentDTO3 = new StudentDTO();
		
		studentDTO3.studentNumber = "3333";
		studentDTO3.studentName = "박자바";
		studentDTO3.studentMajor = "전자공학";
		studentDTO3.studentMoblie = "010-3333-3333";
		
		studentMap.put(1, studentDTO1);
		studentMap.put(2, studentDTO2);
		studentMap.put(3, studentDTO3);
		
		System.out.println("번호\t학번\t이름\t전공\t전화번호");
		System.out.println("────────────────────────────────────────────────");
		for(int Key : studentMap.keySet()) {
			System.out.println(Key + "\t" + studentMap.get(Key));
		}

	}

}
