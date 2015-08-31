import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Class that contains the method for the visual objects.
 * @author Harry
 *
 */
public class Visuals extends JPanel {
	/**
	 * Paints all the objects in the frame.
	 */
	public void paintComponent(Graphics g) {
		
	    //Velocity Wheel
		Circles velocityWheel = new Circles(425, 150, 200);
	    g.setColor(Color.WHITE);
	    g.fillOval(velocityWheel.getPosX(),
	    		   velocityWheel.getPosY(),
	    		   velocityWheel.getDiameter(),
	    		   velocityWheel.getDiameter());
	    
	    g.setColor(Color.black);
	    g.drawOval(velocityWheel.getPosX(),
	    		   velocityWheel.getPosY(),
	    		   velocityWheel.getDiameter(),
	    		   velocityWheel.getDiameter());

	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 0.79),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() +
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 0.79));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 1.58),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 1.58));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 2.37),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 2.37));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 3.16),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 3.16));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 3.95),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 3.95));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 4.74),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 4.74));
	    
	    g.drawLine(velocityWheel.getPosX() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius(),
	    		   velocityWheel.getPosX() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateX(100, MainClass.angleRad1 + 5.53),
	    		   velocityWheel.getPosY() + velocityWheel.getRadius() + 
	    		   velocityWheel.calculateY(100, MainClass.angleRad1 + 5.53));
	        
	    g.fillOval(velocityWheel.getPosX() + velocityWheel.getRadius() - 15 + 
	    		velocityWheel.calculateX(100, MainClass.angleRad1 + 4.74),
	    		velocityWheel.getPosY() + velocityWheel.getRadius() - 15 + 
	    		velocityWheel.calculateY(100, MainClass.angleRad1 + 4.74), 30, 30);
	    
	    //Speedometer
	    Circles speedometer = new Circles(100, 150, 200);
	    g.drawOval(speedometer.getPosX(),
	    		   speedometer.getPosY(),
	    		   speedometer.getDiameter(),
	    		   speedometer.getDiameter());
	    
	    g.drawLine(speedometer.getPosX(),
	    		   speedometer.getPosY() + speedometer.getRadius(),
	    		   speedometer.getPosX() + speedometer.getDiameter(),
	    		   speedometer.getPosY() + speedometer.getRadius());
	    
	    g.drawLine(speedometer.getPosX() + speedometer.getRadius(),
	    		   speedometer.getPosY(),
	    		   speedometer.getPosX() + speedometer.getRadius(),
	    		   speedometer.getPosY() + speedometer.getDiameter());
	    
	    g.drawLine(speedometer.getPosX() + 30,
	    		   speedometer.getPosY() + 30,
	    		   speedometer.getPosX() + speedometer.getRadius() + 70,
	    		   speedometer.getPosY() + speedometer.getRadius() + 70);
	    
	    g.drawLine(speedometer.getPosX() + 30,
	    		   speedometer.getPosY() + speedometer.getRadius() + 70,
	    		   speedometer.getPosX() + speedometer.getRadius() + 70,
	    		   speedometer.getPosY() + 30);
	    
	    g.setColor(Color.WHITE);
	    g.fillOval(speedometer.getPosX() + 10,
	    		   speedometer.getPosY() + 10,
	    		   speedometer.getDiameter() - 20,
	    		   speedometer.getDiameter() - 20);
	    
	    g.setColor(Color.black);
	    g.drawLine(speedometer.getPosX() + speedometer.getRadius(),
	    		   speedometer.getPosY() + speedometer.getRadius(),
	    		   speedometer.getPosX() + speedometer.getRadius() + 
	    		   speedometer.calculateX(70,MainClass.angleRad2),
	    		   speedometer.getPosY() + speedometer.getRadius() + 
	    		   speedometer.calculateY(70,MainClass.angleRad2));
	    
	    speedometer.setTriangleX(0,speedometer.getPosX() + speedometer.getRadius(), 60, MainClass.angleRad2 - 0.05);
	    speedometer.setTriangleX(1,speedometer.getPosX() + speedometer.getRadius(), 70, MainClass.angleRad2);
	    speedometer.setTriangleX(2,speedometer.getPosX() + speedometer.getRadius(), 60, MainClass.angleRad2 + 0.05);
	    
	    speedometer.setTriangleY(0, speedometer.getPosY() + speedometer.getRadius(), 60, MainClass.angleRad2 - 0.05);
	    speedometer.setTriangleY(1, speedometer.getPosY() + speedometer.getRadius(), 70, MainClass.angleRad2);
	    speedometer.setTriangleY(2, speedometer.getPosY() + speedometer.getRadius(), 60, MainClass.angleRad2 + 0.05);
	    
	  	g.fillPolygon(speedometer.getTriangleX(), speedometer.getTriangleY(), 3); 
	  	
	    //Revolution Counter
	  	RevolutionsCounter revCount = new RevolutionsCounter(260, 90, 250, 55, MainClass.counter);
	  	revCount.formarStr();
	    for(int i = 0; i < 245; i+=36){
	    	g.drawRect(revCount.getRectX() + i, revCount.getRectY(), 36, 50);
	    }
	    g.setFont(new Font("Calibri", Font.BOLD, 30));
	    g.drawString(revCount.getStrResult(), revCount.getStrX(), revCount.getStrY());
	    
	    //Velocity Controller
	    g.fillRect(MainClass.centerX, MainClass.centerY + 235, 25, 25);
	    g.fillRect(MainClass.centerX + 150, MainClass.centerY + 235, 25, 25);
	    
	    //Fuel Tank Rectangles
	  	g.setColor(Color.BLACK);
	    g.drawRect(700, 75, 55, 441);
	    g.setColor(Color.PINK);
	    g.fillRect(701, 76, 54, 440);
	    g.setColor(Color.WHITE);
	    g.fillRect(701, 76, 54, MainClass.fuelY);
	   
	    //Fill Tank Button
	    g.setColor(Color.BLACK);
	    g.fillRect(MainClass.centerX, MainClass.centerY + 325, 25, 25);
	    
	    //Fuel Meter
	    g.drawRect(MainClass.centerX - 335, MainClass.centerY + 225, 220, 35);
	    for(int i=0, j = 335; i < 22; i++, j-=10){
	    	g.drawLine(MainClass.centerX - j, MainClass.centerY + 235,MainClass.centerX - j, MainClass.centerY + 253);
	    	if(i%6==0 && i != 0){
	    		g.drawLine(MainClass.centerX - j - 11, MainClass.centerY + 235,MainClass.centerX - j - 11, MainClass.centerY + 253);
	    	}
	    }
	  	g.setColor(Color.GRAY);
	  	g.fillRect(MainClass.centerX - 335, MainClass.centerY + 240,MainClass.fuelLength,9);
	  	g.setColor(Color.WHITE);
	  	g.drawRect(MainClass.centerX - 334, MainClass.centerY + 240,MainClass.fuelLength,9);
	    
	  	//Borders
	  	g.setColor(Color.BLACK);
	  	for(int i = 0, j = 50; i < 32; i++, j += 20){
	  		g.fillRect(j, MainClass.centerY - 120, 6, 6);
	  	}
	  	for(int i = 0, j = 30; i < 25; i++, j += 20){
	  		g.fillRect(50, j, 6, 6);
	  	}
	  	for(int i = 0, j = 50; i < 32; i++, j += 20){
	  		g.fillRect(j, MainClass.centerY + 360, 6, 6);
	  	}
	  	for(int i = 0, j = 30; i < 25; i++, j += 20){
	  		g.fillRect(670, j, 6, 6);
	  	}
	  	
	  	g.fillRect(670, 490, 30, 26);
	  	
	    //Texts
	    g.setColor(Color.BLACK);
	    g.setFont(new Font("Calibri", Font.BOLD, 20));
	    g.drawString("F", 765, 220);
	    g.drawString("u", 765, 240);
	    g.drawString("e", 765, 260);
	    g.drawString("l", 768, 280);
	    g.drawString("T", 765, 320);
	    g.drawString("a", 765, 340);
	    g.drawString("n", 765, 360);
	    g.drawString("k", 765, 380);
	    g.setFont(new Font("Calibri", Font.BOLD, 14));
	    g.drawString("Revolutions Counter", revCount.getLabelX(), revCount.getLabelY());
	    g.drawString("S", MainClass.centerX - 340, MainClass.centerY + 25);
	    g.drawString("P", MainClass.centerX - 340, MainClass.centerY + 40);
	    g.drawString("E", MainClass.centerX - 340, MainClass.centerY + 55);
	    g.drawString("E", MainClass.centerX - 340, MainClass.centerY + 70);
	    g.drawString("D", MainClass.centerX - 340, MainClass.centerY + 85);
	    g.drawString("O", MainClass.centerX - 340, MainClass.centerY + 100);
	    g.drawString("M", MainClass.centerX - 340, MainClass.centerY + 115);
	    g.drawString("E", MainClass.centerX - 340, MainClass.centerY + 130);
	    g.drawString("T", MainClass.centerX - 340, MainClass.centerY + 145);
	    g.drawString("E", MainClass.centerX - 340, MainClass.centerY + 160);
	    g.drawString("R", MainClass.centerX - 340, MainClass.centerY + 175);
	    g.drawString("W", MainClass.centerX + 225, MainClass.centerY + 65);
	    g.drawString("H", MainClass.centerX + 225, MainClass.centerY + 80);
	    g.drawString("E", MainClass.centerX + 225, MainClass.centerY + 95);
	    g.drawString("E", MainClass.centerX + 225, MainClass.centerY + 110);
	    g.drawString("L", MainClass.centerX + 225, MainClass.centerY + 125);
	    g.drawString("E",90,MainClass.centerY + 275);
	  	g.drawString("Fuel Meter",168,MainClass.centerY + 275);
	  	g.drawString("F", 295, MainClass.centerY + 275);
	  	g.drawString("rpm", MainClass.centerX - 235, MainClass.centerY + 180);
	  	g.drawString("0", MainClass.centerX - 285, MainClass.centerY + 160);
	  	g.drawString("10", MainClass.centerX - 310, MainClass.centerY + 105);
	  	g.drawString("20", MainClass.centerX - 288, MainClass.centerY + 50);
	  	g.drawString("30", MainClass.centerX - 232, MainClass.centerY + 25);
	  	g.drawString("40", MainClass.centerX - 175, MainClass.centerY + 50);
	  	g.drawString("50", MainClass.centerX - 153, MainClass.centerY + 105);
	  	g.drawString("60", MainClass.centerX - 177, MainClass.centerY + 160);
	  	g.setFont(new Font("Calibri", Font.BOLD, 10));
	  	g.drawString("Press to",MainClass.centerX+30, MainClass.centerY + 335);
	  	g.drawString("Add Gas",MainClass.centerX+30, MainClass.centerY + 345);
	  	g.drawString("Press to",MainClass.centerX+30, MainClass.centerY + 245);
	  	g.drawString("Speed Up",MainClass.centerX+30, MainClass.centerY + 255);
	  	g.drawString("Press to",MainClass.centerX+180, MainClass.centerY + 245);
	  	g.drawString("Speed Down",MainClass.centerX+180, MainClass.centerY + 255);
	}
}
