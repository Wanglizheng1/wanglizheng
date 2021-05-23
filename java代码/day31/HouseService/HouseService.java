package day31.HouseService;

import day31.HouseDomain.House;
import day31.HouseUtils.Utility;

public class HouseService {
    private House[] houses;
    private int houseNum = 1;
    private int houseCounter = 1;

    public HouseService(int size) {
        this.houses = new House[size];
        houses[0] = new House(1,"JACK", 123,"海淀区", 2000, "未出租");
    }
    public House[] list(){
        return houses;
    }
    public void listHouse(){
        System.out.println("===============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("\n===============房屋列表显示完毕==============");
    }
    public void addHouses(){
        System.out.println("===============添加房屋==============");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        int phone  = Utility.readInt();
        System.out.print("地址: ");
        String address = Utility.readString(15);
        System.out.print("租金: ");
        int rent  = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(5);
        House house = new House(0, name, phone, address, rent, state);
        house.setId(++houseCounter);
        if(houses.length == houseNum){
            System.out.println("数组已满，不能在添加！");
        }else {
            houses[houseNum++] = house;
            System.out.println("\n===============添加完成==============");
        }
    }
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNum] = null;
        return true;
    }
    public House findById(int fingId){
        for (int i = 0; i < houseNum; i++) {
            if(fingId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

}
