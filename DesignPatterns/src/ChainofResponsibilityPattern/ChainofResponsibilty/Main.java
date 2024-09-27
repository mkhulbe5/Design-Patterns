package ChainofResponsibilty;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogProcessor obj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		obj.log(LogProcessor.ERROR, "exception happened");

	}

}
