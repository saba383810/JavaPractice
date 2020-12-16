package builder;

public class TextBuilder implements Builder{
    private StringBuilder buffer = new StringBuilder();
    //makeTitle,makeString, makeItems,close 省略 自分で作ってみよう
    public String getResult(){
        return buffer.toString();
    }

    @Override
    public void makeTitle(String title) {
        buffer.append("=================\n");
        buffer.append("『"+title+"』\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("■"+str+"\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String data : items){
            buffer.append("・"+data+"\n");
        }
    }

    @Override
    public void close() {
        buffer.append("=================\n");
    }
}
