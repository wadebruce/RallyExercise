package exercise.numbers;

public class HundredsPlace extends Number {
	
	private int number;
	
	public HundredsPlace(int inputNumber) {
		this.setNumber(inputNumber);
		this.nextNumberPlace = new TensPlace(inputNumber);
	}
	
	@Override
	public String printNumber() {
		if(this.number == 0) {
			return "zero";
		}
		String firstNumber = Integer.toString(this.number).substring(0, 1);
		String numberToPrint = numberLookup.get(firstNumber) + " hundred";
		if(this.isNotAnExactHundred()) {
			numberToPrint = numberToPrint + " " + this.nextNumberPlace.printNumber();
		}
		return numberToPrint;
	}
	
	private boolean isNotAnExactHundred() {
		boolean isNotExactHundred = true;
		String lastDigits = Integer.toString(this.number).substring(1, 3);
		if("00".equals(lastDigits)) {
			isNotExactHundred = false;
		}
		return isNotExactHundred;
	}

	private void setNumber(int inputNumber) {
		if(inputNumber > 999) {
			this.number = super.getMyPlaces(inputNumber, 3);
		} else {
			this.number = inputNumber;
		}
	}
}
