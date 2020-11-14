package Emas;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Biaya Emas Kawin
**/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class Emas {
    private double hargaSatuGram;
    private double beratEmas;
    
    public Emas (double hargaSatuGram, double beratEmas){
        this.hargaSatuGram = hargaSatuGram;
        this.beratEmas = beratEmas;
    }
    
    private double totalHarga(){
        return hargaSatuGram * beratEmas;
    }
    
    public void tampil(){
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
        
        System.out.printf("===Program Pembelian bulan Oktober 2020===\n");
        System.out.printf("Mas yan dibeli Hendi : %.1f gram\n", beratEmas);
        System.out.printf("Harga 1 gram : Rp. %s\n", kursID.format(hargaSatuGram));
        System.out.printf("Total Harga  : Rp. %s\n", kursID.format(totalHarga()));
    }
}
