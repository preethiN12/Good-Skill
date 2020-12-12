package Entity;
import TileMap.*;
// keeping abstract
public abstract class Beverage extends MapObject{
    // reorganize vars later, put in MapObject class
    /*
    protected int health;
    protected int maxHealth;
    protected boolean dead;
    protected int damage; //on contact, player runs into enemy
    protected boolean flinching;
    protected long flinchTimer;

*/

    protected boolean pickedUp;
    protected int health;

    public Beverage (TileMap tm){
        super(tm);
        pickedUp = false;
        health = 1;
    }



   public boolean getPickedUp() {
       return pickedUp;
   }
   public int getHealth() {
       return health;
   }

    /*

       public boolean getDead() {
           return dead;
       }

       public int getDamage() {
           return damage;
       }
       // this method is called when the enemy is hit by the player
       public void hit (int damage){
           if(dead||flinching) return;
           health -= damage;
           if(health < 0) health = 0;
           if(health == 0) dead = true;
           flinching = true;
           flinchTimer = System.nanoTime();
       }
       */
    public void update(){

    }
}
