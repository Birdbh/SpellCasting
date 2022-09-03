import java.util.ArrayList;

public class Enemies {
    int health;
    Circle body;
    ArrayList<Enemies> enemieList = new ArrayList();

    public Enemies (int health, Circle body){
        this.health = health;
        this.body = body;
        enemieList.add(this);
    }

    public void enemieCollided(Enemies enemie){
        enemieList.remove(enemie);
    }

}
