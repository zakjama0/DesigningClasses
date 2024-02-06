public class Computer {

    private int currentStorage;
    private int extraStorage;

    private String modelName;

    public Computer(int inputCurrentStorage, String inputModelName){
        this.currentStorage = inputCurrentStorage;
         this.modelName = inputModelName;

    }

    public int additionalStorage(int currentStorage, int extraStorage){
       int totalStorage = currentStorage + extraStorage;
       return totalStorage;
    }

    public String printMessage(String inputModelName){
        this.modelName = inputModelName;

        if (inputModelName == null){
            return "You don't have a printer connected";
        } else{
            return "You have " +inputModelName + " connected to your device";
        }

    }

    public void setCurrentStorage(int currentStorage) {
        this.currentStorage = currentStorage;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setExtraStorage(int extraStorage) {
        this.extraStorage = extraStorage;
    }

    public int getExtraStorage() {
        return extraStorage;
    }

    public String getModelName() {
        return modelName;
    }

    public int getCurrentStorage() {
        return currentStorage;
    }


}
