package src.engines;

import src.engines.algo.Algo2;
import src.engines.main.MainEngine;

public class PaiRiT extends MainEngine {

	public PaiRiT(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	// public double placePaiRiT

	public String check() {

		// this is used by Controller
		String checkMessage;
		checkMessage = "ok";
		return checkMessage;
	}

	public String useAlgoTwo(double value) {

		// Execute the Input from Algo2

		Algo2 e = new Algo2();

		return e.AlgoTwo();
		// da stimmt was n�d
	}
}