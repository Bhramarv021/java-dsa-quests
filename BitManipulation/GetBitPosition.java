// Bit Manipulation
class GetBitPosition{
	public static void main(String[] args) {
		System.out.println(getBit(5,2));	
		System.out.println(setBit(5,1));	
		System.out.println(clearBit(5,2));	
		System.out.println(updateBit(5,1,1));	
	}

	private static int getBit(int n, int pos){
		return (n & (1<<pos));
	}

	private static int setBit(int n, int pos){
		return (n | (1<<pos));
	}

	private static int clearBit(int n, int pos){
		int mask = ~(1<<pos);
		return (n & mask);
	}

	private static int updateBit(int n, int pos, int value){
		// First Clear the bit and then set bit (to update)
		int mask = ~(1<<pos);
		n = (n & mask);
		return (n | (value<<pos));
	}
}