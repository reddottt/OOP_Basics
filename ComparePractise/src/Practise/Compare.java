package Practise;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Hungry", "M4A1-S", 8, 56, 4, 26),
                new Player("Hungry", "DesertEagle", 3, 70, 2, 7),
                new Player("Afternoon", "M4A1-S", 31, 66, 10, 34),
                new Player("Slayer", "AK-47", 16, 81, 7, 5),
                new Player("Carry", "AWP", 11, 85, 6, 26)
        };

        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players) + "\n");

        Arrays.sort(players, new ComparatorByPlayerFavoriteWeapon());
        System.out.println("sort by favourite weapon: " + Arrays.toString(players) + "\n");

        Arrays.sort(players, new ComparatorByPlayerNickname());
        System.out.println("sort by nickname: " + Arrays.toString(players) + "\n");

        Arrays.sort(players, new ComparatorByPlayerLevel());
        System.out.println("sort by level: " + Arrays.toString(players) + "\n");

        Arrays.sort(players, new ComparatorByPlayerAverageAimAccuracy());
        System.out.println("sort by favourite average aim accuracy: " + Arrays.toString(players) + "\n");

        Arrays.sort(players, new ComparatorByPlayerPlayedHours());
        System.out.println("sort by played hours: " + Arrays.toString(players) + "\n");

        Arrays.sort(players, new ComparatorByPlayerPing());
        System.out.println("sort by ping: " + Arrays.toString(players) + "\n");


    }
}

class Player implements Comparable{

    private String nickname;
    private String favoriteWeapon;
    private int playedHours;
    private int averageAimAccuracy;
    private int level;
    private int ping;

    public String getNickname() {
        return nickname;
    }

    public String getFavoriteWeapon() {
        return favoriteWeapon;
    }

    public int getPlayedHours() {
        return playedHours;
    }

    public int getAverageAimAccuracy() {
        return averageAimAccuracy;
    }

    public int getLevel() {
        return level;
    }

    public int getPing() {
        return ping;
    }

    public Player(String nickname, String favoriteWeapon, int playedHours, int averageAimAccuracy, int level, int ping) {
        this.nickname = nickname;
        this.favoriteWeapon = favoriteWeapon;
        this.playedHours = playedHours;
        this.averageAimAccuracy = averageAimAccuracy;
        this.level = level;
        this.ping = ping;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", favoriteWeapon='" + favoriteWeapon + '\'' +
                ", playedHours=" + playedHours +
                ", averageAimAccuracy=" + averageAimAccuracy +
                ", level=" + level +
                ", ping=" + ping +
                '}';
    }

    @Override
    public int compareTo(Object object) {
        int result = this.nickname.compareTo(((Player)object).nickname);
        if (result != 0) {
            return result;
        } else {
            result = this.level - ((Player)object).level;
            if (result != 0){
                return result;
            } else {
                result = this.playedHours - ((Player)object).playedHours;
                if (result != 0) {
                    return result;
                } else {
                    result = this.averageAimAccuracy - ((Player)object).averageAimAccuracy;
                    if (result != 0) {
                        return result;
                    } else {
                        result = this.ping - ((Player)object).ping;
                        if (result != 0) {
                            return result;
                        } else {
                            return this.favoriteWeapon.compareTo(((Player)object).favoriteWeapon);
                        }
                    }
                }
            }
        }
    }
}

class ComparatorByPlayerNickname implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        return ((Player)object1).getNickname().compareTo(((Player)object2).getNickname());
    }
}

class ComparatorByPlayerFavoriteWeapon implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        return ((Player)object1).getFavoriteWeapon().compareTo(((Player)object2).getFavoriteWeapon());
    }
}

class ComparatorByPlayerLevel implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        return ((Player)object1).getLevel() - ((Player)object2).getLevel();
    }
}

class ComparatorByPlayerPlayedHours implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        return ((Player)object1).getPlayedHours() - ((Player)object2).getPlayedHours();
    }
}

class ComparatorByPlayerAverageAimAccuracy implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        return ((Player)object1).getAverageAimAccuracy() - ((Player)object2).getAverageAimAccuracy();
    }
}

class ComparatorByPlayerPing implements Comparator {
    @Override
    public int compare(Object object1, Object object2) {
        return ((Player)object1).getPing() - ((Player)object2).getPing();
    }
}
