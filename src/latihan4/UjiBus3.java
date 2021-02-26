package latihan4;
public class UjiBus3 {
    public static void main(String[] args) {
        //membuat objek Bus dari class Bus3
        Bus3 Bus = new Bus3(5);
        
        //memanggil method getPenumpang serta memasukkan password
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        //memanggil method cetak
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        //memanggil method cetak
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(1); //tambah 1 penumpang
        //memanggil method cetak
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        //memanggil method cetak
        Bus.cetakpenumpang();
        
        // penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        //memanggil method cetak
        Bus.cetakpenumpang();
    }
}