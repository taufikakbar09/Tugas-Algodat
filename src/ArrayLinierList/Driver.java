package ArrayLinierList;

public class Driver {
    public static void main(String[] args) {
        ArrayLinierList a = new ArrayLinierList();
        a.add(0, new Integer(4));
        a.add(0, new Integer(3));
        a.add(0, new Integer(2));
        a.add(0, new Integer(1));
        a.add(0, new Integer(0));
        
        System.out.println("Banyak data = " +a.size);
        System.out.println("Banyak kapasitas = " +a.capacity);
        System.out.println();
        
        System.out.println("Data yang masuk :");
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.element[i]);
        }
        
        System.out.println();
        System.out.println("Panjang Array : "+ a.size());
        System.out.println("Sebelum di Trim "+a.capacity);
        a.trimToSize();
        System.out.println("Setelah di Trim "+a.capacity);
        System.out.println();
        a.setSize(8);
        System.out.println("Ukuran element di set menjadi : "+a.element2.length);
        
        System.out.println();
        a.remove(1);
        System.out.println("Isi array setelah index 1 dihapus : ");
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.element[i]);
        }
        System.out.println("Panjang array sebelum di Trim : "+ a.capacity);
        System.out.println("PAnjang array setelah di Trim : "+ a.size);
        System.out.println("Panjang kapasitas array : "+a.element.length);
        
    }
}
