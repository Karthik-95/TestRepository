package day18;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike("TN22CM4048","Pulsar",80000,220);
		Bike b2=new Bike("TN22DT","Cbr",125000,250);
		Bike b3=new Bike("TN31BE2440","Activa",75000,125);
		Bike b4=new Bike("AP47BS7779","Duke",200000,200);
		Bike b5=new Bike("KA79AS4000","Tvsxl",40000,100);
		Bike b6=new Bike("KA88SS0001","ScootyPep",60000,120);
		HashMap<String,Bike>bikes=new HashMap<>();
		bikes.put(b1.getVehicleNumber(), b1);
		bikes.put(b2.getVehicleNumber(), b2);
		bikes.put(b3.getVehicleNumber(), b3);
		bikes.put(b4.getVehicleNumber(), b4);
		bikes.put(b5.getVehicleNumber(), b5);
		bikes.put(b6.getVehicleNumber(), b6);
		/*for(String i:bikes.keySet()) {
			String model=bikes.get(i).getModel();
			System.out.println(model);
		}*/
		/*for(Bike i:bikes.values()) {
			String mid=i.getModel().substring(1,i.getModel().length()-1);
			System.out.println(mid);
		}*/
		/*int max=0;
		String n="";
		for(Bike i:bikes.values()) {
			int pr=i.getPrice();
			if(pr>max) {
				max=pr;
				n=i.getModel();
				
			}
		}
		System.out.println("Highest Bike Price :"+n+"-"+max);*/
		/*String big="";
		for(Bike i:bikes.values()) {
			String m=i.getModel();
			if(i.getModel().length()>big.length()) {
				big=i.getModel();
			}
				
			}
		String rev="";
		for(int i=big.length()-1;i>=0;i--) {
			rev=rev+big.charAt(i);
		}
		System.out.println(rev);*/
		/*bikes.values().forEach((i)->{
			String model=i.getModel();
			System.out.println(model.charAt(0)+""+model.charAt(model.length()-1));
			
		});*/
		Iterator<Bike>cc=bikes.values().iterator();
		int max=0;
		while(cc.hasNext()) {
			if(cc.next().getCc()>max) {
				max=cc.next().getCc();
				cc.remove();
			}
		}
		for(Bike i:bikes.values()) {
			System.out.println(i.getModel());
		}
		
	}

}
