public abstract class Character implements Characterable {

    private double healthPoints, attackDamage;
    private boolean isInfected, isAlive;
    private int viewRange = 1;
    private int x;
    private int y;

    Character()
    {
        healthPoints = 100;
        attackDamage = 20;
        isInfected = false;
        isAlive = true;
        viewRange = 1;
    }

    Character(double healthPoints, double attackDamage, int viewRange, boolean isInfected)
    {
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.isInfected = isInfected;
        this.viewRange = viewRange;
        isAlive = true;
    }

    @Override
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }
    @Override
    public double getHealPoints() {
        return healthPoints;
    }

    @Override
    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public double getAttackDamage() {
        return attackDamage;
    }

    @Override
    public void setIsInfected(boolean isInfected) {
        this.isInfected = isInfected;
    }

    @Override
    public boolean getIsInfected() {
        return isInfected;
    }

    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getXCoordinate() {
        return x;
    }
    @Override
    public int getYCoordinate() {
        return y;
    }

    @Override
    public void moveX(int x) {
         this.x+=x;
    }
    @Override
    public void moveY(int y) {
         this.y+=y;
    }

    @Override
    public void setViewRange(int viewRange) {
        this.viewRange = viewRange;
    }

    @Override
    public int getViewRange() {
        return viewRange;
    }

    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    public boolean getIsAlive()
    {
        isAlive = healthPoints > 0;
        return isAlive;
    }

    @Override
    public boolean isInTheSameLocation(Character character2) {
        return x == character2.getXCoordinate() && y == character2.getYCoordinate();
    }





}
