package Controller;

import entity.Card;
import entity.Enemy;
import entity.User;

import java.util.Objects;

public class PlayController {

    public static void main(String[] args) {
        Enemy.setHp(4);
        User.setHp(4);
        Enemy.setArmor("八卦阵");
        User.setCurrent_card("杀");
        Enemy.setCurrent_card("杀");
        Card.setDecide_color("black");
        int e_hp = Enemy.getHp();
        int u_hp = User.getHp();
        if (Objects.equals(User.getCurrent_card(),"杀")){
            Enemy.setHp(Ukill(e_hp));
            e_hp = Enemy.getHp();
        }
        if (Objects.equals(Enemy.getCurrent_card(),"杀")){
            User.setHp(Ekill(u_hp));
            u_hp = User.getHp();
        }
        if (Objects.equals(User.getCurrent_card(),"火杀")){
            Enemy.setHp(UFireKill(e_hp));
            e_hp = Enemy.getHp();
        }
        if (Objects.equals(Enemy.getCurrent_card(),"火杀")){
            EFireKill();
        }
        if (Objects.equals(User.getCurrent_card(),"雷杀")){
            UThunderKill();
        }
        if (Objects.equals(Enemy.getCurrent_card(),"雷杀")){
            EThunderKill();
        }
        System.out.println("敌人血量："+ e_hp);
        System.out.println("我方血量："+ u_hp);
    }

    public static String DamageIneffective(){
        return "伤害无效";
    }

    public static String Dodge(){
        return "闪避";
    }

    public static String BaGuaPanDing(){
        if (Objects.equals(Card.getDecide_color(),"red")){
            Dodge();
        }
        return "判定结束";
    }

    public static String RenWang(){
        if (Objects.equals(Card.getCard_color(),"black")){
            DamageIneffective();
        }
        return "判定结束";
    }

    public static int Ukill(int e_hp){//有问题
        if (Objects.equals(Enemy.getArmor(), "八卦阵")){
                BaGuaPanDing();
            }else if (Objects.equals(Enemy.getArmor(), "藤甲")) {
                DamageIneffective();
            }else if (Objects.equals(Enemy.getArmor(), "仁王盾")){
                RenWang();
            }
        else if(Objects.equals(Enemy.getResponse_card(),"闪")){
            Dodge();
        }else if (Objects.equals(User.getState(), "酒")) {
            if (Objects.equals(Enemy.getArmor(),"白银狮子")){
                e_hp--;
            }else {
                e_hp -= 2;
            }
        } else {
            e_hp--;
        }
        return e_hp;
    }

    public static int Ekill(int u_hp){
        if(Objects.equals(User.getResponse_card(),"闪")){
            Dodge();
        }else if (Objects.equals(User.getArmor(),"藤甲")){
            DamageIneffective();
        }
        else if(Objects.equals(Enemy.getState(),"酒")){
            u_hp -= 2;
        }else {
            u_hp--;
        }
        return u_hp;
    }

    public static int UFireKill(int e_hp){
        if(Objects.equals(Enemy.getCurrent_card(),"闪")){
        }else if (Objects.equals(User.getState(),"酒")){
            e_hp -= 2;
        }else {
            e_hp--;
        }
        return e_hp;
    }

    public static int EFireKill(){
        int c_hp = User.getHp();
        if(Objects.equals(User.getResponse_card(),"闪")){
        }else if(Objects.equals(Enemy.getState(),"酒")){
            c_hp -= 2;
        }else {
            c_hp--;
        }
        return c_hp;
    }

    public static int UThunderKill(){
        int e_hp = Enemy.getHp();
        if(Objects.equals(Enemy.getCurrent_card(),"闪")){
        }else if (Objects.equals(User.getState(),"酒")){
            e_hp -= 2;
        }else {
            e_hp--;
        }
        return e_hp;
    }

    public static int EThunderKill(){
        int c_hp = User.getHp();
        if(Objects.equals(User.getResponse_card(),"闪")){
        }else if(Objects.equals(Enemy.getState(),"酒")){
            c_hp -= 2;
        }else {
            c_hp--;
        }
        return c_hp;
    }
}
