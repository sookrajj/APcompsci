package Q3.prog295ccl;

import java.util.ArrayList;

public class sort {
    private ArrayList<socialPerson> list =  new ArrayList<>();

    public sort(ArrayList<socialPerson> hi) {
        list = hi;
    }

    public ArrayList<socialPerson> sortSocials() {
        for (int lcv2 = 0; lcv2 < list.size(); lcv2++) {
            for (int lcv = 0; lcv < list.size() - 1; lcv++) {
                if (list.get(lcv).getSocial().compareTo(list.get(lcv + 1).getSocial()) >= 0) {
                    socialPerson temp = list.get(lcv);
                    list.set(lcv, list.get(lcv + 1));
                    list.set(lcv + 1, temp);
                }
            }
        }
        return list;
    }
}
