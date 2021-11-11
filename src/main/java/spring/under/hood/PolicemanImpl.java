package spring.under.hood;

public class PolicemanImpl implements Man {

    @Trimmer
    private String message;

    @Override
    public void sayWhereIWork() {
        System.out.println(" -- "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
