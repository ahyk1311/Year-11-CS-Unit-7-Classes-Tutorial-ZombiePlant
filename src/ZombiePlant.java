public class ZombiePlant {
    private int maxPotency;
    private int treatmentsRequired;
    public ZombiePlant(int maxPotency, int treatmentsRequired){
        this.maxPotency = maxPotency;
        this.treatmentsRequired = treatmentsRequired;
    }
    public int getPotency() {
        return maxPotency;
    }
    public int treatmentsNeeded(){
        return treatmentsRequired;
    }
    public boolean isDangerous(){
        return treatmentsRequired > 0;
    }
    public void treat(int treatments){
        if(treatments<=maxPotency && treatmentsRequired>0 && treatments>0){
                treatmentsRequired--;
        }else if(treatments>maxPotency && treatments>0)treatmentsRequired++;
    }
}
