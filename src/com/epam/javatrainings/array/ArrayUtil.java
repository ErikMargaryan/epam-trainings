import java.util.Scanner;
class Order {
    private int ord_num;
    private int custom_num;
    int ord_num =11000;
    private static int custom_num=1500;
    Random ord_rand,custom_rand;
    Pizza P;
    Pizza p_arr[];
    Order()
    {
        ord_rand = new Random();
        custom_rand = new Random();
        custom_num=10000*custom_rand.nextDouble();
        ord_num=100000*ord_rand.nextDouble();
        set_order();
    }
    public void set_order()
    {
        char ch;
        System.out.print("Hi. What would you like to order? ");
        Scanner S=new Scanner(System.in);
        int k=0;
        do {
            P=new Pizza();
            System.out.print("Is that all or you will something more?(y/n): ");
            ch=S.next().charAt(0);
            p_arr[k]=P;
            k++;
        }while(ch!='n');
    }

    public void printCheck()
    {
        System.out.println("Order: " + ord_num);
        System.out.println("Client: " + custom_num);
        for(inti=0;i<p_arr.length;i++) {
            System.out.println("Name: " + p_arr[i].P_name());
            System.out.println("................................ ");
            System.out.println("Pizza baze(" + p_arr[i].P_type() + ")" + p_arr[i].getPizza_type_price() + '$');
            p_arr[i].print_ingrid();
            System.out.println("Qmmount: "+p_arr[i].getAmmount());
            System.out.println("Ammount: "+p_arr[i].getQuantity());
            System.out.println("................................ ");
        }
        double Ammount=0;
        for(int i=0;i<p_arr.length;i++)
            temp_Ammount+=p_arr[i];
        System.out.println("Total ammount: "+temp_Ammount);
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
    private double ingrid[]={tomato=1,cheese=1,salami=1.5,backon=1.2,garlic=0.3,corn=0.7,pepperoni=0.6,olives=0.5};
    private int quantity;
    private String pizza_type;
    private float item_price=1;
    private float pizza_type_price=1;
    private int ingrid_env[];

    Pizza() {
        P_type();
        this.P_name();
        this.choose_ingridients();
    }

    public float getPizza_type_price()
    {return pizza_type_price;}

    public String P_type()
    {
        char ch;
        String s;
        Scanner S=new Scanner(System.in);
        System.out.print("select pizza type(ordinar(o)/calzone(c): ");
        ch=S.next().charAt(0);
        if(ch=='o')
            pizza_type="ordinar";
        else
        if(ch=='c')
        {
            s=pizza_type="Calzone";
            pizza_type_price=item_price += 0.5;
        }
        else
            s=pizza_type="ordinar";
        return s;
    }
    public String P_name()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("enter the pizza name: ");
        String s=S.nextLine();
        pizza_name=s;
        return s;
    }
    public void choose_ingridients()
    {
        char ch;
        int index=0;
        int k=0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("add? "+ingrid_name[k]+"y/n");
            ch = s.next().charAt(0);;
            if(ch=='y') {
                this.item_price += this.ingrid[k];
                ingrid_env[index++]=k;
            }
            k++;
        }while(k< ingrid_name.length);
        Scanner S=new Scanner(System.in);
        this.pizza_name=S.nextLine();
        System.out.print("enter the quantity: ");
    }
    public void setQuantity()
    {
        int q;
        Scanner s = new Scanner(System.in);
        System.out.print("enter quantity: ");
        q = s.nextInt();
        quantity=q;
    }

    public int getQuantity()
    {return this.quantity;}

    public float getAmmount()
    {
        int q;
        Scanner s = new Scanner(System.in);
        System.out.print("enter quantity: ");
        q = s.nextInt();
        return this.item_price*quantity;
    }

    public void print_ingrid
    {fot(int i=0;i<ingrid_env.length;i++)
        System.out.print(ingrid_name[ingrid_env[i]]+" "+ingrid[ingrid_env[i]]);

    }
    public class Order_palm{
        public static void main(String args[]) {
            Order ord_arr[];
            Order ord;
            char ch;
            int ord_arr_index=0;
            int k=0;
            System.out.print("wellcome to Palmet: ");
            Scanner s = new Scanner(System.in);

            do
            {
                ord=new Order();
                ord_arr[ord_arr_index++]=ord;
                System.out.print("NEXT ORDER(y/n): ");
                ch = s.next().charAt(0);
            }while(ch!='n');

            for(int i=0;i<ord_arr_index;i++)


        }
    }