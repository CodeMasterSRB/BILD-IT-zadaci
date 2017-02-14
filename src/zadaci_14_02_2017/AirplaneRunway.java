package zadaci_14_02_2017;

import java.util.Scanner;

/*
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, možemo
 * izraèunati minimalnu dužinu piste potrebne da avion uzleti koristeæi se
 * sljedeæom formulom: dužina = v * v / 2a. Napisati program koji pita
 * korisnika da unese v u m/s i a u m/s te ispisuje korisniku minimalnu
 * dužinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje
 * dužina piste je 514.286)
 */

public class AirplaneRunway {

	// method which count length of airplane railway based on speed and
	// acceleration
	private static double countMaxLengthOfAirplaneRailway(double speed, double acceleration) throws Exception {

		if (speed <= 0 || acceleration <=0) {
			throw new Exception();
		}
		
		double length = (Math.pow(speed, 2)) / (2 * acceleration);
		return length;

	}

	public static void main(String[] args) {
		// Test
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Unesite brzinu: ");
			double speed = input.nextDouble();

			System.out.print("Unesite ubrzanje: ");
			double acceleration = input.nextDouble();

			System.out.println("Maksimalna duzina avionske piste iznosi : "
					+ countMaxLengthOfAirplaneRailway(speed, acceleration));

		} catch (Exception e) {
			System.out.println("Niste dobro unijeli podatke!!!");
		} finally {
			input.close();
		}
	}

}
