interface Survivor{
    void escape();
    void hide();
}
abstract class Character{
    abstract void attack();
    void defend(){
        System.out.println("Character defends!");
    }
}
class Hero extends Character implements Survivor{
     @Override
     void attack() {
         System.out.println("Hero attacks with sword.");
     }
    @Override
    public void escape(){
         System.out.println("Hero escapes using grappling hook.");
    }
    @Override
    public void hide(){
        System.out.println("Hero hides behind the shield.");
     }
    @Override
    public void defend(){
         System.out.println("Hero defends!");
    }

}
public class Game {
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.attack();
        hero.escape();
        hero.hide();
        hero.defend();
    }
}
