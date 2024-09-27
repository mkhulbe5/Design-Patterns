package ChainofResponsibilty;

public class DebugLogProcessor extends LogProcessor {

	public DebugLogProcessor(LogProcessor nextlogProcessor) {
		super(nextlogProcessor);
	}
	
	public void log(int logLevel,String message) {
		if(logLevel == DEBUG) {
			System.out.println("Using DEBUG method of log");
		}
		else {
			super.log(logLevel, message);
		}
	}
}
