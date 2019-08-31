package Lab4;
public class Ques6 {
	int empId;
	int empCount;
	int [] empTelephoneNo;
	
	public Ques6() {
		super();
		empCount = 1000;
		empId = empCount+1;
	}
	public Ques6(int empId, int empCount, int[] empTelephoneNo) {
		super();
		this.empId = empId;
		this.empCount = empCount;
		this.empTelephoneNo = empTelephoneNo;
	}
	public int getEmpId() {
		return empId;
	}
	public int getEmpCount() {
		return empCount;
	}
	public int[] getEmpTelephoneNo() {
		return empTelephoneNo;
	}
	
	public static void main(String args[])
    {
    }
}
