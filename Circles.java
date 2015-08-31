/**
 * Uses similar properties to create circular objects.
 * @author Harry
 *
 */
public class Circles {
	private int posX;
	private int posY;
	private int diameter;
	private int radius;
	private int[] x;
	private int[] y;
	
	/**
	 * Initializes the instance variables.
	 * @param posX - position on X
	 * @param posY - position on Y
	 * @param diameter - Diameter of the circle
	 */
	public Circles(int posX, int posY, int diameter){
		this.posX = posX;
		this.posY = posY;
		this.diameter = diameter;
		this.radius = diameter/2;
		this.x = new int[3];
		this.y = new int[3];
	}
	/**
	 * Gets the radius
	 * @return radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Gets the position on X
	 * @return position on X
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * Gets the position on Y
	 * @return position on Y
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * Gets the diameter
	 * @return diameter
	 */
	public int getDiameter() {
		return diameter;
	}
	
	/**
	 * Calculates the X's position using a angle in radians and a length.
	 * @param length length of the line.
	 * @param angleRad angle in radians in which the line turns.
	 * @return
	 */
	public int calculateX(int length, double angleRad){
		return (int) (length * Math.cos(angleRad));
	}
	
	/**
	 * Calculates the Y's position using a angle in radians and a length.
	 * @param length length of the line.
	 * @param angleRad angle in radians in which the line turns.
	 * @return
	 */
	public int calculateY(int length, double angleRad){
		return (int) (length * Math.sin(angleRad));
	}
	
	/**
	 * Sets the X's coordinates for the triangle.
	 * @param index which point is.
	 * @param pos position of the point.
	 * @param length length of the line.
	 * @param angleRad angle in radians in which the line turns.
	 */
	public void setTriangleX(int index, int pos, int length, double angleRad){
		x[index] = pos + (int) (length * Math.cos(angleRad));
	}
	
	/**
	 * Sets the Y's coordinates for the triangle.
	 * @param index which point is.
	 * @param pos position of the point.
	 * @param length length of the line.
	 * @param angleRad angle in radians in which the line turns.
	 */
	public void setTriangleY(int index, int pos, int length, double angleRad){
		y[index] = pos + (int) (length * Math.sin(angleRad));
	}
	
	/**
	 * Gets the X array for the triangle. 
	 * @return X's positions for the triangle.
	 */
	public int[] getTriangleX(){
		return x;
	}
	
	/**
	 * Gets the Y array for the triangle. 
	 * @return Y's positions for the triangle.
	 */
	public int[] getTriangleY(){
		return y;
	}
}
