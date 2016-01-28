package Hitchens.Chuck.InitLab1;


public class InitializationLab1 {

    public static void main(String[] args) {

        BoringThing boringOne = new BoringThing();
        BoringThing boringTwo = new BoringThing();
        BoringThing boringThree = new BoringThing();
        BoringThing boringFour = new BoringThing();
        BoringThing boringFive = new BoringThing();

        ColorfulThing colorOne = new ColorfulThing("blue");
        ColorfulThing colorTwo = new ColorfulThing("red");
        ColorfulThing colorThree = new ColorfulThing("gray");
        ColorfulThing colorFour = new ColorfulThing("pink");
        ColorfulThing colorFive = new ColorfulThing("purple");

        System.out.println(colorOne.getColor());
        System.out.println(colorTwo.getColor());
        System.out.println(colorThree.getColor());
        System.out.println(colorFour.getColor());
        System.out.println(colorFive.getColor());


    }



}




