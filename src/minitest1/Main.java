package minitest1;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook programmingBook0 = new ProgrammingBook(1, "hhh", 12.3, "NBD", "java", "sjk");
        ProgrammingBook programmingBook1 = new ProgrammingBook(2, "kkk", 12.3, "HMD", "java", "sjk");
        ProgrammingBook programmingBook2 = new ProgrammingBook(3, "eee", 12.3, "NHH", "sct", "sjk");
        ProgrammingBook programmingBook3 = new ProgrammingBook(4, "ilu", 12.3, "NQH", "java", "sjk");
        ProgrammingBook programmingBook4 = new ProgrammingBook(5, "ggg", 12.3, "PMQ", "java", "sjk");
        ProgrammingBook[] array = new ProgrammingBook[5];
        array[0] = programmingBook0;
        array[1] = programmingBook1;
        array[2] = programmingBook2;
        array[3] = programmingBook3;
        array[4] = programmingBook4;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getPrice();
        }
        FictionBook fictionBook0 = new FictionBook(1, "ei", 123, "NBD", "vien tuong 1");
        FictionBook fictionBook1 = new FictionBook(2, "ei", 123, "NBD", "vien tuong 3");
        FictionBook fictionBook2 = new FictionBook(3, "ei", 123, "NBD", "vien tuong 1");
        FictionBook fictionBook3 = new FictionBook(4, "ei", 123, "NBD", "vien tuong 5");
        FictionBook fictionBook4 = new FictionBook(5, "ei", 123, "NBD", "vien tuong 1");
        FictionBook[] array1 = new FictionBook[5];
        array1[0] = fictionBook0;
        array1[1] = fictionBook1;
        array1[2] = fictionBook2;
        array1[3] = fictionBook3;
        array1[4] = fictionBook4;
        int summ = 0;
        for (int i = 0; i < array1.length; i++) {
            summ += array1[i].getPrice();
        }
        System.out.println("tong gia 10 quan sach " + (sum + summ));
        System.out.println("so sach co cung language java "+ demJava(array));
        System.out.println("so sach cung category " + demCategory(array1));
    }

    public static int demJava(ProgrammingBook[] programmingBooks) {
        int Account = 0;
        for (int i = 0; i < programmingBooks.length; i++) {
            if (programmingBooks[i].getLanguage().equals("java")) {
                Account++;
            }

        }
    return Account;

    }
    public  static  int demCategory(FictionBook[] fictionBook){
        int Accountt = 0;
        for (int i = 0; i < fictionBook.length ; i++) {
            if(fictionBook[i].getCategory().equals("vien tuong 1")){
                Accountt++;
            }
        }
        return Accountt;
    }
}

