//public class Crypto {
//    public static void main(String[] args) {
//        String text = normalizeText("");
//        String letstryit = caesarify(text, -1);
//        System.out.println(letstryit);
//        shiftAlphabet(2);
//        System.out.println(shiftAlphabet(3));
//    }
//
//    public static String normalizeText(String regText) {
//        String uppercase = regText.toUpperCase();
//        String spaces = uppercase.replaceAll("\\s", "");
//        String punctuation = spaces.replaceAll("\\p{Punct}", "");
//        String NewInput = punctuation;
//        return NewInput;
//    }
//
////    public static String obify() {
////        return obifiedText;
////    }
//
//    public static String caesarify(String NewInput, int shift) {
//        if (shift > 26) {
//            shift = shift % 26;
//        } else if (shift < 0) {
//            shift = (shift % 26) + 26;
//        }
//        String caesarText = "";
//        int length = NewInput.length();
//
//        for (int i = 0; i < length; i++) {
//            char ch = NewInput.charAt(i);
//            if (Character.isLetter(ch)) {
//                if (Character.isLowerCase(ch)) {
//                    char c = (char) (ch + shift);
//                    if (c > 'z') {
//                        caesarText = caesarText + (char) (ch - (26 - shift));
//                    } else {
//                        caesarText = caesarText + c;
//                    }
//                } else if (Character.isUpperCase(ch)) {
//                    char c = (char) (ch + shift);
//                    if (c > 'Z') {
//                        caesarText = caesarText + (char) (ch - (26 - shift));
//                    } else {
//                        caesarText = caesarText + c;
//                    }
//                }
//
//            }
//        }
//        return caesarText;
//    }
//}
//
//
//
////    public static String shiftAlphabet(int shift) {
////        int start = 0;
////        if (shift < 0) {
////            start = (int) 'Z' + shift + 1;
////        } else {
////            start = 'A' + shift;
////        }
////        String result = "";
////        char currChar = (char) start;
////        for(; currChar <= 'Z'; ++currChar) {
////            result = result + currChar;
////        }
////        if(result.length() < 26) {
////            for(currChar = 'A'; result.length() < 26; ++currChar) {
////                result = result + currChar;
////            }
////        }
////        return result;
////    }
////
////    public static String groupify(String Break, int letters) {
////        for (int i = 0; i < Break.length(); i++) {
////
//
//
//
//
//
////        } return groupifiedText;
////    }
////    public static String encyptString() {
////        normalizeText(text);
////        obify(normalizeText);
////        caesarify(obifiedText);
////        groupify(caesarifiedText);
////        print(groupifiedText);
////        return *****;
////    }
////}
//
//
//

