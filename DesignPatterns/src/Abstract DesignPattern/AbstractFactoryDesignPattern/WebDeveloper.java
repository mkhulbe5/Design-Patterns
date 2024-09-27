package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public String employeeName() {
		System.out.println("I am web developer");
		return "WEB DEVELOPER";
	}

	@Override
	public int salary() {
		return 85000;
	}

}
