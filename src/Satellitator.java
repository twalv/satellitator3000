public class Satellitator{
	public static void main(String[] args){
		System.out.println("Willkommen beim Sattelitator 3000");
		double gamma = 6.67408 * Math.pow(10, -11);
		System.out.println(gamma);
		double erdmasse = 5.97219 * Math.pow(10, 24);
		System.out.println(erdmasse);
		double r = 1.49 * Math.pow(10, 11);
		double a = 0;
		System.out.println(a);
		double v = 0;
		int tage = 0;
		while (r > 0){
			a = -gamma * (erdmasse / Math.pow(r, 2));
			//System.out.println(a);
			v = v + (a * 86400);
			//System.out.println(v);
			r = r + (v * 86400);
			System.out.println(r);
			tage++;
		}
		System.out.println(tage);
	}
}
