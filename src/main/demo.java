package main;
class student{
   String Name;
   int regdNo;
   String Branch;
   String Alloted_Department;

   public student(){
    this.name = "Unknown";
    this.regdNo = 0;
    this.Branch = "Unknown";
    this.Alloted_Department = "Unknown";
   }

   public student(String name, int regdid, String branch, String department){
       super(name, regdid, branch, department)
       this.Name = name;
       this.regdNo = regdid;
       this.Branch = branch;
       this.Alloted_Department = department;
   }

   
}

class grades extends student{
    double InternalAssessment;
    double EndSem;
    double totalScore;

    public grades(String name, int regdNo, String branch, String department, double internal, double end){
        this.InternalAssessment = internal;
        this.EndSem = end;
    }

    public void Calcmarks(){
        this.totalScore = (this.InternalAssessment * 0.40 + this.EndSem * 0.60);
    }

    public String Calcgrade(){
        if(this.totalScore >= 90)
            return "O";
        else if(this.totalScore >= 80)
            return "E";
        else if(this.totalScore >= 60)
            return "A";
        else if(this.totalScore >= 40)
            return "B";
        else 
           return "Fr";
    }

}



public class demo{
    public static void main (String[] args){

    }
}