import java.util.
class Order {
    private static int ord_num=11000;
    private static int custom_num=1500;
    Pizza P;
    Order()
    {
        set_order();
        ord_num+=1;
        custom_num+=1;
    }
    public void set_order()
    {
        char ch;
        System.out.print("Hi. What would you like to order? ");
        Scanner S=new Scanner(System.in);

        do {
            P=new Pizza();
            System.out.print("Is that all or you will something more?(y/n): ");
            ch=S.nextChar();
        }while(ch!='n');
    }

    int getCustom_num()
    {return custom_num;}
    int getOrd_num()
    {return ord_num;}

}

class Pizza {
    private String pizza_name;
    private String ingrid_name[]={"tomato","cheese","salami","backon","garlic","corn","pepperoni","olives"};
    private double tomato,cheese,salami,backon,garlic,corn,pepperoni,olives;
    private double ingrid[]={tomato=1,cheese=1,salami=1.5,backon=1.2,garlic=0.3,corn=0.7,pepperoni=0.6,olives=0.5}
    private int quantity;
    private String pizza_type;
    private float item_price=1;

    Pizza() {
        P_type();
        this.P_name();
        this.choose_ingridients();
    }
    public void P_type()
    {
        char ch;
        Scanner S=new Scanner(System.in);
        System.out.print("select pizza type(ordinar(o)/calzone(c): ");
        ch=S.nextChar();
        if(ch=='o')
            pizza_type="ordinar";
        else
        if(ch=='c')
        {
            pizza_type="Calzone";
            item_price += 0.5;
        }
    }
    public void P_name()
    {
        Scanner S=new Scanner(System.in);
        System.out.print("enter the pizza name: ");
        this.pizza_name=S.nextLine();
    }
    public void choose_ingridients()
    {
        char ch;
        int k=0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("add? "+ingrid_name[k]+"y/n");
            ch = s.nextChar();
            if(ch=='y')
                this.item_price+=this.ingrid[k];
            k++;
        }while(k< ingrid_name.length);
        Scanner S=new Scanner(System.in);
        this.pizza_name=S.nextLine();
        System.out.print("enter the quantity: ");
    }
    public float pizza_price()
    {
        int q;
        Scanner s = new Scanner(System.in);
        System.out.print("enter quantity: ");
        q = s.nextInt();
        return this.item_price*q;
    }

}
public class Order_palm{
    public static void main(String args[]) {
        System.out.print("wellcome to Palmet: ");
        Scanner s = new Scanner(System.in);
        Order ord;
        char ch;
        do
        {
            ord=new Order();
            System.out.print("NEXT ORDER(y/n): ");
            ch = s.nextChar();
        }while(ch!='n');
    }
}