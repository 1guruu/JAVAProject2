package AnimalRescuer;

public class DogFood {

       private String dogFoodName;
        private int dogFoodPrice;
        private int dogFoodQuantityInGr;
        private int stockAvailable;

        private void setDogFoodName(String dogFoodName){
                this.dogFoodName=dogFoodName;
        }
        public String getDogFoodName(){
                return dogFoodName;
        }
        public void setDogFoodPrice(int dogFoodPrice){
                this.dogFoodPrice=dogFoodPrice;
        }
        public int getDogFoodPrice(){
                return dogFoodPrice;
        }
        public void setDogFoodQuantityInGr(int dogFoodQuantityInGr){
                this.dogFoodQuantityInGr=dogFoodQuantityInGr;
        }
        public int getDogFoodQuantityInGr(){
                return dogFoodQuantityInGr;
        }
        public void setStockAvailable(int stockAvailable){
                this.stockAvailable=stockAvailable;
        }
        public int getStockAvailable(){
                return stockAvailable;
        }

}
