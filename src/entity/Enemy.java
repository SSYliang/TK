package entity;

public class Enemy {

    private static String name;
    private static int hp;
    private static String response_card;
    private static String state;
    private static String current_card;
    private static String armor;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Enemy.name = name;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Enemy.hp = hp;
    }

    public static String getResponse_card() {
        return response_card;
    }

    public static void setResponse_card(String response_card) {
        Enemy.response_card = response_card;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Enemy.state = state;
    }

    public static String getCurrent_card() {
        return current_card;
    }

    public static void setCurrent_card(String current_card) {
        Enemy.current_card = current_card;
    }

    public static String getArmor() {
        return armor;
    }

    public static void setArmor(String armor) {
        Enemy.armor = armor;
    }
}
