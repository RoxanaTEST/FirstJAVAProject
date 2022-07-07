package AnimalRescuer.People;

public class VeterinaryDoctor extends People {

    private String specialization ;



    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specializationname){
        this.specialization = specializationname;
    }


    public void getacquainted() {
        System.out.println("Getting acquainted with the dog(treats)");
    }

    public void healthcheckup() {
        System.out.println("Checking dog's phisical condition");
    }
    public void allergologycheckup(){
        System.out.println("Conducting speciality investigations for allergens");
    }
    public void treatoffer(){
        System.out.println("Offering more treats for good behaviour:)");
    }

    }

