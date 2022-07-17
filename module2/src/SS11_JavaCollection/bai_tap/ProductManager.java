package SS11_JavaCollection.bai_tap;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager{
   ArrayList<Product> productArrayList = new ArrayList<>();

   public void add(Product product){
       productArrayList.add(product);
   }

   public void remove(int ID){
       int index = -1;
       for (Product Obj : this.productArrayList){
           index++;
           if (Obj.getProductID() == ID){
               break;
           }
       }
       if (index == -1){
           System.out.println("Product not available!!");
       }else {
           productArrayList.remove(index);
           for (Product product : productArrayList) {
               System.out.println(product.toString());
           }
       }
   }

   public void display() {
       for (Product product : productArrayList) {
           System.out.println(product.toString());
       }
   }

//    public void findByName(String name){
//       boolean check = false;
//       for (int i=0; i < productArrayList.size(); i++){
//           if (name == productArrayList.get(i).getProductName()){
//               System.out.println("ID" + productArrayList.get(i));
//               check = true;
//               return;
//           }
//           if (check = false){
//               System.out.println("Product not available on list!!");
//           }
//       }
//   }

   public void findByName(String name){
       Product product = null;
       for (Product Obj : this.productArrayList){
           if (Obj.getProductName().equals(name)){
               product = Obj;
               System.out.println("Product: " + Obj.toString());
           }
       }
       if (product == null){
           System.out.println("Product not available!!");
       }
   }

   public void changeProduct(int ID, String name, int price){
       Product productEdit = null;
       for (Product Obj : this.productArrayList){
           if (productEdit.getProductID() == ID){
               productEdit = Obj;
               break;
           }
       }
       if (productEdit == null){
           System.out.println("Product not available!!");
       }else {
           productEdit.setProductName(name);
           productEdit.setPrice(price);
       }
   }

   public void sortLowToHigh(){
       sortLowtoHigh priceLtH = new sortLowtoHigh();
       Collections.sort(this.productArrayList,priceLtH);
   }

   public void sortHighToLow(){
       sortHightoLow priceHtL = new sortHightoLow();
       Collections.sort(this.productArrayList,priceHtL);
   }




}
