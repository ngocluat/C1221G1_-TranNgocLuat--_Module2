package test_example.vi_du_nho.testcompalator;

import java.util.Comparator;

public class exc implements  Comparator<Peson>{




    @Override
    public int compare(Peson o1, Peson o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
