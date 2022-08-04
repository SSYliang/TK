package entity;

public class User {

    private static String current_card;
    private static String have_card;
    private static int hp;
    private static String response_card;
    private static String state;
    private static String armor;

    public static String getCurrent_card() {
        return current_card;
    }

    public static void setCurrent_card(String current_card) {
        User.current_card = current_card;
    }

    public static String getHave_card() {
        return have_card;
    }

    public static void setHave_card(String have_card) {
        User.have_card = have_card;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        User.hp = hp;
    }

    public static String getResponse_card() {
        return response_card;
    }

    public static void setResponse_card(String response_card) {
        User.response_card = response_card;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        User.state = state;
    }

    public static String getArmor() {
        return armor;
    }

    public static void setArmor(String armor) {
        User.armor = armor;
    }
}
