package PokemonBuildingblocks;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;

    public Pokemon(String name, int hp, String food, String sound) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public void eats(){
        System.out.println("I am eating: " + food);
    }

    public void speaks(){
        System.out.println("");
        for (int i=0;i<3;i++) {
            System.out.print(sound);
        }
    }

    public abstract void specialMove(Pokemon enemy);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp(int level) {
        if (level<3){
        this.level++;}
        else {
            System.out.println("Your pokemon is already level 3");
        }
    }

    public void attack(Pokemon enemy, int damage, String nameAttack){
        speaks();
        System.out.println("I do the attack: " + nameAttack);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("The level of " + enemy.getName() + " is now: " + enemy.getHp());
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
