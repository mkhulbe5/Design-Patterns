package ChainofResponsibilty;

public class InfoLogProcessor extends LogProcessor {

	public InfoLogProcessor(LogProcessor nextlogProcessor) {
		super(nextlogProcessor);
	}
	
	public void log(int logLevel,String message) {
		if(logLevel == INFO) {
			System.out.println("Using info method of log");
		}
		else {
			super.log(logLevel, message);
		}
	}
	
	

}
