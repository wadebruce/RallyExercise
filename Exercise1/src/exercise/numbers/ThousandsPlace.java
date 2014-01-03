package exercise.numbers;

public class ThousandsPlace extends Number {

	public ThousandsPlace(int inputNumber) {
		this.setNumber(inputNumber);
		this.nextNumberPlace = new HundredsPlace(inputNumber);
	}
	
	@Override
	public String printNumber() {				
		String firstNumber = Integer.toString(this.number).substring(0, 1);
		String numberToPrint = numberLookup.get(firstNumber) + " thousand";
		if(this.isNotAnExactThousand()) {
			numberToPrint = numberToPrint + " " + this.nextNumberPlace.printNumber();
		}
		return numberToPrint;
	}

	private boolean isNotAnExactThousand() {
		boolean isNotExactHundred = true;
		String lastDigits = Integer.toString(this.number).substring(1, 4);
		if("000".equals(lastDigits)) {
			isNotExactHundred = false;
		}
		return isNotExactHundred;
	}
	
	private void setNumber(int inputNumber) {
		if(inputNumber > 9999) {
			this.number = super.getMyPlaces(inputNumber, 4);
		} else {
			this.number = inputNumber;
		}
	}
}
