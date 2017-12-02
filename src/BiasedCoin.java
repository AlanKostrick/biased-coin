
public class BiasedCoin {
	
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	
	private double bias;
	
	public BiasedCoin() {
		bias = .5;
		flip();
	}
	
	public BiasedCoin(double bias) {
		if(bias >=0 && bias <=1) {
			this.bias = bias;
		} else {
			bias = .5;
		}
		flip();
	}
	 
	public void flip() {
		double rand = Math.random();
		if(rand < bias) {
			face = HEADS;
		} else {
			face = TAILS;
		}
	}
	
	public boolean isHeads() {
		return (face == HEADS);
	}
	
	public String toString() {
		
		String faceName;
		if(face == HEADS) {
			faceName  = "Heads";
		} else {
			faceName = "Tails";
		}
		
		return faceName;
	}

}
