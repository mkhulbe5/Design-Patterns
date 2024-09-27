package AbstractFactoryDesignPattern;

public class WebDeveloperFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new WebDeveloper();

	}

}
