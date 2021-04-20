package mx;


    public class MayBe<T> {
        private T data;
        private int status;

        public MayBe(T data, int status) {
            this.data = data;
            this.status = status;
        }


        public String print(){
            switch(status){
                case 1:
                    return "Data is:" + data;
                case 2:
                    return "No access allowed";
                case 3:
                    return "Not available";
                default:
                    return "Wrong status";
            }
        }
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }


