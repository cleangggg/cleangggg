package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@Configuration
@ComponentScan("spring.di.ui")

public class NewlecDiConfig {

	
	@Bean
	public Exam exam() {
		
		
		return new NewlecExam();
		
	}
	
	
}
