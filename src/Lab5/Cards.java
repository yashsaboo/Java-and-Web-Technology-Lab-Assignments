package Lab5;

import java.util.ArrayList;

public class Cards extends Suit {
	public Cards() {
	}

	private ArrayList<Suit> arr = new ArrayList<>();

	void createDeck() {
		Suit[] spade = new Suit[13];
		Suit[] hearts = new Suit[13];
		Suit[] diamonds = new Suit[13];
		Suit[] clubs = new Suit[13];

		for (int i = 0; i < 13; i++) {
			spade[i] = new Suit(i + 1, "spade");
			arr.add(spade[i]);
		}
		for (int i = 0; i < 13; i++) {
			hearts[i] = new Suit(i + 1, "hearts");
			arr.add(hearts[i]);
		}
		for (int i = 0; i < 13; i++) {
			diamonds[i] = new Suit(i + 1, "diamonds");
			arr.add(diamonds[i]);
		}
		for (int i = 0; i < 13; i++) {
			clubs[i] = new Suit(i + 1, "clubs");
			arr.add(clubs[i]);
		}
	}

	void printCard() {
		int randomNum = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, arr.size());
		System.out.println("Card Number: " + arr.get(randomNum).cardno);
		System.out.println("Suit: " + arr.get(randomNum).type);
	}

	void printDeck() {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("Card Number: " + arr.get(i).cardno);
			System.out.println("Suit: " + arr.get(i).type);
		}
	}

	void sameCard() {
		int nextLoop = 0;
		int counter = 0;
		for (int i = 0; i < arr.size(); i++) {
			int x = arr.get(i).cardno;
			String y = arr.get(i).type;
			for (int j = 0; j < i; j++) {
				if ((arr.get(j).cardno == x) && (arr.get(j).type.equals(y))) {
					nextLoop = 1;
					break;
				}
			}
			if (nextLoop == 0) {
				int j;
				for (j = i; j < arr.size(); j++) {
					if ((arr.get(j).cardno == x) && (arr.get(j).type.equals(y))) {
						counter++;
					}
				}
				if (counter > 1) {
					System.out.println("Card Number: " + arr.get(i).cardno);
					System.out.println("Suit: " + arr.get(i).type);
					System.out.println("Instances of that card: " + counter);
				}
				counter = 0;
			}
			nextLoop = 0;
		}
	}

	void compareCard() {
		int randomNum1 = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, arr.size());
		int cr1 = arr.get(randomNum1).cardno;
		String tp1 = arr.get(randomNum1).type;
		System.out.println("Card Number: " + cr1);
		System.out.println("Suit: " + tp1);
		int randomNum2 = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, arr.size());
		int cr2 = arr.get(randomNum2).cardno;
		String tp2 = arr.get(randomNum2).type;
		System.out.println("Card Number: " + cr2);
		System.out.println("Suit: " + tp2);

		if ((cr1 == cr2) && (tp1.equals(tp2))) {
			System.out.println("Same cards");
		} else {
			System.out.println("Different cards");
		}
	}

	void sortCard() {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size(); j++) {
				if (arr.get(i).type.equals(arr.get(j).type)) {
					if (arr.get(i).cardno >= arr.get(j).cardno) {
						int cr1 = arr.get(j).cardno;
						String tp1 = arr.get(j).type;
						arr.remove(j);
						Suit z = new Suit(cr1, tp1);
						arr.add(i,z);
					}
				}
			}
		}

	}

	void findCard() throws java.io.IOException {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter the card number");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter the suit");
		String y = br.readLine();
		int i;
		for (i = 0; i < arr.size(); i++) {
			if ((arr.get(i).cardno == x) && (arr.get(i).type.equals(y))) {
				System.out.println("Card Found");
				break;
			}
		}
		if (i == arr.size()) {
			System.out.println("Card Not Found");
		}
	}

	void insertCard() throws java.io.IOException {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter the card number");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter the suit");
		String y = br.readLine();
		Suit z = new Suit(x, y);
		arr.add(z);
	}

	public static void main(String[] args) throws java.io.IOException {
		Cards obj = new Cards();
		obj.createDeck();
		obj.printDeck();
		obj.insertCard();
		obj.sameCard();
		obj.findCard();
		obj.printCard();
		obj.sortCard();
		obj.printDeck();
	}
}
