package com.basic;
 class Invoice {
	 String partNumber,des;
	 int quan;
	 Double price;
	 Double total;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getQuan() {
		return quan;
	}
	public void setQuan(int quan) {
		if(quan<0)
		{
			quan=0;
		}else {
		this.quan = quan;
		}
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
   if(price<0.0)
    {
	 price=0.0;
    }
     else {
		this.price = price;
	}

}
	public Double getPriceTotal() {
		total=price*quan;
		return total;
		 //System.out.println(total);
	}
 }
 public class InvoiceTest{
	 public static void main(String[] args) {
		 Invoice s1=new Invoice();
		 s1.setPartNumber("smp18");
		 s1.setDes("paste");
		 s1.setQuan(5);
		 s1.setPrice(20.3);
		 
		 System.out.println(s1.getPartNumber());
		 System.out.println(s1.getDes());
		 System.out.println(s1.getQuan());
		 System.out.println(s1.getPrice());
		 System.out.println(s1.getPriceTotal());
		 
		 
	 }
 }
