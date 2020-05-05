package board;

import character.Human;
import character.Infected;

import java.util.ArrayList;
import java.util.List;

// objects of this class are meant to be created by class SimpleBoardCreator
public class SimpleBoard implements IBoardStatics {


    private Grid grid;
    private List<Human> listOfHuman;
    private List<Infected> listOfInfected;
    private int numberOfAllies;
    private int numberOfEnemies;

    public SimpleBoard(){
        this(0,0);
    }

    public SimpleBoard(int numberOfNewAllies, int numberOfNewEnemies){
        this.numberOfAllies = numberOfNewAllies;
        this.numberOfEnemies = numberOfNewEnemies;
        listOfHuman = new ArrayList<>(10);
        listOfInfected = new ArrayList<>(10);
        grid = new Grid(numberOfNewAllies, numberOfNewEnemies, listOfHuman, listOfInfected);
    }

    //this method adds a Human to a random Tile on board
    public void addHuman(Human human){

        grid.addHuman(human, numberOfAllies,listOfHuman);
        numberOfAllies++;
    }

    //this method adds an Infected to a random tile on board
    public void addInfected(Infected infected){

        grid.addInfected(infected, numberOfEnemies,listOfInfected);
        numberOfEnemies++;

    }

    public void setTileToHuman(int x, int y, Human human){
        grid.setTileToHuman(x,y,human);
    }
    public void setTileToInfected(int x, int y, Infected infected){
        grid.setTileToInfected(x,y,infected);
    }

    public boolean isTileFree(int x, int y){
        return grid.isTileFree(x,y);
    }

    public boolean isTileHumanFree(int x, int y){
        return grid.isTileHumanFree(x,y);
    }

    public boolean isTileInfectedFree(int x, int y){
        return grid.isTileInfectedFree(x,y);
    }


    public void findClosestEnemy() {
        //not done

    }

    public boolean isSimulationOver(){
        return true;
        //not done
    }

    public List<Human> getListOfHuman() {
        return listOfHuman;
    }

    public List<Infected> getListOfInfected() {
        return listOfInfected;
    }
}





//        grid = new Tile[IBoardStatics.HEIGHT][IBoardStatics.WIDTH];
//        grid.initGrid(numberOfAllies,numberOfEnemies);


//    private void initGrid(int numberOfAllies, int numberOfEnemies){
//
//        for (int i = 0; i < IBoardStatics.HEIGHT; i++) {
//            for (int j = 0; j < IBoardStatics.WIDTH; j++) {
//                grid[i][j] = new Tile();
//            }
//        }
//
//        while(numberOfAllies<numberOfAllies){
//            this.addHuman(new Human());
//        }
//
//        while(this.numberOfEnemies<numberOfEnemies) {
//            this.addInfected(new Infected());
//        }
//
//    }

//        Random rand = new Random();
//        int temporary = numberOfAllies + 1;
//        while(numberOfAllies < temporary){
//            int x = rand.nextInt(IBoardStatics.HEIGHT);
//            int y = rand.nextInt(IBoardStatics.WIDTH);
//            if(grid[x][y].isHumanFree()) {
//                grid[x][y].setHuman(human);
//                human.setPosition(x, y);

//
//    public Tile[][] getReferenceToGrid(){
//        return grid;
//    }


//    public void addCharacterable(Characterable characterable){
//
//        Random rand = new Random();
//
//        if(characterable instanceof Human) {
//            int temporary = numberOfAllies + 1;
//            while(numberOfAllies < temporary){
//                int x = rand.nextInt(HEIGHT);
//                int y = rand.nextInt(WIDTH);
//                if (grid[x][y].isFree()) {
//                    grid[x][y].setCharacterable(characterable);
//                    numberOfAllies++;
//                }
//            }
//        }
//        else if (characterable instanceof Infected){
//            int temporary = numberOfEnemies + 1;
//            while(numberOfEnemies<temporary){
//                int x = rand.nextInt(HEIGHT);
//                int y = rand.nextInt(WIDTH);
//                if (grid[x][y].isFree()) {
//                    grid[x][y].setCharacterable(characterable);
//                    numberOfEnemies++;
//                }
//            }
//        }
//        else{
//            throw new ClassNotPreparedException();
//        }
//