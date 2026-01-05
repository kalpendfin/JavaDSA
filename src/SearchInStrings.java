public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kalpen";
        char target = 'n';

        boolean ans = searchString(name, target);
        System.out.println(ans);
    }

    private static boolean searchString(String name, char target) {

        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {

            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}