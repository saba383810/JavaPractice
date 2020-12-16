package builder;

import java.util.ArrayList;
import java.util.List;

public class FXBuilder implements Builder {

    public List<String> args =new ArrayList<String>();

    public FXBuilder() {
    }

    @Override
    public void makeTitle(String title) {
        args.add("『"+title+"』");
    }

    @Override
    public void makeString(String str) {
        args.add("■"+str);
    }

    @Override
    public void makeItems(String[] items) {
        for (int i=0;i<items.length;i++){
            args.add(items[i]);
        }
    }

    @Override
    public void close() {

        System.out.println(args);
        FxStart.FxMain(args.toArray(new String[args.size()]));
    }
}
