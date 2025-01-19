package adventureGame;

public class Archer extends Player {
    private int id;
    private String name;
    private int damage;
    private int health;
    private double money;

    public Archer(int id, String name, int damage, int health, double money, int id1, String name1, int damage1, int health1, double money1) {
        super(id, name, damage, health, money);
        this.id = id1;
        this.name = name1;
        this.damage = damage1;
        this.health = health1;
        this.money = money1;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public double getMoney() {
        return money;
    }

    @Override
    public void setMoney(double money) {
        this.money = money;
    }
}

