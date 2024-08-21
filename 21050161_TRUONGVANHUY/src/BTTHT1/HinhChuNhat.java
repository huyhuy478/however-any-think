package BTTHT1;
public class HinhChuNhat{
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double d) {
	
			this.chieuDai= d;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double r) {
		
			this.chieuRong=r;
		
	}

	public HinhChuNhat(double d, double r) {
	
		if (d>0) { this.chieuDai= d;
		} 
		else {
			System.out.println("loi chieu dai");
		}
	
	if(r>=0) {this.chieuRong= r;
	} 
	else {
		System.out.println("loi chieu rong");
		}
	}
	

	public double getCV(){
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDT() {
		return (getChieuDai()*getChieuRong());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		s=s+String.format("%10|10%|10%|10%|",getChieuDai(),getChieuRong(),getCV(),getDT());
		return s ;
	}
	}
