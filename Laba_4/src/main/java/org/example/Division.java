package org.example;

public class Division {
    /**
     * Сlass elements
     */
    private int ID_key;
    private String  title;

    /**
     * class constructor
     * @param new_title field value meaning name
     * the field Id is randomly generated
     */
    public Division(String new_title){
        title=new_title;
        ID_key=(int) Math.random() * 1000;
    }

    /**
     * change value function Id
     * @param newID_key new field ID_key type int
     */
    public void setID_key(int newID_key){
        this.ID_key=newID_key;
    }

    /**
     * change value function Id
     * @param newID_key new field ID_key type string
     */
    public void setID_key(String newID_key){
        this.ID_key=Integer.parseInt(newID_key);
    }

    /**
     * change value function name
     * @param newTitle new field Title
     */
    public void setTitle(String newTitle){
        this.title=newTitle;}

    /**
     * get value function Id
     * @return value ID_key
     */
    public int getID_key(){
        return this.ID_key;
    }

    /**
     * get value function name
     * @return value Title
     */
    public String getTitle(){
        return this.title;
    }
}
