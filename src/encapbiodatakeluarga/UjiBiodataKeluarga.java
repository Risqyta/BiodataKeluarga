
package encapbiodatakeluarga;

/**
 *
 * @author ASUS
 */
public class UjiBiodataKeluarga {
    public static void main (String []args){
        EncapBiodataKeluarga biodata = new EncapBiodataKeluarga();
        biodata.setNmAyah("Soetrisno BM");
        biodata.setNmIbu("Prihatintyas Condrorini");
        biodata.setNmSaudara("Akbar Rizky Luhur Pambudi");
        biodata.setNama("Dhiva Risqyta Kusumawardani");
        biodata.setAlamat("Jl. Maspati V no.29 ,Bubutan,Surabaya");
        biodata.setTempatLahir("Surabaya");
        biodata.setTglLahir("18 Desember 2002");
        biodata.setHobi("Membaca Novel");
        biodata.setCita("Programmer");
        biodata.setNoTelp("082257107376");
        
        System.out.println("Nama Ayah       : "+biodata.getNmAyah());
        System.out.println("Nama Ibu        : "+biodata.getNmIbu());
        System.out.println("Nama Saudara    : "+biodata.getNmSaudara());
        System.out.println("Nama            : "+biodata.getNama());
        System.out.println("Alamat          : "+biodata.getAlamat());
        System.out.println("Tempat Lahir    : "+biodata.getTempatLahir());
        System.out.println("Tanggal Lahir   : "+biodata.getTglLahir());
        System.out.println("Hobi            : "+biodata.getHobi());
        System.out.println("Cita-Cita       : "+biodata.getCita());
        System.out.println("No. Telepon     : "+biodata.getNoTelp());
        
        
    }
    
}
