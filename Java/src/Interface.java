
package src;

import src.user.users.Admin;
import src.user.users.Controller;
import src.user.users.Kunde;

public class Interface {
	public static void main(String[] args) {

		Admin ka = new Admin();
		Controller kc = new Controller();
		Kunde kk = new Kunde();

		System.out.println(ka.check(2));
		System.out.println(kc.analyze(1));
		System.out.println(kk.place(123));
		System.out.println(kk.read());
	}
}