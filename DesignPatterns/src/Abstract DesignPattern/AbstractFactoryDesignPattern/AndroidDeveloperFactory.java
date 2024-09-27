package AbstractFactoryDesignPattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new AndroidDeveloper();

	}

}
