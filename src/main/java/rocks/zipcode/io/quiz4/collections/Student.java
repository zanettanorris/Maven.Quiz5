package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double learn = 0.00;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id =  id;
    }
//public void setAmountOfHours(){
//        amountOfHours = this.amountOfHours;
//}
//public Double getAmountOfHours(){
//       return this.amountOfHours;
//}
    public void learn(Double amountOfHours) {
    this.learn += amountOfHours;}

    public Double getTotalStudyTime() {
return learn;    }
}
