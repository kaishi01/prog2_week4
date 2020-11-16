//演習2_8の途中。
public class Chatbot{
    private String name;
    String no = "差別用語";
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }
    public Chatbot(String _name){
        this.name = _name;
        System.out.println("チャットボット名" + this.name + "を作成します。");
    }
    public void greeting(){
        System.out.println("はじめまして" + this.name + "です。よろ！");
    }
    public void setName(String name2){
        if( name2.equals(no)){
            System.out.println("禁止されています");
        }else{
            System.out.println("ボット名を" + name + "から" + name2 + "へと変更します");
            name = name2;
        }
    }
}
