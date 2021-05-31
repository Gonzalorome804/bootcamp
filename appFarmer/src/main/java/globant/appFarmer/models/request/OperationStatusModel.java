package globant.appFarmer.models.request;

//custom class to show in detail the htpp delete method
public class OperationStatusModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String name;
    private String result;

}
