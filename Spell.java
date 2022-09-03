public abstract class Spell {
    int damage;
    int duration;
    Circle body;
    int manacost;

    public Spell(int damage, int duration, Circle body, int mana){
        this.damage = damage;
        this.duration = duration;
        this.body = body;
        this.manacost = manacost;
    }

}
