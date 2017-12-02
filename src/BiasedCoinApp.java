
public class BiasedCoinApp {

	public static void main(String[] args) {
		
		BiasedCoin coin1 = new BiasedCoin(); //fair 50/50
		BiasedCoin coin2 = new BiasedCoin(.9);  //90% chance of Heads 10% tails
		BiasedCoin coin3 = new BiasedCoin(.1);  //10% chance of Heads 90% tails
		
		int count1=0;
		int count2=0;
		int count3=0;
		
		for(int i=0; i<100; i++) {
			coin1.flip();
			if(coin1.isHeads()) {
				count1++;
			}
			coin2.flip();
			if(coin2.isHeads()) {
				count2++;
			}
			coin3.flip();
			if(coin3.isHeads()) {
				count3++;
			}
		}
		System.out.println("Coin 1 hit heads " + count1 + " % of the time");
		System.out.println("Coin 2 hit heads " + count2 + " % of the time");
		System.out.println("Coin 3 hit heads " + count3 + " % of the time");

	}

}
