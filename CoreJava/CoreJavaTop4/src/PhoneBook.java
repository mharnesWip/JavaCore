import java.util.*;

public class PhoneBook {

    public void findEmployee(Set entry_set, String name) {
        Long phone_number = 0L;

        Iterator i = entry_set.iterator();

        while(i.hasNext()){
            Map.Entry map_entry = (Map.Entry)i.next();

            if(map_entry.getKey() == name){
                phone_number = (Long)map_entry.getValue();
                System.out.println(name + "'s phone number is: " + phone_number);
            }
        }
        if(phone_number == 0L){
            System.out.println(name + " is not in the phone book.");
        }
    }


    public static void main(String args[]){
        PhoneBook obj = new PhoneBook();
        HashMap<String, Long> hm = new HashMap<String, Long>();
        
        hm.put("Jeff", 2039487362L);
        hm.put("Schmidt", 2019283746L);
        hm.put("Jes", 2037163958L);
        hm.put("Chris", 4710294867L);
        hm.put("Terry", 2469875385L);
        hm.put("Scary", 1278549865L);

        obj.findEmployee(hm.entrySet(), "Schmidt");
        obj.findEmployee(hm.entrySet(), "Scary");
        obj.findEmployee(hm.entrySet(), "Terry");
        obj.findEmployee(hm.entrySet(), "Juan");
    }
}
