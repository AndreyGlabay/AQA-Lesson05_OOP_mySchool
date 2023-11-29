public class Main {
    public static void main(String[] args) {
        PM id1100_001 = new PM(1, "Anna", true, 10);
        PM id1100_002 = new PM(2, "Brook", false, 0);
        PM id1100_003 = new PM(3, "Claus", false, 0);
        Dev id1200_225 = new Dev(225, "Alice", true, 10);
        Dev id1200_226 = new Dev(226, "Bob", true, 10);
        Dev id1200_227 = new Dev(227, "Charles", false, 0);
        UIUX id1300_338 = new UIUX(338, "Io", false, 0);
        UIUX id1300_339 = new UIUX(339, "John", false, 0);
        QA id1400_511 = new QA(511, "Kennet", false, 0);
        QA id1400_512 = new QA(512, "Lianne", false, 0);
        QA id1400_571 = new AQA_Java(571, "Michael", false, 0);

        System.out.println("Student id1400_511 like to know which courses are available in their QA-Field?");
        id1400_511.message();
        System.out.println("Student id1100_002 like to know which courses are available in their QA-Field?");
        id1100_002.message();
        System.out.println("Student id1300_338 like to know which courses are available in their QA-Field?");
        id1300_338.message();

        System.out.println("Info about person id1400_512");
        System.out.println(id1400_512 instanceof Students);
        System.out.println(id1400_512 instanceof QA);

        System.out.println("Info about person id1400_571");
        System.out.println(id1400_571 instanceof Students);
        System.out.println(id1400_571 instanceof QA);
        System.out.println(id1400_571 instanceof AQA_Java);

    }
}
