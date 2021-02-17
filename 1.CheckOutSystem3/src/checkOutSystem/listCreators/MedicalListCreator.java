package checkOutSystem.listCreators;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

import checkOutSystem.items.Medical;

public class MedicalListCreator {

	static Medical paracetamol = new Medical(401, "Paracetamol", BigDecimal.valueOf(0.39), "Johnson & Johnson");
	static Medical antihistamines = new Medical(402, "Antihistamines", BigDecimal.valueOf(2.99), "GSK");
	static Medical condoms = new Medical(403, "Condoms", BigDecimal.valueOf(7.99), "Durex");
	static Medical coldAndFlu = new Medical(404, "Cold & Flu", BigDecimal.valueOf(4.99), "Johnson & Johnson");

	public static TreeSet<Medical> create() {
		Set<Medical> medicalSet = Set.of(paracetamol, antihistamines, condoms, coldAndFlu);
		TreeSet<Medical> medicalTS = new TreeSet<>(medicalSet);
		return medicalTS;
	}

	public static Medical getParacetamol() {
		return paracetamol;
	}

	public static Medical getAntihistamines() {
		return antihistamines;
	}

	public static Medical getCondoms() {
		return condoms;
	}

	public static Medical getColdAndFlu() {
		return coldAndFlu;
	}
}
