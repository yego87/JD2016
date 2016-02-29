package by.it.lukin.jd08;

public class Runnable {

    public static void main(String[] args) {
	// write your code here
        Model model1 = new Model(true,true,true,true,false,true,true);
        Model model2 = new Model(true,true,true,false,false,true,false);

        System.out.println("Модель X75: \n"+
                "возможность совершать звонки: " + model1.isCallable()+"\n"+
                "возможность отправлять сообщения: " + model1.isSendableSMS() + "\n"+
                "возможность снимать на камеру: " + model1.isTakablePhoto() + "\n" +
                "наличие сенсорного экрана: " + model1.isTouchableScreen() + "\n" +
                "возможность отправки MMS: " + model1.isSendableMMS() + "\n" +
                "наличие доступа в интернет: " + model1.isConnectingToTheInternet() + "\n" +
                "возможность переворачивать экран по горизонтали: " + model1.isDoBarrelRoll() + "\n");

        System.out.println("Модель X35: \n"+
                "возможность совершать звонки: " + model2.isCallable()+"\n"+
                "возможность отправлять сообщения: " + model2.isSendableSMS() + "\n"+
                "возможность снимать на камеру: " + model2.isTakablePhoto() + "\n" +
                "наличие сенсорного экрана: " + model2.isTouchableScreen() + "\n" +
                "возможность отправки MMS: " + model2.isSendableMMS() + "\n" +
                "наличие доступа в интернет: " + model2.isConnectingToTheInternet() + "\n" +
                "возможность переворачивать экран по горизонтали: " + model2.isDoBarrelRoll());
    }
}
