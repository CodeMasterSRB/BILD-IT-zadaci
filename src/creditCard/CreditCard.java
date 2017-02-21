package creditCard;

public class CreditCard {

	private long cardNumber;

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean isLegit() {

		if (isCorrectLength(cardNumber) && isNumberDigitsLegit(cardNumber) && isPositive(cardNumber)) {
			return true;
		}

		return false;
	}

	// method which check is digits valid
	private boolean isNumberDigitsLegit(long cNumber) {

		int sumS1 = 0;
		int sumOdd = 0;
		long tempNumber = cNumber;
		int oneDigit = 0;

		for (int i = 0; tempNumber != 0; i++) {

			oneDigit = (int) (tempNumber % 10);
			tempNumber /= 10;

			// double every second digit from right to left
			if (i % 2 != 0) {

				if (oneDigit * 2 < 10) {
					sumS1 += oneDigit * 2;
				} else {
					// if doubled number is two digit
					sumS1 += ((oneDigit * 2) % 10) + 1;
				}
			} else {
				sumOdd += oneDigit;
			}

		}

		// If the result from sumS1 + sumOdd is divisible by 10, the card number
		// is valid; otherwise,
		// it is invalid
		if ((sumS1 + sumOdd) % 10 == 0) {
			return true;
		}
		return false;
	}

	// method which check is size of card number legal
	private boolean isCorrectLength(long cNumber) {

		int size = 0;

		while (cNumber > 0) {

			cNumber /= 10;
			size++;
		}

		// check for card length
		if (size >= 13 && size <= 16) {
			return true;
		} else {
			return false;
		}

	}

	// check is inputed card number positive
	private boolean isPositive(long cNumber) {
		if (cNumber > 0) {
			return true;
		}

		return false;
	}

}
