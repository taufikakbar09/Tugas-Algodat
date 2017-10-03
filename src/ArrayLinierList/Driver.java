package ArrayLinierList;

public class Driver {

    public static void main(String[] args) throws CloneNotSupportedException {
        

        ArrayLinierList a= new ArrayLinierList(9);{
        
            a.add(0, "A");
            a.add(1, "B");
            a.add(2, "C");
            a.add(3, "D");
            a.add(4, "E");
            a.add(5, "F");
            a.add(6, "G");
            a.add(7, "H");
            a.add(8, "I");
            a.add(9, "J");
            
            Object [] y = new Object[20];
            
            System.out.println("Panjang Array Awal untuk soal no 5\t :"+a.element.length);
            
            System.out.println("\t\t*Soal nomor 3*");
            System.out.println();
            
            Object [][] Keluarga ={    
            {"1","Budi","Wirausaha"}, 
            {"2","Indra","Travel"}, 
            {"3","Luna","Dokter"},   
                   
            };
        
        System.out.println("Panjang awal array = ["+Keluarga.length+"]"+"["+Keluarga[0].length+"]");// ukuran array sebelum dirubah
        
        Object[][] Change = Array2D.changeLength2D(Keluarga, 3, 4);// untuk mengubah array sebelumnya
        
        System.out.println("Panjang array setelah di rubah =  ["+Change.length+"]"+"["+Change[0].length+"]");
               
        for(Object[] ganti2 : Change){
            for(int i = 0; i<Change[0].length; i++){
                System.out.println(ganti2[i]);
                
            }
        }
        
        System.out.println("\t\t*Soal nomor 5*");
        System.out.println();
        
         //memotong panjang array sesuai dengan array yang terisi
        a.add(10, "K");
        a.add(11, "L");
        a.trimToSize();
        System.out.println("Panjang Array Setelah di Potong \t :"+a.element.length);
        
        System.out.println("\t\t*Soal nomor 6*");
        System.out.println();
        
        //untuk menentukan panjang Array yang dipilih
        a.setSize(6);
        System.out.println("Setelah Dilakukan SetSize adalah\t :"+a.toString());
        System.out.println();
        
        System.out.println("\t\tSoal Nomor 9");
        a.removeRange(1, 2);
        System.out.println("Panjang array : " +a.element.length);
        System.out.println("Setelah diremove range : " +a.toString());
        System.out.println();
        
        System.out.println("\t\tSoal nomor 12");
        System.out.println("Panajang array : " +a.size);
        System.out.println("Panjang elemen : " +a.element.length);
        System.out.println("Data dipanggil di variabel x : " +a.toString());
        System.out.println("Data dipanggil di variabel y : " +a.clone(y));
        
        System.out.println();
        System.out.println("\t\t*Soal nomor 8*");
        //Untuk Menghapus semua Isi Array yang ada 
        System.out.println();
        a.clear();
        System.out.println("Isi array setelah clear \t:"+a.toString());
        
        }
    }
}
