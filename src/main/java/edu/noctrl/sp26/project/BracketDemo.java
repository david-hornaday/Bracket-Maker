package edu.noctrl.sp26.project;

// to execute

// mvnw clean compile exec:java -Dexec.mainClass=edu.noctrl.sp26.project.BracketDemo

public class BracketDemo {

    // add teams to bracket
    public static void addTeams(TeamTreeArray array, TeamList list) {
        Team[] tarray = array.getArray();
        if (array.length() >= 15) {
            tarray[15] = list.get(0);
            tarray[16] = list.get(15);
            tarray[17] = list.get(7);
            tarray[18] = list.get(8);
            tarray[19] = list.get(3);
            tarray[20] = list.get(12);
            tarray[21] = list.get(4);
            tarray[22] = list.get(11);
            tarray[23] = list.get(1);
            tarray[24] = list.get(14);
            tarray[25] = list.get(6);
            tarray[26] = list.get(9);
            tarray[27] = list.get(2);
            tarray[28] = list.get(13);
            tarray[29] = list.get(5);
            tarray[30] = list.get(10);

        } else {
            if (array.length() >= 8) {
                tarray[7] = list.get(0);
                tarray[8] = list.get(7);
                tarray[9] = list.get(3);
                tarray[10] = list.get(4);
                tarray[11] = list.get(1);
                tarray[12] = list.get(6);
                tarray[13] = list.get(2);
                tarray[14] = list.get(5);
            } else {
                if (array.length() >= 4) {
                    tarray[3] = list.get(0);
                    tarray[4] = list.get(3);
                    tarray[5] = list.get(1);
                    tarray[6] = list.get(2);
                }
            }
        }

        array.setArray(tarray);

    }

    // create an array queue
    public static GameQueue createQueue(GameQueue queue, TeamTreeArray array) {
        Team[] bracket = array.getArray();
        Team blank = new Team("(_____)", 0);
        for (int i = 14; i >= 0; i--) {
            Team left = bracket[2 * i + 1];
            Team right = bracket[2 * i + 2];

            if (!(left.getName().equals(right.getName())) && !(right.getName().equals("(_____)"))) {
                Game game = new Game(left, right);
                queue.enqueue(game);
                }
        }


        return queue;
    }



    // sim round or sim game
    public static void simGame(TeamTreeArray array, GameQueue queue) {
        Team[] bracket = array.getArray();
        for (int i = 14; i >= 0; i--) {
            Team left = bracket[2 * i + 1];
            Team right = bracket[2 * i + 2];

            if (left.getRating() >= right.getRating()) {
                bracket[i] = left;
            } else {
                bracket[i] = right;
            }

            
        }
        array.setArray(bracket);
    }

    public static void main(String[] args) {
        // Create Lists
        TeamList teamList = new TeamList(16);

        // Create teams
        Team celtics = new Team("Celtics", 94);
        Team nuggets = new Team("Nuggets", 93);
        Team bucks = new Team("Bucks", 92);
        Team thunder = new Team("Thunder", 92);
        Team timberwolves = new Team("Timberwolves", 91);

        Team suns = new Team("Suns", 89);
        Team warriors = new Team("Warriors", 88);
        Team lakers = new Team("Lakers", 88);
        Team sixers = new Team("76ers", 88);
        Team mavericks = new Team("Mavericks", 89);

        Team cavaliers = new Team("Cavaliers", 87);
        Team knicks = new Team("Knicks", 87);
        Team kings = new Team("Kings", 87);
        Team pelicans = new Team("Pelicans", 86);
        Team heat = new Team("Heat", 86);
        Team clippers = new Team("Clippers", 86);

        Team pacers = new Team("Pacers", 85);
        Team magic = new Team("Magic", 85);
        Team grizzlies = new Team("Grizzlies", 84);
        Team hawks = new Team("Hawks", 84);
        Team bulls = new Team("Bulls", 83);

        Team raptors = new Team("Raptors", 82);
        Team jazz = new Team("Jazz", 82);
        Team rockets = new Team("Rockets", 83);
        Team nets = new Team("Nets", 81);

        Team spurs = new Team("Spurs", 84);
        Team hornets = new Team("Hornets", 80);
        Team pistons = new Team("Pistons", 79);
        Team wizards = new Team("Wizards", 78);
        Team trailblazers = new Team("Trail Blazers", 80);

        // Add teams
        teamList.add(celtics);
        teamList.add(nuggets);
        teamList.add(bucks);
        teamList.add(thunder);
        teamList.add(timberwolves);

        teamList.add(suns);
        teamList.add(warriors);
        teamList.add(lakers);
        teamList.add(sixers);
        teamList.add(mavericks);

        teamList.add(cavaliers);
        teamList.add(knicks);
        teamList.add(kings);
        teamList.add(pelicans);
        teamList.add(heat);
        teamList.add(clippers);
        // System.out.println(teamList.printList());

        teamList.sort();

        System.out.println(teamList.printList());

        TeamTreeArray array = new TeamTreeArray(16);

        addTeams(array, teamList);

        System.out.println(array.printArray());

        GameQueue queue = new GameQueue();

        createQueue(queue, array);

        System.out.println(queue.printQueue());

        simGame(array, queue);

        System.out.println(array.printArray());

        createQueue(queue, array);

        System.out.println(queue.printQueue());

    }

}
