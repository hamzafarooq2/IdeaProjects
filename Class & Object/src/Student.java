public class Student {

    //  Access Specifiers: Default, Private, Public, Protected
    // default & public are same.
    // & by-default it is public.

    private int id;
    private String name;
    private double fees;
    private boolean isScholar;

    // setters and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public void setScholar(boolean scholar) {
        isScholar = scholar;
    }
//-------------------------------------------------------- method

    public Student()     // default Constructor, name of class & constructor must be same.
    {
        fees = 15000;
    }

    public Student(int id, String name, double fees, boolean isScholar) //Overloaded Constructor.
    {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.isScholar = isScholar;

    }

    public String toString(){
        return "Id: "+id+"\nName: "+name+"\nFees: "+fees+"\nisScholar: "+isScholar+"\n";
    }


}
