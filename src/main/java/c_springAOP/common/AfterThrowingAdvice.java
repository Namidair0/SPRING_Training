package c_springAOP.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	
	public void exceptionLog(JoinPoint jp, Exception exceptionObj) {
		String method = jp.getSignature().getName();
		//System.out.println("[예외 처리] "+method+"()메소드 수행 중 발생된 예외 메세지: "+exceptionObj.getMessage());
		
		System.out.println(method+"()메소드 수행 중 예외 발생!");
		
		if(exceptionObj instanceof IllegalArgumentException) {
			System.out.println("부적절한 값이 입력되었습니다.");
		}else if (exceptionObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		}else if (exceptionObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
				
	}
	
}