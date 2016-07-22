
public class SanPham {

	private String strID;
	private double dPrice;
	
	public SanPham(String strID, double dPrice) {
		super();
		setStrID(strID);
		setdPrice(dPrice);
	}

	public String getStrID() {
		return strID;
	}

	public void setStrID(String strID) {
		this.strID = strID;
	}

	public double getdPrice() {
		return dPrice;
	}

	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}

	public SanPham()
	{
		setStrID("");
		setdPrice(0);
	}
}
