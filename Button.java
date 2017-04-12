import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private GreenfootImage buttonImage1 = new GreenfootImage(100,50);
    private GreenfootImage buttonImage2 = new GreenfootImage(100,50);
     
    int value;
    boolean justClicked = false;     
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        HealthBar bar = getWorld().getObjects(HealthBar.class).get(0);
        
        if(Greenfoot.mousePressed( this ))
        {
           setImage(buttonImage2);            
           justClicked = true;
        }
        if(Greenfoot.mouseClicked( this ))
        {
            setImage(buttonImage1);
            
            if(justClicked = true)
            {
               bar.add(value);
               justClicked = false;
            }
        }
    }  
    
    /**
     * Button is the constructor for the subclass button
     * @Param there are no parameters
     * @Return nothing is returned
     */
    public Button()
    {
       GreenfootImage text1 = new GreenfootImage(100,50); 
       GreenfootImage text2 = new GreenfootImage(100,50); 
       
       value = 50;
       
       buttonImage1.setColor(Color.BLUE);
       buttonImage1.fillRect(0,0,100,50);
       
       text1.setColor(Color.WHITE);       
       text1.setFont( new Font("Helvetica",Font.BOLD,30) );
       text1.drawString(""+value,text1.getWidth()/3+1,text1.getHeight()/2+8);
       
       buttonImage1.drawImage(text1,0,0);
       
       buttonImage2.setColor(Color.BLUE);
       buttonImage2.fillRect(0,0,100,50);
       
       text2.setColor(Color.BLACK);       
       text2.setFont( new Font("Helvetica",Font.BOLD,30) );
       text2.drawString(""+value,text2.getWidth()/3+1,text2.getHeight()/2+8);
       
       buttonImage2.drawImage(text2,0,0);
       
       setImage(buttonImage1);
    }
    
    /**
     * Button is the constructor class for the subclass button
     * @Param the parameters are color noClick and click and the integer v 
     * @Return nothing is returned
     */
    public Button(Color noClick, Color click, int v)
    {
       GreenfootImage text1 = new GreenfootImage(100,50); 
       GreenfootImage text2 = new GreenfootImage(100,50); 
       
       value = v;
       
       buttonImage1.setColor(noClick);
       buttonImage1.fillRect(0,0,100,50);
       
       text1.setColor(Color.WHITE);       
       text1.setFont( new Font("Helvetica",Font.BOLD,30) );
       text1.drawString(""+value,text1.getWidth()/3+1,text1.getHeight()/2+8);
       
       buttonImage1.drawImage(text1,0,0);
       
       buttonImage2.setColor(click);
       buttonImage2.fillRect(0,0,100,50);
       
       text2.setColor(Color.BLACK);       
       text2.setFont( new Font("Helvetica",Font.BOLD,30) );
       text2.drawString(""+value,text2.getWidth()/3+1,text2.getHeight()/2+8);
       
       buttonImage2.drawImage(text2,0,0);
       
       setImage(buttonImage1);
    }
}
