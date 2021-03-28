package com.luasbagundatar;

public class sambutan {
    String sambutan;

    sambutan(){
        System.out.println("====================HALLO====================");
    }
    public void setSambutan(String sambutan){//constructor
        this.sambutan = sambutan;
    }
    public void show(){//methods
        System.out.println(""+sambutan);
    }
}
