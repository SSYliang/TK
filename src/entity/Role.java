package entity;

public class Role {

    private static String role_name;
    private static String role_sex;
    private static String role_photo;
    private static String role_description;
    private static String role_skill_name;

    public static String getRole_name() {
        return role_name;
    }

    public static void setRole_name(String role_name) {
        Role.role_name = role_name;
    }

    public static String getRole_sex() {
        return role_sex;
    }

    public static void setRole_sex(String role_sex) {
        Role.role_sex = role_sex;
    }

    public static String getRole_photo() {
        return role_photo;
    }

    public static void setRole_photo(String role_photo) {
        Role.role_photo = role_photo;
    }

    public static String getRole_description() {
        return role_description;
    }

    public static void setRole_description(String role_description) {
        Role.role_description = role_description;
    }

    public static String getRole_skill_name() {
        return role_skill_name;
    }

    public static void setRole_skill_name(String role_skill_name) {
        Role.role_skill_name = role_skill_name;
    }
}
