package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{

	@Override
	public String employeeName() {
        System.out.println("I am android developer");
        return "ANDROID DEVELOPER";
    
	}

	@Override
	public int salary() {
		return 50000;
	}

}
