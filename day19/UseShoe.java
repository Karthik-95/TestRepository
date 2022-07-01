package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseShoe {
	public static void main(String[] args) {
		Shoe s1 = new Shoe("Adidas", 8, 3000, true, "Sports");
		Shoe s2 = new Shoe("Nike", 7, 4000, true, "Casuals");
		Shoe s3 = new Shoe("WoodLand", 10, 5000, true, "Formal");
		Shoe s4 = new Shoe("Puma", 7, 3500, false, "Sports");
		Shoe s5 = new Shoe("Reebok", 10, 5500, true, "Sports");
		Shoe s6 = new Shoe("Adidas", 7, 7000, true, "Sports");
		Shoe s7 = new Shoe("Adidas", 8, 6000, true, "Formal");
		Shoe s8 = new Shoe("Puma", 6, 1000, false, "Casuals");
		ArrayList<Shoe> shoeDetails = new ArrayList<>();
		shoeDetails.add(s1);
		shoeDetails.add(s2);
		shoeDetails.add(s3);
		shoeDetails.add(s4);
		shoeDetails.add(s5);
		shoeDetails.add(s6);
		shoeDetails.add(s7);
		shoeDetails.add(s8);
		// shoeDetails.stream().map(x->x.getBrand().substring(1,x.getBrand().length()-1)).forEach(z->System.out.println(z.length()));
		// List<String>midLength=shoeDetails.stream().map(x->x.getBrand().substring(1,x.getBrand().length()-1)).collect(Collectors.toList());
		// midLength.forEach(x->System.out.println(x.length()));
		// shoeDetails.stream().map(x->x.isWarranty()&&x.getShoeType().equals("Sports")).forEach(z->System.out.println(z));
		List<Boolean> war = shoeDetails.stream().map(x -> x.isWarranty() && x.getShoeType().equalsIgnoreCase("sports"))
				.collect(Collectors.toList());
		// war.forEach(x->System.out.println(x));
		// shoeDetails.stream().filter(x->x.getShoeType().equalsIgnoreCase("sports")&&x.getBrand().equalsIgnoreCase("adidas")).forEach(x->System.out.println(x.getPrice()));
		List<Shoe> l = shoeDetails.stream()
				.filter(x -> x.getBrand().equalsIgnoreCase("adidas") && x.getShoeType().equalsIgnoreCase("sports"))
				.collect(Collectors.toList());
		l.forEach(x -> System.out.println(x.getPrice()));
		// shoeDetails.stream().filter(x->x.getSize()<8).forEach(x->System.out.println(x.getBrand().toUpperCase()));
		List<Shoe> o = shoeDetails.stream().filter(x -> x.getSize() < 8).collect(Collectors.toList());
		o.forEach(x -> System.out.println(x.getBrand().toUpperCase()));
		// shoeDetails.stream().filter(x->x.isWarranty()==false).forEach(x->System.out.println(x.getShoeType().charAt(0)));
		List<Shoe> p = shoeDetails.stream().filter(x -> x.isWarranty() == false).collect(Collectors.toList());
		p.forEach(x -> System.out.println(x.getShoeType().charAt(0)));
		// shoeDetails.stream().filter(x->x.isWarranty()==false).map(x->x.getShoeType().charAt(0)).forEach(x->System.out.println(x));
		List<Shoe>maximum=shoeDetails.stream().filter(x->x.isWarranty()&&x.getShoeType().equalsIgnoreCase("sports")).collect(Collectors.toList());
		int max=0;
		for(Shoe i:maximum) {
			if(i.getPrice()>max) {
				max=i.getPrice();
			}
		}
		System.out.println("Maximum price :"+max);
			

	}

}
