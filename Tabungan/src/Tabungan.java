
public class Tabungan {
    public int saldo;
    public boolean status;
    
    public Tabungan(int iniSaldo){
        saldo = iniSaldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
    if(jumlah <= saldo){
        saldo -= jumlah;
        return true;
    } else {
        return false;
    }
}
}
