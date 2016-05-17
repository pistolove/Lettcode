package headfirst.design.facade;

public class Facade {
	private SubjectA subjectA = new SubjectA();
	private SubjectB subjectB = new SubjectB();
	private SubjectC subjectC = new SubjectC();

	public void runMethod(){
		subjectA.method1();
		subjectB.method2();
		subjectC.method3();
	}
}
