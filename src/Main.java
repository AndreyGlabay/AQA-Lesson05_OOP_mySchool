public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("D I S C O U N T   P R O G R A M :");
        System.out.println("Students, who has been finished one of our courses before - gets 10% discount!");
        System.out.println();

        PM id1100_001 = new PM(1, "Anna", "+18007584412", "anna@example.com", true, 10);
        PM id1100_002 = new PM(2, "Brook", "+18008542502", "brook@sample.net", false, 0);
        PM id1100_003 = new PM(3, "Claus", "+18602584697", "claus@example.com", false, 0);
        Dev id1200_225 = new Dev(225, "Alice", "+16501203345", "alice@example.com",true, 10);
        Dev id1200_226 = new Dev(226, "Bob", "+1870854112283", "bob@sample.net", true, 10);
        Dev id1200_227 = new Dev(227, "Charles", "+16801254679", "charles@mynet.com",false, 0);
        UIUX id1300_338 = new UIUX(338, "Io", "+18003056478", "io@mynet.com", false, 0);
        UIUX id1300_339 = new UIUX(339, "John", "+18205463321", "john@sample.net", false, 0);
        QA id1400_511 = new QA(511, "Kennet", "+18604005067", "kennet@mynet.com", false, 0, "QA");
        QA id1400_512 = new QA(512, "Lianne", "+16801203334", "lianne@example.com",false, 0, "QA");
        QA id1400_571 = new AQA_Java(571, "Michael", "+13800021549", "michael@wexample.com", false, 0, "QA");

        System.out.println();
        System.out.println("Student id1400_511 (" + id1400_511.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1400_511.message();
        System.out.println();
        System.out.println("Student id1100_002 (" + id1100_002.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1100_002.message();
        System.out.println();
        System.out.println("Student id1300_338 (" + id1300_338.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1300_338.message();
        System.out.println();
        System.out.println("Student id1200_225 (" + id1200_225.getStudentName() + ") like to know which courses are available in their IT-Field?");
        id1200_225.message();
        System.out.println();

//        System.out.println("Info about person id1400_512");
//        System.out.println(id1400_512 instanceof Students);
//        System.out.println(id1400_512 instanceof QA);
//
//        System.out.println("Info about person id1400_571");
//        System.out.println(id1400_571 instanceof Students);
//        System.out.println(id1400_571 instanceof QA);
//        System.out.println(id1400_571 instanceof AQA_Java);

    }
}
