public class Item {

  String name, serialNumber;
  int price;

  
	Item (String name, String serialNumber, int price){
    this.name = name;
    this.serialNumber = serialNumber;
    this.price = price;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setSerialNumber(String serialNumber){
    this.serialNumber = serialNumber;
  }

  public void setPrice(int price){
    this.price = price;
  }
  
  public String getName(){
    return name;
  }
  
  public String getSerialNumber(){
    return serialNumber;
  }

  public int getPrice(){
    return price;
  }

  @Override
  public String toString(){
    return name + "," + serialNumber + "," + price;
  }
}