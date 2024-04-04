public class StringReplace {
    public static String typeof(Object obj) {
        if (obj instanceof Character) {
            return "char";
        } else if (obj instanceof String) {
            return "string";
        } else {
            return obj.getClass().getSimpleName();
        }
    }
    
    public static String replace(String s, Object target, Object replacement) {
        if (typeof(target).equals("char")) {
            target = target.toString();
        }
        if (typeof(replacement).equals("char")) {
            replacement = replacement.toString();
        }
        if (s == null) {
            return null;
        }
        if (target == null) {
            return s;
        }
        if (replacement == null) {
            return s;
        }
        return s.replace(target.toString(), replacement.toString());
    }
}