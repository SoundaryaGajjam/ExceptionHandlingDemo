package com.scp.exceptionHandling;

public class ExHandlingImplEmp {
	static int len=0;
	public static void main(String[] args)  {
		
		Address add1=new Address("pune", 411052);
		Employee e1= new Employee(1, "John", 15000,25, add1);
		
		boolean flag=false;
		
		String s=String.valueOf(e1.getAddress().getPincode());
		 len=s.length();
		
		
	    
		try {
			 flag=verifyEmpDetails(e1);
			 
		} /*catch (InvalidAgeException | InvalidAddressException | InvalidSalaryException e) {
			e.printStackTrace();
		}*/
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(e1);
		String opt = flag ? " valid " : " invalid ";
		System.out.println("Employee details are : "+opt);
	}
	


	private static boolean verifyEmpDetails(Employee e1) throws Exception {
		/*if(((((null==e1 || e1.getAddress()==null)?true:false)
				||((e1.getEmpAge()<21)?true:false)))
				||((e1.getEmpSal()<10000)?true:false)
				||(!(e1.getAddress().getCity()!=null && len==6)?true:false)
		   )*/
		if((((((
				(null==e1 || e1.getAddress().getCity()==null)
			||  (e1.getEmpAge()<21)))
			||  (e1.getEmpSal()<10000))?true:false)
			||   (!(e1.getAddress().getCity()!=null && len ==6))?true:false)
			)
			throw new GenricException("Plz....Enter valid details :-)");
		return true;
	}
	}
	class GenricException extends Exception{

		public GenricException(String msg) {
			super(msg);
		}
		
	}

	

	/*private static boolean verifyEmpDetails(Employee e1) throws InvalidAgeException,InvalidSalaryException,InvalidAddressException,
	Exception {
		if(null==e1 || e1.getAddress()==null)
			throw new Exception("Objects can not be null...");
		else if(e1.getEmpAge()<21)
			throw new InvalidAgeException("Age should be greater than 21...");
		else if(e1.getEmpSal()<10000)
			throw new InvalidSalaryException("Bicharaaaa.......");
		else{
			String s=String.valueOf(e1.getAddress().getPincode());
			if(!(e1.getAddress().getCity()!=null && s.length()==6))
				throw new InvalidAddressException("City can not be null & length of pincode must be 6 .......");
			
		}
	return true;
	}
}*/
	
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
}
class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String msg) {
		super(msg);
	}
}
class InvalidAddressException extends Exception{
	public InvalidAddressException(String msg) {
		super(msg);
	}
	
}


class Employee{
	private int empId;
	private String empName;
	private double empSal;
	private int empAge;
	private Address address;
	public Employee(int empId, String empName, double empSal, int empAge, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAge = empAge;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAge=" + empAge
				+ ", address=" + address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
class Address{
	private String city;
	private int pincode;
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
