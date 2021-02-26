package latihan4;
public class Bus3 {
    //membuat variabel instance
    public int penumpang;
    public int maxpenumpang;
    
    //membuat nethod Bus3 untuk mengatur jumloah max penumpang
    public Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //membuat method addPenumpang untuk menambah jumlah penumpang
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang; //menambah jumlah penumpang
        if(temp>maxpenumpang){ //jika jumlah penumpang melebihi maksimal penumpang
            System.out.println("penumpang melebihi kuota");  //akan muncul penumpang melebihi kuota
        }else{ //jika tidak
            this.penumpang = temp; //jumlah penumpang sama dengan temp
        }
    }
    //membuat method getPenumpang untuk mengatur password
    public void getpenumpang(int password){
        if(password==24){ //jika password = 24
            System.out.println("Password Benar"); //maka benar
        }else{ //jika selain 24
            System.out.println("Password Salah"); //maka salah
        }
    }
    //method menampilkan hasil output
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang = "+penumpang); //menampilkan output jumlah penumpang
        System.out.println("maksimum penumpang yang seharusnya adalah = "+maxpenumpang); //menampilkan output maksimal penumpang
    }
}