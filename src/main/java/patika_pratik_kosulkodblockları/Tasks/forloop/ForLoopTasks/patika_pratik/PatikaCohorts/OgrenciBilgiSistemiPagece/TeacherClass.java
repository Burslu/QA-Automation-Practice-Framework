package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.PatikaCohorts.OgrenciBilgiSistemiPagece;

public class TeacherClass {
    String name;
    String phoneNo;
    String branch;

    TeacherClass(String name , String phoneNo , String branch){
    this.name    = name;//parametreler
    this.phoneNo = phoneNo;
    this.branch  = branch;
    }
    void print(){
        System.out.println("Name: " + this.name);
        System.out.println("PhoneNo: " + this.phoneNo);
        System.out.println("Branch: " + this.branch);

    }

}
