package house;

class House1 
{
    String name;
    int rooms;
    int area;
    
    public void setData( String society, int total_rooms, int total_area) 
    {
        name = society;
        rooms = total_rooms;
        area = total_area;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public int getRooms() 
    {
        return rooms;
    }
    public int area() 
    {
        return area;
    }
}

public class House {
    
    
    public static void main(String[] args) {
        
        House1 flat = new House1();
        flat.setData("Venkatesh Graffitt", 4, 850);
        System.out.println(flat.getName());
        System.out.println(flat.getRooms());
        System.out.println(flat.area());
    }
    
}
