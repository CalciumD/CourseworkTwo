package coursrworktwo;

public class SoftwareEngineer extends Employee {

	public String title;
	
	private int JSWE = 1;
	private double MSWE = 1.5;
	private double jsweBonus = 3000.00;
	private double swe = 10000.00;
	private double SSWE = 25000;
	private int MSSWE = 2;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SoftwareEngineer(String name, double pay, String title) {
		super(name, pay);
		this.title = title;
	}

	@Override
	public double calculateTotalPay() {
		return this.getPay();
	}
	
	
}
