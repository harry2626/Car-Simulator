/**
 * Class used to construct the revolutions counter.
 * @author Harry
 *
 */
public class RevolutionsCounter {

	private String strCounter;
	private String strFormatted;
	private String strResult;
	private int counter;
	private int strX;
	private int strY;
	private int rectX;
	private int rectY;
	private int labelX;
	private int labelY;
	
	/**
	 * Initializes the instance variables.
	 * @param x1 x position of the string number.
	 * @param y1 y position of the string number.
	 * @param x2 x position of the leftmost rectangle.
	 * @param y2 y position of the leftmost rectangle.
	 * @param counter counts the number of revolutions.
	 */
	public RevolutionsCounter(int x1, int y1, int x2, int y2, int counter){
		this.counter = counter;
		strCounter = String.valueOf("" + counter);
		strFormatted = ("0000000" + strCounter).substring(strCounter.length());
		strResult = "";
		strX = x1;
		strY = y1;
		rectX = x2;
		rectY = y2;
		labelX = x2 + 60;
		labelY = y2 + 75;
	} 
	
	/**
	 * Gets the resultant string.
	 * @return resultant string
	 */
	public String getStrResult() {
		return strResult;
	}

	/**
	 * Gets the x position for the label.
	 * @return x position for the label.
	 */
	public int getLabelX() {
		return labelX;
	}

	/**
	 * Gets the y position for the label.
	 * @return y position for the label.
	 */
	public int getLabelY() {
		return labelY;
	}

	/**
	 * Gets the x position for the string.
	 * @return x position for the string.
	 */
	public int getStrX() {
		return strX;
	}

	/**
	 * Gets the y position for the string.
	 * @return y position for the string.
	 */
	public int getStrY() {
		return strY;
	}

	/**
	 * Gets the x position for the rectangle.
	 * @return x position for the rectangle.
	 */
	public int getRectX() {
		return rectX;
	}

	/**
	 * Gets the y position for the rectangle.
	 * @return y position for the rectangle.
	 */
	public int getRectY() {
		return rectY;
	}
	
	/**
	 * Formats the string and adds spaces between.
	 */
	public void formarStr(){
		strCounter = String.valueOf("" + counter);
		strFormatted = ("0000000" + strCounter).substring(strCounter.length());
		for(int i = 0; i < strFormatted.length(); i++){
			strResult += strFormatted.charAt(i) + "   ";
		}
	}

	
}
