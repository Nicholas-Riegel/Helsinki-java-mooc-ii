// The Person constructor takes a name and the education as parameters. A Person has a method public Education getEducation(), which returns the education of the person. A Person also has a toString -method which works as follows:

// Person anna = new Person("Anna", Education.PHD);
// System.out.println(anna);
// Sample output
// Anna, PHD

public class Person {

    private String name;
    private Education education;

    public Person(String name, Education education){
        this.name = name;
        this.education = education;
    }

    public Education getEducation(){
        return this.education;
    }

    public String toString(){
        return this.name + ", " + this.education;        
    }
}
