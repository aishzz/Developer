package com.xworkz.bigfish.boot;

public class KurthaTop {

			public String brand;
			public String type;
			public int price;
			public String website;
			public boolean forWomen;

			public String[] otherCompetaters;
			public String[] otherTypes;
			public char[] sizes;
			public String[] otherWebsites;
			public int[] pricesInOtherWebsites;
			public String[] toWhom;

			public KurthaTop(String brand, String type, int price, String website, boolean forWomen, String[] otherCompetaters,
					String[] otherTypes, char[] sizes, String[] otherWebsites, int[] pricesInOtherWebsites, String[] toWhom) {

				this.brand = brand;
				this.type = type;
				this.price = price;
				this.website = website;
				this.forWomen = forWomen;

				this.otherCompetaters = otherCompetaters;
				this.otherTypes = otherTypes;
				this.sizes = sizes;
				this.otherWebsites = otherWebsites;
				this.pricesInOtherWebsites = pricesInOtherWebsites;
				this.toWhom = toWhom;

			}

			public void KurthaTop(String brand2, String type2, int price2, String website2, boolean forWomen2,
					String[] otherCompetaters2, String[] otherTypes2, char[] sizes2, String[] otherWebsites2,
					int[] pricesInOtherWebsites2, String[] toWhom2) {
				
			}

			public void display() {

				System.out.println("Brand : " + this.brand);
				System.out.println("Type : " + this.type);
				System.out.println("Price : " + this.price);
				System.out.println("Website : " + this.website);
				System.out.println("For Women :" + this.forWomen);

				System.out.println(System.lineSeparator() + "====Other Competaters====");
				for (int i = 0; i < otherCompetaters.length; i++) {
					String string = otherCompetaters[i];
					System.out.println(string);
				}
				System.out.println(System.lineSeparator() + "====Other Types====");
				for (int i = 0; i < otherTypes.length; i++) {
					String string = otherTypes[i];
					System.out.println(string);
				}
				System.out.println(System.lineSeparator() + "====Sizes====");
				for (int i = 0; i < sizes.length; i++) {
					char c = sizes[i];
					System.out.println(c);
				}

				System.out.println(System.lineSeparator() + "====Other Websites====");
				for (int i = 0; i < otherWebsites.length; i++) {
					String string = otherWebsites[i];
					System.out.println(string);
				}
				System.out.println(System.lineSeparator() + "====Prices In Other Websites====");
				for (int i = 0; i < pricesInOtherWebsites.length; i++) {
					int j = pricesInOtherWebsites[i];
					System.out.println(j);
				}
				System.out.println(System.lineSeparator() + "====To Whom====");
				for (int i = 0; i < toWhom.length; i++) {
					String string = toWhom[i];
					System.out.println(string);
				}

			}

			public void display1() {
				// TODO Auto-generated method stub
				
			}
		}
