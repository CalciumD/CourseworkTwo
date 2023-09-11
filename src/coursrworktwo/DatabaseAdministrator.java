package coursrworktwo;

public class DatabaseAdministrator extends Employee {

	private boolean dbsResponsible;
	
	
	
	public DatabaseAdministrator(String name, double pay,  boolean dbsResponsible) {
		super(name, pay);
		this.dbsResponsible = dbsResponsible;

	}

	
	public boolean isDbsResponsible() {
		return dbsResponsible;
	}

	public void setDbsResponsible(boolean dbsResponsible) {
		this.dbsResponsible = dbsResponsible;
	}
	
	@Override
	public double calculateTotalPay() {
		return this.getPay();
	}
	
}
