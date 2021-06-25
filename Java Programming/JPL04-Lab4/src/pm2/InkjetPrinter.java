package pm2;

public class InkjetPrinter extends Printer {
	
	private String modelName;
	private String manufacturer;
	private int type; // 0-USB , 1-PARALLEL
	private int numberOfPrinted;
	private int numberOfPaper;
	
	public InkjetPrinter(String modelName, String manufacturer, int type, int numberOfPrinted, int numberOfPaper) {
		super();
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.type = type;
		this.numberOfPrinted = numberOfPrinted;
		this.numberOfPaper = numberOfPaper;
	}
	
	
	

}
