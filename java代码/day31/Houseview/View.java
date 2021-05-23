package day31.Houseview;

import day31.HouseDomain.House;
import day31.HouseService.HouseService;
import day31.HouseUtils.Utility;

public class View {
    private boolean loop = true;
    private char key;
    HouseService houseService = new HouseService(2);

    public void delHosue(){
        System.out.println("===============删除房屋信息==============");
        System.out.print("请输入删除的房屋的编号(-1退出):" );
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("===============放弃删除房屋信息==============");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("===============删除房屋信息成功==============");
            }else {
                System.out.println("===============房屋编号不存在，删除房屋信息失败==============");
            }
        }else{
            System.out.println("===============放弃删除房屋信息==============");
        }
    }
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }
    public void findHouse(){
        System.out.println("===============查找房屋信息==============");
        System.out.println("请输入要查找的id: ");
        int fingId = Utility.readInt();
        House house = houseService.findById(fingId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("===============查找房屋信息不存在==============");
        }
    }

    public void update() {
        System.out.println("=============修改房屋信息============");
        System.out.println("请选择待修改房屋编号(-1表示退出)");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=============你放弃修改房屋信息============");
            return;
        }

        //根据输入得到updateId，查找对象

        //老师特别提示:返回的是引用类型[即:就是数组的元素]
        //因此老师在后面对house.setXxx() ,就会修改HouseService中houses数组的元素!!!!!!!!!!
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("=============修改房屋信息编号不存在..============");
            return;
        }

        System.out.print("姓名(" + house.getName() + "): ");
        String name = Utility.readString(8, "");//这里如果用户直接回车表示不修改该信息,默认""
        if (!"".equals(name)) {//修改
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + "):");
        int phone = Utility.readInt(-1);
        if (phone != -1) {
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddress() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.print("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("=============修改房屋信息成功============");


    }
    public void mainMeau(){
        do {
            System.out.println("\n==============房屋出租系统菜单==============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择（1-6）:");
            key = Utility.readChar();
            switch (key){
                case '1':
                    houseService.addHouses();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHosue();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    houseService.listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }

        }while (loop);
    }

}
