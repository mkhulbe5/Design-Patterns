package ChainofResponsibilty;

public abstract class LogProcessor {
	
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 1;
	
	LogProcessor nextlogProcessor;
	
	public LogProcessor(LogProcessor logProcessor) {
		this.nextlogProcessor = logProcessor;
	}
	
	public void log(int logLevel,String message) {
		if(nextlogProcessor != null) {
			nextlogProcessor.log(logLevel, message);
		}
	}
	

}
