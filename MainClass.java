import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * Main class of the project.
 * @author Harry
 *
 */
public class MainClass implements MouseListener{
    JFrame frame;
    public static int centerX = 425, centerY = 150;
    public static int fuelX=0, fuelY=440, fuelCapacity = 440, fuelLength = 0,x,y;
    public static double angleDeg1 = 0, angleDeg2 = 135;
    public static double gasCondition=0, speedControl = 0;
    public static double angleRad1, angleRad2 = angleDeg2 * Math.PI / 180;
    public static int counter = 0;
	
    /**
     * Main method
     * @param args not used
     */ 
    public static void main(String[] args) {
    	new MainClass().frame();
	}
    
    /**
     * Creates the frame for the program and sets the properties.
     */
    private void frame() {
    	frame = new JFrame("Car Simulation");
    	Visuals components = new Visuals();
		
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, components);
		frame.setResizable(false);
		frame.setSize(800, 600);
	    frame.setLocation(265, 60);
		frame.setVisible(true);
		frame.addMouseListener(this);
		update();
    }
    
    /**
     * Updates the program components creating animation.
     */
    private void update() {
    	while (true) {
    		counter = (int) (angleDeg1 / 360);
    		gasCondition++;
    		
    		if(fuelY == 440){
    			speedControl = 0;
    		}
    		
    		if(fuelY == 440){
    			angleDeg2=135;
    			angleRad2 = angleDeg2 * Math.PI / 180;
    		}
    		
    		else if(angleDeg2 >= 135 && angleDeg2 <= 405){
    			angleRad2 = angleDeg2 * Math.PI / 180;
    		}
    		
    		if(angleDeg2 != 135 && fuelY >= 0 && fuelY < 440){
	    		angleDeg1+=speedControl;
		    	angleRad1 = angleDeg1 * Math.PI / 180;
		    	x = (int) (100 * Math.cos(angleRad1));
		    	y = (int) (100 * Math.sin(angleRad1));
    		}
    		
    	    if(fuelY < 440 && angleDeg2 != 135 && gasCondition % 250 == 0){
    	    	fuelY+=44;
    	    }
    	    
    	    if(fuelLength > 0 && angleDeg2 != 135 && gasCondition % 250 == 0){
    	    	fuelLength-=22;
    	    }
    	    
	    	frame.repaint();
	    	try {
	    		Thread.sleep(50);
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}
    	}
    }    

    /**
     * Method that is activated when the user clicks the screen.
     */
    public void mouseClicked(MouseEvent e) {
    	
    	//Add gas button.
	    if(e.getX()>= centerX && e.getX() <= centerX + 25){
			if(e.getY()>= centerY + 350 && e.getY() <= centerY + 375){
				if(fuelY > 0 && angleDeg2 == 135){
					if(fuelY < 44){
						fuelY -= 44 - fuelY;
					}
					else{
						fuelY-=44;
					}
				}
				if(fuelLength < 220 && angleDeg2 == 135){
					if(fuelLength > 176){
						fuelLength += 220 - fuelLength;
					}
					else{
						fuelLength+=22;
					}
				}
			}
			//Speed up button.
			if(e.getY()>= centerY + 260 && e.getY() <= centerY + 285){
				if(fuelY >= 0 && fuelY < 440){
					if(!(angleDeg2 >= 405)){
						speedControl += 0.6;
						angleDeg2 += 9;
					}
				}
	    	}
		}
	    
	    //Speed down button.
	    else if(e.getX()>= centerX + 150 && e.getX() <= centerX + 175){
	    	if(e.getY()>= centerY + 260 && e.getY() <= centerY + 285){
	    		if(fuelY >= 0 && fuelY < 440){
	    			if(!(angleDeg2 <= 135)){
		    			speedControl -= 0.6;
			    		angleDeg2 -= 9;
	    			}
	    		}
	    	}
	    }
    }

    /**
     * Not used
     */
    public void mouseEntered(MouseEvent e) {
		       
	}
	
    /**
     * Not used
     */
    public void mouseExited(MouseEvent e) {
		        
	}
	
    /**
     * Not used
     */
	public void mousePressed(MouseEvent e) {
		
	}
	
	/**
     * Not used
     */
	public void mouseReleased(MouseEvent e) {
		       
	}
}


