package com.study.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정으로 사용됨을 의미
public class Config {
	// 빈(bean) : Spring 이 IOC 방식으로 관리하는 객체
	// 빈 팩토리(BeanFactory) : 스프링 IOC를 담당하는 핵심 컨테이너
	// 어플리케이션 컨텍스트 : 빈 팩토리를 확장한 IOC컨테이너
	@Bean
	public SportsCar Sports() {
		SportsCar Sprots = new SportsCar();
		Sprots.go();

		return Sprots;
	}
	@Bean(name="hello")
	public Truck truck() {
		Truck truck = new Truck();
		return truck;
	}
}
