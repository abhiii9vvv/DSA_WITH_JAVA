package String;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapS[cs] != mapT[ct]) return false;

            mapS[cs] = i + 1;
            mapT[ct] = i + 1;
        }

        return true;
    }
}
