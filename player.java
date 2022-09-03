
public class player {
    Circle player;
    double mana;
    double health;
    int speed;

    public player(){
        this.player = new Circle(1,1,1);
        this.mana = 10;
        this.health = 10;
        this.speed = 1;
    }

    public Circle getplayer() {
        return this.player;
    }

    public boolean canCastSpell(Spell spell){
        if (this.mana-spell.manacost < 0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isDead(int damage){
        if (this.health - damage < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void moveplayer(int xlocation, int ylocation){
        this.player.xlocation+=xlocation;
        this.player.ylocation+=ylocation;
    }

}
