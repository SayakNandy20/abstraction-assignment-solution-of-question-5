package parentchildabs5;

public class magazine extends book{
	private String magazinetype;

	public magazine(int iSBNNumber, String bookName, double price, String magazinetype) {
		super(iSBNNumber, bookName, price);
		this.magazinetype = magazinetype;
	}

	public String getMagazinetype() {
		return magazinetype;
	}

	public void setMagazinetype(String magazinetype) {
		this.magazinetype = magazinetype;
	}

	@Override
	public float calculateDiscount() {
		// TODO Auto-generated method stub
		float discount =(float) ((15*super.getPrice())/100);
		return discount;
		
	}


	

}
