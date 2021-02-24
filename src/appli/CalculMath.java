package appli;

public class CalculMath {

	public int fac(int val) {
		int result = val;
		for (int k = val - 1; k > 0; k--) {
			result *=k;
		}
		return result;
	}
}
