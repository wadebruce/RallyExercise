package exercise.numbers;

public class OnesPlace extends Number{

	public OnesPlace(int inputNumber) {
		this.setNumber(inputNumber);
	}
	
	@Override
	public String printNumber() {
		String numberValue = numberLookup.get(Integer.toString(number));
		return numberValue;
	}

	private void setNumber(int inputNumber) {
		if(inputNumber > 9) {
			this.number = super.getMyPlaces(inputNumber, 1);
		} else {
			this.number = inputNumber;
		}
	}
}