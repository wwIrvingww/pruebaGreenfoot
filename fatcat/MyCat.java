import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        boolean cansado=isSleepy();
        if(cansado==true){
            sleep(2); 
            shoutHooray();
        }
        else{
            shoutHooray();
        }
        boolean bored=isBored();
        if (bored==true){
            dance();
        }
        boolean hungry=isHungry();
        if (hungry=true){
            eat();            
        }
        boolean alone=isAlone();
        if (alone=true){
            sleep(5);
        }
        else{
            shoutHooray();    
        }
    }   
    
}
