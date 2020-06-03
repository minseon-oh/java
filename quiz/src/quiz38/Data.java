package quiz38;

public class Data {
	
	private String month;
	private String day;
	private String code;
	private String code2;
	private String fish;
	private String name;
	private String monthWeight;
	private String yearWeight;
	private String monthPrice;
	private String yearPrice;
	
	//생성자
	public Data() {
		
	}

//	public Data(String month, String day, String code, String code2, String fish, String name, String monthWeight,
//			String yearWeight, String monthPrice, String yearPrice) {
//		super();
//		this.month = month;
//		this.day = day;
//		this.code = code;
//		this.code2 = code2;
//		this.fish = fish;
//		this.name = name;
//		this.monthWeight = monthWeight;
//		this.yearWeight = yearWeight;
//		this.monthPrice = monthPrice;
//		this.yearPrice = yearPrice;
//	}

	@Override
	public String toString() {
		return "Data [month=" + month + ", day=" + day + ", code=" + code + ", code2=" + code2 + ", fish=" + fish
				+ ", name=" + name + ", monthWeight=" + monthWeight + ", yearWeight=" + yearWeight + ", monthPrice="
				+ monthPrice + ", yearPrice=" + yearPrice + "]";
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonthWeight() {
		return monthWeight;
	}

	public void setMonthWeight(String monthWeight) {
		this.monthWeight = monthWeight;
	}

	public String getYearWeight() {
		return yearWeight;
	}

	public void setYearWeight(String yearWeight) {
		this.yearWeight = yearWeight;
	}

	public String getMonthPrice() {
		return monthPrice;
	}

	public void setMonthPrice(String monthPrice) {
		this.monthPrice = monthPrice;
	}

	public String getYearPrice() {
		return yearPrice;
	}

	public void setYearPrice(String yearPrice) {
		this.yearPrice = yearPrice;
	}
	
	

}
