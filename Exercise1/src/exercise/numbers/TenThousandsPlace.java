package exercise.numbers;

public class TenThousandsPlace extends Number {

	public TenThousandsPlace(int inputNumber) {
		this.setNumber(inputNumber);
		this.nextNumberPlace = new HundredsPlace(inputNumber);
	}
	
	@Override
	public String printNumber() {
		int firstDigits = new Integer(Integer.toString(this.number).substring(0, 2));
		String numberValue = new TensPlace(firstDigits).printNumber() + " thousand";
		
		if(this.isNotAnExactThousand()) {
			numberValue = numberValue + " " + nextNumberPlace.printNumber();
		} 
		
		return numberValue;
	}

	private boolean isNotAnExactThousand() {
		boolean isNotExactHundred = true;
		String lastDigits = Integer.toString(this.number).substring(1, 5);
		if("0000".equals(lastDigits)) {
			isNotExactHundred = false;
		}
		return isNotExactHundred;
	}
	
	private void setNumber(int inputNumber) {
		if(inputNumber > 99999) {
			this.number = super.getMyPlaces(inputNumber, 5);
		} else {
			this.number = inputNumber;
		}
	}
}
