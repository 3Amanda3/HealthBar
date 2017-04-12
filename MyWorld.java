import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 3
 * April 11th
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,299,186);
        Button button = new Button(Color.BLUE,Color.GREEN,50);
        addObject(button,483,287);
        Button button2 = new Button(Color.RED,Color.GREEN,-25);
        addObject(button2,151,286);
    }
}
