package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	@Autowired
	private Exam exam;
	public InlineExamConsole() {
	System.out.println("constructor");
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("constructor");
		this.exam = exam;
	}

	public void print() {
		System.out.printf("total is %d, avg is %f \n",exam.total(),exam.avg());
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
}
