import java.util.concurrent.ThreadLocalRandom;

public class Board{
    Cell[][] cells;

    Board(int size,int snake,int ladder) {
        initializeBoard(size);
        addSnakeAndLadder(snake,ladder,cells);
    }

    public void initializeBoard(int size) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell=new Cell();
                cells[i][j]=cell;
            }
        }
    }

    public void addSnakeAndLadder(int snake,int ladder,Cell[][] cells){
        while(snake>0){
            int snakeHead= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail= ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(snakeHead>snakeTail){
                continue;
            }
            Jump snakeObj=new Jump();
            snakeObj.start=snakeHead;
            snakeObj.end=snakeTail;

            Cell cell=getCell(snakeHead);
            cell.jump=snakeObj;

            snake--;
        }

        while(ladder > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            ladder--;
        }
    }

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }

}
