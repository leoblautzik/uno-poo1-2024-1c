package pilasYcolas;

public class UnirColas {

	public ColaL<Integer> unirColas(Cola<Integer> c1, Cola<Integer> c2) {

		ColaL<Integer> colaUnida = new ColaL<Integer>();
		while (!c1.isEmpty())
			colaUnida.offer(c1.poll());
		
		while (!c2.isEmpty())
			colaUnida.offer(c2.poll());

		return colaUnida;
	}
	
	public static void main(String[] args) {
		UnirColas uc = new UnirColas();
		Cola2P<Integer> c1 = new Cola2P<Integer>();
		c1.offer(1);
		c1.offer(2);
		c1.offer(3);
		
		Cola2P<Integer> c2 = new Cola2P<Integer>();
		c2.offer(5);
		c2.offer(7);
		c2.offer(9);
		
		System.out.println(uc.unirColas(c1, c2));
		
	}

}
