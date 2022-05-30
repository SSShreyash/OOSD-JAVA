interface AntiLockBrakes{
    void AntiLockBrakes();
}

interface CruiseControl{
    void CruiseControl();
}

interface PowerSteering{
    void PowerSteering();
}

abstract class Auto{

}

class Model1 extends Auto implements PowerSteering{

    Model1(){
        System.out.println("Model 1:- ");
    }
    public void PowerSteering(){
        System.out.println("PowerSteering is available for this model.");
    }
}

class Model2 extends Auto implements AntiLockBrakes,CruiseControl {

    Model2(){
        System.out.println("Model 2:- ");
    }
    public void AntiLockBrakes(){
        System.out.println("AntiLockBrakes are available for this model.");
    }
    public void CruiseControl(){
        System.out.println("CruiseControl is available for this model.");
    }
}

class Model3 extends Auto implements CruiseControl{

    Model3(){
        System.out.println("Model 3:- ");
    }
    public void CruiseControl(){
        System.out.println("CruiseControl is available for this model.");
    }
}

public class A3Q2 {
    public static void main(String[] args){
        Model1 model1 = new Model1();
        model1.PowerSteering();
        Model2 model2 = new Model2();
        model2.AntiLockBrakes();
        model2.CruiseControl();
        Model3 model3 = new Model3();
        model3.CruiseControl();
    }
}
