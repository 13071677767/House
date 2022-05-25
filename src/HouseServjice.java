public class HouseServjice {

    private  House[] houses;
    private int houseNums =1;
    private int idCounter=1;

    public HouseServjice(int size){
        houses =new House[size];
        houses[0]=new House(1,"何柏森","666666","吴川",500,"未出租");
        houses[1]=new House(2,"李福宙","888888","广东",800,"未出租");

    }

    public boolean add(House newHoues){
        if(houseNums==houses.length){
            System.out.println("数组已满不能添加");
            return  false;
        }
        houses[houseNums++]=newHoues;
        newHoues.setId(++idCounter);
        return true;

    }
    public House[] list(){
        return houses;
    }

}
