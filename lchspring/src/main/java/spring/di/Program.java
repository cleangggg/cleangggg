package spring.di;

import java.util.ArrayList;
import java.util.List;

import javax.management.InvalidApplicationException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
	public static void main(String[] args) {
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam);
		//ExamConsole console = new GridExamConsole(exam);
		ExamConsole console =new GridExamConsole();
		console.setExam(exam);
		*/
		ApplicationContext context =
				new AnnotationConfigApplicationContext(NewlecDiConfig.class);
				//		new ClassPathXmlApplicationContext("classpath:setting.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
//		ExamConsole console =  context.getBean(ExamConsole.class);
	
		console.print();
		
//		List<Exam> exams = (List<Exam>)context.getBean("exams");//new ArrayList();
//		exams.add(new NewlecExam(10, 20, 30, 40));
//		for (Exam e : exams)
//			System.out.println(e);
//		
	}
}
