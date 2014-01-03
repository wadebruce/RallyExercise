package exercise.numbers;

public class TensPlace extends Number {

	public TensPlace(int inputNumber) {
		this.setNumber(inputNumber);
		this.nextNumberPlace = new OnesPlace(inputNumber);
	}
	
	@Override
	public String printNumber() {
		String numberValue;
		if(this.number > 9 && this.number < 20) {
			numberValue = numberLookup.get(Integer.toString(number));
		} else {
			numberValue = this.translateNumbersOverNineteen();
		}
		return numberValue;
	}

	private String translateNumbersOverNineteen() {
		String firstNumber = Integer.toString(this.number).substring(0, 1);
		String numberToPrint = numberLookup.get(TENS_HOLDER + firstNumber);
		if(!"zero".equals(this.nextNumberPlace.printNumber())) {
			numberToPrint = numberToPrint  + "-" + this.nextNumberPlace.printNumber();
		}
		return numberToPrint;
	}
	
	protected void setNumber(int inputNumber) {
		if(inputNumber > 99) {
			this.number = super.getMyPlaces(inputNumber, 2);
		} else {
			this.number = inputNumber;
		}
	}
}