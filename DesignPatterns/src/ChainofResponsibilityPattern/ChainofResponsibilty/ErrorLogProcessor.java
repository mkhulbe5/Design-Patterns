package ChainofResponsibilty;

public class ErrorLogProcessor extends LogProcessor{

	public ErrorLogProcessor(LogProcessor nextlogProcessor) {
		super(nextlogProcessor);
	}
	
	public void log(int logLevel,String message) {
		if(logLevel == ERROR) {
			System.out.println("Using ERROR method of log");
		}
		else {
			super.log(logLevel, message);
		}
	}
}
