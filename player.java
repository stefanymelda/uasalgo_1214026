import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("l"))
                setLocation(getX() -5, getY());
            if(Greenfoot.isKeyDown("r"))
                setLocation(getX() +5, getY());    
            if(Greenfoot.isKeyDown("up"))
                setLocation(getX(), getY() -5);
            if(Greenfoot.isKeyDown("d"))
                setLocation(getX(), getY() +5);// Add your action code here.
    }
}
