package a_springIOC.polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker{
	
	public SonySpeaker() {
		System.out.println("===> sonyspeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("sonyspeaker --- 소리 올린다");
	}
	public void volumeDown() {
		System.out.println("sonyspeaker --- 소리 내린다");
	}
	
}