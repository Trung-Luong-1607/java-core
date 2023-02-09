package fa.training.has_a;

public class Address {
	private String district;
	private String ward;
	private String province;

	public Address(String district, String ward, String province) {
		super();
		this.district = district;
		this.ward = ward;
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", ward=" + ward + ", province=" + province + "]";
	}
	
	

}
