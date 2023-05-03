package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.springframework.web.method.support.InvocableHandlerMethod;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class program {

	public static void main(String[] args) {

		Exam exam = new NewlecExam(1,1,1,1);
		
		Exam proxy = Proxy.newProxyInstance(NewlecExam.class, new Class[]{Exam.class}, 
				new InvocationHandler() {
				 
		}
				);		
		System.out.printf("total %d\n ",exam.total());
	}

}
