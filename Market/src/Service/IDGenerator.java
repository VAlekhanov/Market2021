package Service;

public class IDGenerator {
	public Long generateNewUserID() {
		int max = 9;
		int rnd;
		String ID = "";
		for (int i = 0; i < 6; i++) {
			rnd = (int) (Math.random() * ++max);
			ID += Integer.toString(rnd);
		}
		return Long.valueOf(ID).longValue();
	}

	public Long generateNewOrderID() {
		int max = 9;
		int rnd;
		String ID = "";
		for (int i = 0; i < 6; i++) {
			rnd = (int) (Math.random() * ++max);
			ID += Integer.toString(rnd);
		}
		return Long.valueOf(ID).longValue();
	}

	public Long generateNewItemID() {
		int max = 9;
		int rnd;
		String ID = "";
		for (int i = 0; i < 6; i++) {
			rnd = (int) (Math.random() * ++max);
			ID += Integer.toString(rnd);
		}
		return Long.valueOf(ID).longValue();
	}
}
