package conditionalstatements;

import java.util.Scanner;

public class ZodiacSigns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mounth,day;
        System.out.print("Ay bilgisi girin : ");
        mounth = input.nextInt();
        System.out.print("Gun bilgisi girin : ");
        day = input.nextInt();
        boolean isError=false;
        if(mounth<0 || mounth>12){
            System.out.println("12 ay var 0-12 aralığında bir değer girin.");
        }else if(day<0){
            isError =true;
        }
        if(mounth==1){
            if(day<22){
                System.out.println("Burcunuz Oğlak");
            }else if(day>31){
                isError=true;
                System.out.println("Ocak 31 çekiyor.");
            }
        }
        else if(mounth==2){
            if(day<20){
                System.out.println("Burcunuz Kova");
            }else if(day>29){
                isError=true;
                System.out.println("Şubat 2024'te 29 çekiyor.");
            }
            }
        else if(mounth==3){
            if(day<21 ){
                System.out.println("Burcunuz Balık ");
            } else if(day>31){
                isError=true;
                System.out.println("Mart 31 çekiyor.");
            }
            }
        else if(mounth==4){
            if(day<21){
                System.out.println("Burcunuz Koç");
            }else if(day>30){
                isError=true;
                System.out.println("Nisan 30 çekiyor.");
            }
        }
        else if(mounth==5){
            if(day<22) {
                System.out.println("Burcunuz Boğa");
            } else if(day>31){
                isError = true;
                System.out.println("Mayıs 31 çekiyor.");
            }
        }
        else if(mounth==6){
            if(day<23){
                System.out.println("Burcunuz İkizler");
            }else if(day>30){
               isError=true;
                System.out.println("Haziran 30 çekiyor.");
            }
        }
        else if(mounth==7){
            if(day<23){
                System.out.println("Burcunuz Yengeç");
            }else if(day>31){
                isError=true;
                System.out.println("Temmuz 31 çekiyor.");
            }
        }
        else if(mounth==8){
            if(day<23){
                System.out.println("Burcunuz Aslan");
            }else if(day>31){
                isError=true;
                System.out.println("Ağustos 31 çekiyor.");
            }
        }
        else if(mounth==9){
            if(day<23){
                System.out.println("Burcunuz Başak");
            }else if(day>30){
                isError=true;
                System.out.println("Eylül 30 çekiyor.");
            }
        }
        else if(mounth==10){
            if(day<23){
                System.out.println("Burcunuz Ekim");
            }else if(day>31){
                isError=true;
                System.out.println("Ekim 31 çekiyor.");
            }
        }
        else if(mounth==11){
            if(day<22){
                System.out.println("Burcunuz Akrep");
            }else if(day>30){
                isError=true;
                System.out.println("Kasım 30 çekiyor.");
            }
        }
        else if(mounth==12){
            if(day<22){
                System.out.println("Burcunuz Yay");
            } else if(day>31){
                isError=true;
                System.out.println("Aralık 31 çekiyor.");
            }
        }
        if(isError){
            System.out.println("Hatalı giriş yaptınız tekrar deneyin.");
        }
    }
}
