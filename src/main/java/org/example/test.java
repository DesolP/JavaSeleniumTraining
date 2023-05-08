package org.example;

public class test {

    public static void main(String[] args) {

        Item item = new Item();
        item.itemMethod();

        //System.out.println(item.getName());

        Item item2 = new DocumentItem("bababiba");
        item2.itemMethod();
        DocumentItem item3 = new DocumentItem("tee");
        item3.itemMethod();

       // System.out.println(item2.getName());
    }




}


class Item {

    String name;
    public void itemMethod(){
        System.out.println("Printuje jakos metoda klasy Item");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class DocumentItem extends Item {

    String type;
    String test;
    @Override
    public void itemMethod(){
        super.itemMethod();
        System.out.println("Printuje jakos metoda klasy DocumentItem");
    }
    public DocumentItem(String test){
        this.test = test;
        //System.out.println("Printuje test: " + test);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}



