package com.psl.stackvaldation;
import com.psl.contact.validation.*;;

public class StackQuestion {
	static int topstack=0;
	
	
	public Contact[] arr=new Contact [1];
	
	public void stackPush(Contact c) throws ContacValidationFails, StackFull
	{
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]==null)
		 {
			 if(c.validateData(c.getFirstName(),c.getLastName(), c.getMailid(), c.getDOB(), c.getWebsite(),c.getGender(), c.getAniversary(),c.getArea(), c.getCity(),c.getState(), c.getCountry(), c.getPincode(), c.getMobileno(), c.getTelephoneno()))
			 {
				 arr[i]=c;
				 topstack++;
			 }
			 else
			 {
				 throw(new ContacValidationFails());
			 }
		 }
		 else
		 {
			 throw(new StackFull() );
		 }
	 }
	}
	
	public void stackPop() throws EmptyStack
	{
		if(topstack==0)
		{
			throw(new EmptyStack());
		}
		else
		{
			arr[topstack-1]=null;
		}
		
	}

	public static void main(String[] args) throws ContacValidationFails, StackFull, EmptyStack 
	{
		// TODO Auto-generated method stub
		Contact c=new Contact("Pankaj", "s", "p@gmail.com", "16-09-1993", "", "MALE", "22-09-1993", "Surya Nagar", "Udaipur", "Rajasthan", "India", 313002, 800625, 246069);
		Contact cs=new Contact("Dinesh", "Suthar", "p@gmail.com", "16-09-1993", "", "MALE", "22-09-1993", "Surya Nagar", "Udaipur", "Rajasthan", "India", 313002, 800625, 246069);
		
		StackQuestion sq=new StackQuestion();
		sq.stackPush(c);
		sq.stackPop();
		sq.stackPush(cs);
		
		
	}

}
