package entity;

public class Card {

    private static String card_name;
    private static String card_type;
    private static String card_design;
    private static int card_number;
    private static String card_photo;
    private static String damage_type;
    private static String card_color;
    private static String decide_color;

    public static String getCard_name() {
        return card_name;
    }

    public static void setCard_name(String card_name) {
        Card.card_name = card_name;
    }

    public static String getCard_type() {
        return card_type;
    }

    public static void setCard_type(String card_type) {
        Card.card_type = card_type;
    }

    public static String getCard_design() {
        return card_design;
    }

    public static void setCard_design(String card_design) {
        Card.card_design = card_design;
    }

    public static int getCard_number() {
        return card_number;
    }

    public static void setCard_number(int card_number) {
        Card.card_number = card_number;
    }

    public static String getCard_photo() {
        return card_photo;
    }

    public static void setCard_photo(String card_photo) {
        Card.card_photo = card_photo;
    }

    public static String getDamage_type() {
        return damage_type;
    }

    public static void setDamage_type(String damage_type) {
        Card.damage_type = damage_type;
    }

    public static String getCard_color() {
        return card_color;
    }

    public static void setCard_color(String card_color) {
        Card.card_color = card_color;
    }

    public static String getDecide_color() {
        return decide_color;
    }

    public static void setDecide_color(String decide_color) {
        Card.decide_color = decide_color;
    }
}
