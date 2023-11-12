package hust.soict.dsai.lab02;

// Do Thuy Duong 20215019
public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD,cinderellaDVD);
        System.out.println("Swap method");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());
        
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("\nChangeTitle method");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Do Thuy Duong 20215019");
    }


//    public static void swap(Object ob1 , Object ob2){
//        Object tmp = ob1 ;
//        ob1 = ob2 ;
//        ob2 = tmp ;
//    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle() ;
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
        
    }

    public static void swap(DigitalVideoDisc ob1 , DigitalVideoDisc ob2){
    	DigitalVideoDisc tmp = new DigitalVideoDisc(
            ob1.getTitle(), ob1.getCategory(), ob1.getDirector(), ob1.getLenght(), ob1.getCost()
             );
        ob1.setTitle(ob2.getTitle());
        ob1.setCategory(ob2.getCategory());
        ob1.setDirector(ob2.getDirector());
        ob1.setLenght(ob2.getLenght());
        ob1.setCost(ob2.getCost());

        ob2.setTitle(tmp.getTitle());
        ob2.setCategory(tmp.getCategory());
        ob2.setDirector(tmp.getDirector());
        ob2.setLenght(tmp.getLenght());
        ob2.setCost(tmp.getCost());

}
}
