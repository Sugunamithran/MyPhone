package org.phone;

public class PhoneInfo {
	public void phoneName()
	{
		System.out.println("phoneName");
	}
	public void phoneMieiNum()
	{
		System.out.println("phoneMieiNum");
	}
	public void camera()
	{
		System.out.println("Camera");
	}
	public void storage()
	{
		System.out.println("storage");
	}
	public void osName()
	{
		System.out.println("osName");
	}
	public static void main(String[] args)
	{
		PhoneInfo p1 = new PhoneInfo();
		p1.phoneName();
		p1.phoneMieiNum();
		p1.camera();
		p1.storage();
		p1.osName();
	}

}
