package Task_4;

public class Controller {
        public static void run(){
            int height = 30;
            int width = 60;
            int[] size = {height, width};
            Homework_4 currentGame = new Homework_4();
            int[][] map = currentGame.createMap(size);
            currentGame.fillMap(map);
            currentGame.searchWay(map);
            Visual_out.drawMap(map);
        }
    }

