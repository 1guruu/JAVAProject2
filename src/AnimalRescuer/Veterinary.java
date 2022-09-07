package AnimalRescuer;

public class Veterinary {

    private String veterinaryName;
    private String veterinaryFunction;
    private int veterinaryAgeInYears;
    private int consultationPrice;


    public void setVeterinaryName(String veterinaryName){
        this.veterinaryName=veterinaryName;
    }
    public String getVeterinaryName(){
        return veterinaryName;
    }
    public void setVeterinaryFunction(String veterinaryFunction){
        this.veterinaryFunction=veterinaryFunction;
    }
    public String getVeterinaryFunction(){
        return veterinaryFunction;
    }
    public void setVeterinaryAgeInYears(int veterinaryAgeInYears){
        this.veterinaryAgeInYears=veterinaryAgeInYears;
    }
    public int getVeterinaryAgeInYears(){
        return veterinaryAgeInYears;
    }
    public void setConsultationPrice(int consultationPrice){
        this.consultationPrice=consultationPrice;
    }
    public int getConsultationPrice(){
        return consultationPrice;
    }



}
