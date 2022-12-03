package org.example;
/**
 * Container class
 */
public class Person {
    /**
     * Сlass elements
     */
    private int id;
    private String name;
    private String gender;
    private String BirtDay;
    private Division div;
    private int Salary;

    /**
     * class constructor
     * @param A line read from file
     */
    public Person(String[] A){
        if(A==null)
            throw new RuntimeException("file read error");
        this.id =Integer.parseInt(A[0]);
        this.name=new String(A[1]);
        this.gender = new String(A[2]);
        this.BirtDay=new String(A[3]);
        this.div=new Division(A[4]);
        this.Salary=Integer.parseInt(A[5]);
    }

    /**
     * change function id
     * @param newID new field value id type int
     */
    public void setID(int newID){
        this.id=newID;
    }
    /**
     * change function id
     * @param newID new field value id type string
     */
    public void setID(String newID){
        this.id=Integer.parseInt(newID);
    }

    /**
     * change function name
     * @param newName new field value name
     */
    public void setName(String newName){
        this.name=newName;
    }

    /**
     *change function gender
     * @param newGender new field value gender
     */
    public void setGender(String newGender){
        this.gender=newGender;
    }

    /**
     *change function birthday
     * @param newBirt new field birtday
     */
    public void setBirtDay(String newBirt){
        this.BirtDay=newBirt;
    }

    /**
     *change function salary
     * @param newSalary new field salary type int
     */
    public void setSalary(int newSalary){
        this.Salary=newSalary;
    }

    /**
     *change function salary
     * @param newSalary new field salary type string
     */
    public void setSalary(String newSalary){
        this.Salary=Integer.parseInt(newSalary);
    }

    /**
     *change function division
     * @param newID_key new field ID
     * @param newTitle new field name
     */
    public void setDiv(int newID_key,String newTitle){
        this.div.setID_key(newID_key);
        this.div.setTitle(newTitle);
    }

    /**
     *get value function id
     * @return value id
     */
    public int getId(){
        return this.id;
    }

    /**
     *get value function salary
     * @return value salary
     */
    public int getSalary(){
        return this.Salary;
    }

    /**
     *get value function name
     * @return value name
     */
    public String getName(){
        return this.name;
    }

    /**
     *get value function gender
     * @return value gender
     */
    public String getGender(){
        return this.gender;
    }

    /**
     *get value function birthday
     * @return value birtday
     */
    public String getBirtDay(){
        return  this.BirtDay;
    }

    /**
     *get value function division
     * @return string with class values division
     */
    public String getDiv(){
        return "ID:" + this.div.getID_key() +" name:" + this.div.getTitle();
    }

    /**
     * get value function ID from class division
     * @return value ID
     */
    public int getID_key()
    {
    return this.div.getID_key();
    }
    /**
     *get value function name from class division
     * @return value Title
     */
    public String getDivTitle(){
        return this.div.getTitle();
    }

    /**
     *screen display function
     * @return line with class fields
     */
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", division:" + getDiv() +
                ", salary=" + Salary +
                ", BirthDay='" + BirtDay + '\'';
    }
}
