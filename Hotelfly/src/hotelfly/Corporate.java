/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author temp
 */
public class Corporate extends Customer {
    
    String company_name;
    int id;

    
     public Corporate (String cname,int id)
    {
        super("Mr Parry","Micheal","parrym92@gmail.com",43852000,161);
        this.company_name=cname;
        this.id=id;
    }
    
    public void Setcompany_name(String cname)
    {
        this.company_name=cname;
    }
       public void Setid(int id)
    {
        this.id=id;
    }
    public String Getcompany_name()
    {
        return company_name;
    }
      public int Getid()
    {
        return id;
    }
       public void display()
      {
          System.out.println("company_name:"+company_name+"/nid:"+id);
           
      }
    
        public static String corporateforTest(String name,int id){
        String nam=name;
        int Id=id;
        String r=nam+","+Id;
        return r;
    }
}
