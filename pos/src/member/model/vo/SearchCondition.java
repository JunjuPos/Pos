package member.model.vo;

public class SearchCondition {

	private String cName;
	private String dept;
	
	public SearchCondition() {
	}

	public SearchCondition(String cName, String dept) {
		this.cName = cName;
		this.dept = dept;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "SearchCondition [cName=" + cName + ", dept=" + dept + "]";
	}
	
	
	
	
	
}
