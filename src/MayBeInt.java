public class MayBeInt {

    private int data;
    private int status;

    public MayBeInt(int data, int status) {
        this.data = data;
        this.status = status;
    }

    public String print(){
        switch(status){
            case 1:
                return "  data :" +data;

        }
        return " ";
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
