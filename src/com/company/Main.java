package com.company;


public class Main {

    public static void main(String[] args) {
//	 write your code here
//        List<String> list = new ArrayList();
//        list.add("Sam");
//        list.add("Manny");
//        list.add("Mansur");
//        list.add("Jurabek");
//        System.out.println("This is my list"+list);
//
//        Set<String>myset = new HashSet<>();
//        myset.add("Sam");
//        myset.add("Manny");
//        myset.add("Mansur");
//        myset.add("Jurabek");
//        System.out.println("this is my set"+myset);
//        Set da chaqirganda valuelar aralshib keladi.List da chaqirganda ketma ket tartib bn keladi.


//        RemoveCollection.myMethod();
////        Collection2.myMethod();
////          Collection2.myMethod();
//        Collection2.myMethod();
//        Collection2.myMethod();
//        Collection2 call = new Collection2();
//        Collection2.myMethod();
        CatAbstract1 myObject = new CatAbstract1();
        myObject.animalSound();
        myObject.sleep();

        DogAbstract1 uObject = new DogAbstract1();
        uObject.animalSound();
        uObject.sleep();

        HorseAbstract1 onePoint = new HorseAbstract1();
        onePoint.animalSound();


        Eagle myEagle = new Eagle();
        myEagle.birdsSound();
        myEagle.sleep();

        sparrow mySparrow = new sparrow();
        mySparrow.birds1Sound();
        mySparrow.sleep();

        Month month = Month.FEBRUARY;
        System.out.println(month);
        Weeks day = Weeks.SATURDAY;
        System.out.println(day);

        Subject myObj = new Subject();
        myObj.myText1();
        myObj.MyText();

        String world = "This is String text 123 and something else";
        String another = world.replaceAll("\\D","_");
        System.out.println(world);
        System.out.println(another);

        
    }
}
