package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.printf("gridconsole 출력 %d,%f", exam.total(), exam.avg());

	}

	@Autowired
	public void setExam(Exam exam) {
		this.exam = exam;
	}
}