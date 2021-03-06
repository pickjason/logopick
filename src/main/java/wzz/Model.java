package wzz;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: logopick
 * @description: 字符匹配
 * @author: ling
 * @create: 2019-05-09 11:37
 */
public enum Model {
    A("\n" +
            "   ,---,       \n" +
            "  '  .' \\       \n" +
            " /  ;    '.     \n" +
            ":  :       \\    \n" +
            ":  |   /\\   \\   \n" +
            "|  :  ' ;.   :  \n" +
            "|  |  ;/  \\   \\ \n" +
            "'  :  | \\  \\ ,' \n" +
            "|  |  '  '--'   \n" +
            "|  :  :         \n" +
            "|  | ,'         \n" +
            "`--''     ","65"),
    B("\n" +
            "      ,---,.  \n" +
            "    ,'  .'  \\ \n" +
            "  ,---.' .' | \n" +
            "  |   |  |: | \n" +
            "  :   :  :  / \n" +
            "  :   |    ;  \n" +
            "  |   :     \\ \n" +
            "  |   |   . | \n" +
            "  '   :  '; | \n" +
            "  |   |  | ;  \n" +
            "  |   :   /   \n" +
            "  |   | ,'    \n" +
            "  `----'  ","66"),
    C("\n" +
            "  ,----..   \n" +
            " /   /   \\  \n" +
            "|   :     : \n" +
            ".   |  ;. / \n" +
            ".   ; /--`  \n" +
            ";   | ;     \n" +
            "|   : |     \n" +
            ".   | '___  \n" +
            "'   ; : .'| \n" +
            "'   | '/  : \n" +
            "|   :    /  \n" +
            " \\   \\ .'   \n" +
            "  `---`","67"),
    D("\n " +
            "    ,---,     \n" +
            "  .'  .' `\\   \n" +
            ",---.'     \\  \n" +
            "|   |  .`\\  | \n" +
            ":   : |  '  | \n" +
            "|   ' '  ;  : \n" +
            "'   | ;  .  | \n" +
            "|   | :  |  ' \n" +
            "'   : | /  ;  \n" +
            "|   | '` ,/   \n" +
            ";   :  .'     \n" +
            "|   ,.'       \n" +
            "'---'","68"),
    E("\n" +
            "    ,---,. \n" +
            "  ,'  .' | \n" +
            ",---.'   | \n" +
            "|   |   .' \n" +
            ":   :  |-, \n" +
            ":   |  ;/| \n" +
            "|   :   .' \n" +
            "|   |  |-, \n" +
            "'   :  ;/| \n" +
            "|   |    \\ \n" +
            "|   :   .' \n" +
            "|   | ,'   \n" +
            "`----'     \n" +
            "           \n" +
            "       ","69"),
    F("\n " +
            "    ,---,. \n" +
            "  ,'  .' | \n" +
            ",---.'   | \n" +
            "|   |   .' \n" +
            ":   :  :   \n" +
            ":   |  |-, \n" +
            "|   :  ;/| \n" +
            "|   |   .' \n" +
            "'   :  '   \n" +
            "|   |  |   \n" +
            "|   :  \\   \n" +
            "|   | ,'   \n" +
            "`----'     ","70"),
    G(" \n" +
            "   ,----..    \n" +
            " /   /   \\   \n" +
            "|   :     :   \n" +
            ".   |  ;. /   \n" +
            ".   ; /--`    \n" +
            ";   | ;  __   \n" +
            "|   : |.' .'  \n" +
            ".   | '_.' :  \n" +
            "'   ; : \\  |  \n" +
            "'   | '/  .'  \n" +
            "|   :    /    \n" +
            " \\   \\ .'    \n" +
            "  `---`     ","71"),
    H("\n " +
            "        ,--, \n" +
            "      ,--.'|  \n" +
            "   ,--,  | :  \n" +
            ",---.'|  : '  \n" +
            "|   | : _' |  \n" +
            ":   : |.'  |  \n" +
            "|   ' '  ; :  \n" +
            "'   |  .'. |  \n" +
            "|   | :  | '  \n" +
            "'   : |  : ;  \n" +
            "|   | '  ,/   \n" +
            ";   : ;--'    \n" +
            "|   ,/        \n" +
            "'---'","72"),
    I("\n " +
            "   ,---, \n" +
            ",`--.' | \n" +
            "|   :  : \n" +
            ":   |  ' \n" +
            "|   :  | \n" +
            "'   '  ; \n" +
            "|   |  | \n" +
            "'   :  ; \n" +
            "|   |  ' \n" +
            "'   :  | \n" +
            ";   |.'  \n" +
            "'---'    ","73"),
    J("\n " +
            "         ,---._  \n" +
            "       .-- -.' \\ \n" +
            "       |    |   :\n" +
            "       :    ;   |\n" +
            "       :        |\n" +
            "       |    :   :\n" +
            "       :         \n" +
            "       |    ;   |\n" +
            "   ___ l         \n" +
            " /    /\\    J   :\n" +
            "/  ../  `..-    ,\n" +
            "\\    \\         ; \n" +
            " \\    \\      ,'  \n" +
            "  \"---....--'    \n" +
            "                ","74"),
    K(" \n" +
            "      ,--. \n" +
            "   ,--/  /| \n" +
            ",---,': / ' \n" +
            ":   : '/ /  \n" +
            "|   '   ,   \n" +
            "'   |  /    \n" +
            "|   ;  ;    \n" +
            ":   '   \\   \n" +
            "|   |    '  \n" +
            "'   : |.  \\ \n" +
            "|   | '_\\.' \n" +
            "'   : |     \n" +
            ";   |,'     \n" +
            "'---'       \n" ,"75"),
    L("\n " +
            "  ,--,    \n" +
            ",---.'|    \n" +
            "|   | :    \n" +
            ":   : |    \n" +
            "|   ' :    \n" +
            ";   ; '    \n" +
            "'   | |__  \n" +
            "|   | :.'| \n" +
            "'   :    ; \n" +
            "|   |  ./  \n" +
            ";   : ;    \n" +
            "|   ,/     \n" +
            "'---'      ","76"),
    M(" \n" +
            "         ____   \n" +
            "        ,'  , `. \n" +
            "     ,-+-,.' _ | \n" +
            "  ,-+-. ;   , || \n" +
            " ,--.'|'   |  ;| \n" +
            "|   |  ,', |  ': \n" +
            "|   | /  | |  || \n" +
            "'   | :  | :  |, \n" +
            ";   . |  ; |--'  \n" +
            "|   : |  | ,     \n" +
            "|   : '  |/      \n" +
            ";   | |`-'       \n" +
            "|   ;/           \n" +
            "'---'            ","77"),
    N(" \n" +
            "        ,--. \n" +
            "       ,--.'| \n" +
            "   ,--,:  : | \n" +
            ",`--.'`|  ' : \n" +
            "|   :  :  | | \n" +
            ":   |   \\ | : \n" +
            "|   : '  '; | \n" +
            "'   ' ;.    ; \n" +
            "|   | | \\   | \n" +
            "'   : |  ; .' \n" +
            "|   | '`--'   \n" +
            "'   : |       \n" +
            ";   |.'       \n" +
            "'---'         ","78"),
    O(" \n" +
            "   ,----..    \n" +
            "   /   /   \\   \n" +
            "  /   .     :  \n" +
            " .   /   ;.  \\ \n" +
            ".   ;   /  ` ; \n" +
            ";   |  ; \\ ; | \n" +
            "|   :  | ; | ' \n" +
            ".   |  ' ' ' : \n" +
            "'   ;  \\; /  | \n" +
            " \\   \\  ',  /  \n" +
            "  ;   :    /   \n" +
            "   \\   \\ .'    \n" +
            "    `---`      ","79"),
    P("\n" +
            ",-.----.    \n" +
            "\\    /  \\   \n" +
            "|   :    \\  \n" +
            "|   |  .\\ : \n" +
            ".   :  |: | \n" +
            "|   |   \\ : \n" +
            "|   : .   / \n" +
            ";   | |`-'  \n" +
            "|   | ;     \n" +
            ":   ' |     \n" +
            ":   : :     \n" +
            "|   | :     \n" +
            "`---'.|     \n" +
            "  `---`     ","80"),
    Q(" \n" +
            "   ,----..      \n" +
            "   /   /   \\     \n" +
            "  /   .     :    \n" +
            " .   /   ;.  \\   \n" +
            ".   ;   /  ` ;   \n" +
            ";   |  ; \\ ; |   \n" +
            "|   :  | ; | '   \n" +
            ".   |  ' ' ' :   \n" +
            "'   ;  \\; /  |   \n" +
            " \\   \\  ',  . \\  \n" +
            "  ;   :      ; | \n" +
            "   \\   \\ .'`--\"  \n" +
            "    `---`        ","81"),
    R("\n " +
            "           \n" +
            ",-.----.    \n" +
            "\\    /  \\   \n" +
            ";   :    \\  \n" +
            "|   | .\\ :  \n" +
            ".   : |: |  \n" +
            "|   |  \\ :  \n" +
            "|   : .  /  \n" +
            ";   | |  \\  \n" +
            "|   | ;\\  \\ \n" +
            ":   ' | \\.' \n" +
            ":   : :-'   \n" +
            "|   |.'     \n" +
            "`---'       ","82"),
    S("\n" +
            "             \n" +
            "  .--.--.    \n" +
            " /  /    '.  \n" +
            "|  :  /`. /  \n" +
            ";  |  |--`   \n" +
            "|  :  ;_     \n" +
            " \\  \\    `.  \n" +
            "  `----.   \\ \n" +
            "  __ \\  \\  | \n" +
            " /  /`--'  / \n" +
            "'--'.     /  \n" +
            "  `--'---'   ","83"),
    T("\n" +
            "        ,----, \n" +
            "      ,/   .`| \n" +
            "    ,`   .'  : \n" +
            "  ;    ;     / \n" +
            ".'___,/    ,'  \n" +
            "|    :     |   \n" +
            ";    |.';  ;   \n" +
            "`----'  |  |   \n" +
            "    '   :  ;   \n" +
            "    |   |  '   \n" +
            "    '   :  |   \n" +
            "    ;   |.'    \n" +
            "    '---'      ","84"),
    U("\n" +
            "         ,--,  \n" +
            "       ,'_ /|  \n" +
            "  .--. |  | :  \n" +
            ",'_ /| :  . |  \n" +
            "|  ' | |  . .  \n" +
            "|  | ' |  | |  \n" +
            ":  | | :  ' ;  \n" +
            "|  ; ' |  | '  \n" +
            ":  | : ;  ; |  \n" +
            "'  :  `--'   \\ \n" +
            ":  ,      .-./ \n" +
            " `--`----'     ","85"),
    V("\n " +
            "            \n" +
            "       ,---. \n" +
            "      /__./| \n" +
            " ,---.;  ; | \n" +
            "/___/ \\  | | \n" +
            "\\   ;  \\ ' | \n" +
            " \\   \\  \\: | \n" +
            "  ;   \\  ' . \n" +
            "   \\   \\   ' \n" +
            "    \\   `  ; \n" +
            "     :   \\ | \n" +
            "      '---\"  ","86"),
    W(" \n " +
            "         .---. \n" +
            "          /. ./| \n" +
            "      .--'.  ' ; \n" +
            "     /__./ \\ : | \n" +
            " .--'.  '   \\' . \n" +
            "/___/ \\ |    ' ' \n" +
            ";   \\  \\;      : \n" +
            " \\   ;  `      | \n" +
            "  .   \\    .\\  ; \n" +
            "   \\   \\   ' \\ | \n" +
            "    :   '  |--\"  \n" +
            "     \\   \\ ;     \n" +
            "      '---\"      ","87"),
    X(" \n " +
            "              \n" +
            " ,--,     ,--,  \n" +
            " |'. \\   / .`|  \n" +
            " ; \\ `\\ /' / ;  \n" +
            " `. \\  /  / .'  \n" +
            "  \\  \\/  / ./   \n" +
            "   \\  \\.'  /    \n" +
            "    \\  ;  ;     \n" +
            "   / \\  \\  \\    \n" +
            "  ;  /\\  \\  \\   \n" +
            "./__;  \\  ;  \\ \n" +
            "|   : / \\  \\  ; \n" +
            ";   |/   \\  ' | \n" +
            "`---'     `--`  ","88"),
    Y("\n " +
            "       ,---, \n" +
            "       /_ ./| \n" +
            " ,---, |  ' : \n" +
            "/___/ \\.  : | \n" +
            " .  \\  \\ ,' ' \n" +
            "  \\  ;  `  ,' \n" +
            "   \\  \\    '  \n" +
            "    '  \\   |  \n" +
            "     \\  ;  ;  \n" +
            "      :  \\  \\ \n" +
            "       \\  ' ; \n" +
            "        `--`  ","89"),
    Z("\n " +
            "        ,----, \n" +
            "       .'   .`| \n" +
            "    .'   .'   ; \n" +
            "  ,---, '    .' \n" +
            "  |   :     ./  \n" +
            "  ;   | .'  /   \n" +
            "  `---' /  ;    \n" +
            "    /  ;  /     \n" +
            "   ;  /  /--,   \n" +
            "  /  /  / .`|   \n" +
            "./__;       :   \n" +
            "|   :     .'    \n" +
            ";   |  .'       \n" +
            "`---'           ","90");
    private String str;

    private String ascll;

    Model(String s,String ascll) {
        str = s;
        this.ascll=ascll;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getAscll() {
        return ascll;
    }

    public void setAscll(String ascll) {
        this.ascll = ascll;
    }

    public static Map toMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (Model model : Model.values()) {
            map.put(model.getAscll(),model.getStr());
        }
        return map;
    }
}
