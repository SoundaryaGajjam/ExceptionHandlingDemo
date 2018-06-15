package com.scp.exceptionHandling;

public class Demo_1 {
	int cnt=0;
	void A() throws Exception{
		try{
			cnt++;
			try{
				cnt++;
				try{
					cnt++;
					throw new Exception();
				}
				catch(Exception e){
					cnt++;
					throw new Exception();
				}
			}
			catch(Exception e){
				cnt++;
			}
		}
		catch(Exception e){
				cnt++;
		}
	}
	void display(){
		System.out.println(cnt);
	}
	public static void main(String[] args) throws Exception {
		Demo_1 d=new Demo_1();
		d.A();
		d.display();
	}

}
