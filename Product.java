class Product{
    int id;
    String name;
    int price;
    Product(int i,String n,int p){
        this.id=i;
        this.name=n;
        this.price=p;
    }
    public void print(){
        System.out.println("ID: "+ this.id);
        System.out.println("Name: "+ this.name);
        System.out.println("Price: "+ this.price);
        System.out.println("\n");
    }
    public static Product compare(Product p1,Product p2,Product p3){
         if(p1.price<p2.price && p1.price<p3.price){
            return p1;
         }
         else if(p2.price<p3.price){
            return p2;
         }
         else{
            return p3;
         }
     }
    public static void main(String[] args) {
        Product p1=new Product(1, "Brush", 25);
        Product p2=new Product(2,"Paste",30);
        Product p3=new Product(3,"Soap",50);
        p1.print();
        p2.print();
        p3.print();
        Product p=compare(p1,p2,p3);
        p.print();
    }
}