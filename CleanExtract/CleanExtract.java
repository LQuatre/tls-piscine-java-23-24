public class CleanExtract {
    public static StringBuilder spaceRemover(String s) {
        var result = new StringBuilder();
        var isSpace = false;

        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c == ' ') {
                if (!isSpace) {
                    result.append(c);
                }
                isSpace = true;
            } else {
                result.append(c);
                isSpace = false;
            }
        }

        return result;
    }

    public static StringBuilder silexistplusieurfoisRemover(String s) {
        var result = new StringBuilder();
        var isPoint = false;

        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c == '.') {
                if (!isPoint) {
                    result.append(c);
                }
                isPoint = true;
            } else {
                result.append(c);
                isPoint = false;
            }
        }

        return result;
    }

    public static boolean isCharacterExists(String s) {
        for (var i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCharacterExistsBefore(String s, int index) {
        for (var i = index - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    public static String extract(String s) {
        // var parts = s.split("\\|");
        // var result = new StringBuilder();

        // for (var index = 0; index < parts.length; index++) {
        //     var part = parts[index];
        //     var partsResult = new StringBuilder();
        //     var partCleaned = part.trim();
        //     var pointExists = false;

        //     for (var i = 0; i < partCleaned.length(); i++) {
        //         var c = partCleaned.charAt(i);

        //         if (i == 0 && c == ' ') {
        //             continue;
        //         }
                
        //         if (c == '.') {
        //             if (pointExists) {
        //                 if (index == parts.length - 1) {
        //                     partsResult.append(c);
        //                     partsResult = silexistplusieurfoisRemover(partsResult.toString());
        //                 }
        //                 break;
        //             }
        //             pointExists = true;
        //             if (index == parts.length - 1 && i == partCleaned.length() - 1) {
        //                 partsResult.append(c);
        //             }
        //             if (!isCharacterExists(partCleaned.substring(i))) {
        //                 if (index == parts.length - 1) {
        //                     partsResult.append(c);
        //                 }
        //             }
        //             if (isCharacterExistsBefore(partCleaned, i)) {
        //                 partsResult = new StringBuilder();
        //             }
        //             continue;
        //         } 
                
        //         if ((Character.isLetter(c) || c == ' ' || c == ',' || c == '\'' || c == '-')) { 
        //             partsResult.append(c);
        //         }
        //     }
            
        //     result.append(partsResult).append(" ");
        // }
        
        // if (result.length() > 0) {
        //     result.setLength(result.length() - 1);
        // }

        // if ((result.length() > 0 && result.charAt(0) == ' ') || (result.charAt(0) == '.')){
        //     result.deleteCharAt(0);
        // }

        // result = spaceRemover(result.toString());
        
        // return result.toString();
        return s;
    }
}