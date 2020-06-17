package member.model.vo;

import java.io.Serializable;

public class Member implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -15322737936474195L;
	
	
	private int mNo;			// 회원 번호
	private String company;		// 회사명
	private String dept;		// 부서명
	private String phone;		// 연락처
	private int cMoney;			// 외상금액
	private int mDeposit;		// 선불금액
	private String status;		// 상태
	
	public Member() {
	}

	public Member(int mNo, String company, String dept, String phone, int cMoney, int mDeposit, String status) {
		this.mNo = mNo;
		this.company = company;
		this.dept = dept;
		this.phone = phone;
		this.cMoney = cMoney;
		this.mDeposit = mDeposit;
		this.status = status;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getcMoney() {
		return cMoney;
	}

	public void setcMoney(int cMoney) {
		this.cMoney = cMoney;
	}

	public int getmDeposit() {
		return mDeposit;
	}

	public void setmDeposit(int mDeposit) {
		this.mDeposit = mDeposit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", company=" + company + ", dept=" + dept + ", phone=" + phone + ", cMoney="
				+ cMoney + ", mDeposit=" + mDeposit + ", status=" + status + "]";
	}
	
	
}
