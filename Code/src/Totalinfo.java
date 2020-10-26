public class Totalinfo {
    public static String monsterName;
    public static String AC;
    public static String HP;
    public static String strBonus;
    public static String dexBonus;
    public static String wisBonus;
    public static String conBonus;
    public static String intBonus;
    public static String charBonus;


    public static void setInfo(String name, String boxtext){
           if(name.equals("Monster Name")){
               monsterName = boxtext;
           }
           else if(name.equals("HPTextField")){
               HP = boxtext;
           }

           else if(name.equals("AC")){
               AC = boxtext;
           }

           else if(name.equals(("Str"))){
               strBonus = boxtext;
           }

           else if (name.equals(("Dex"))){
               dexBonus = boxtext;
           }

           else if(name.equals("Wis")){
               wisBonus = boxtext;
           }
           else if(name.equals("Con")){
               conBonus = boxtext;
           }
           else if(name.equals("Int")){
               intBonus = boxtext;
           }
           else if(name.equals("Char")){
               charBonus = boxtext;
           }
    }

}
