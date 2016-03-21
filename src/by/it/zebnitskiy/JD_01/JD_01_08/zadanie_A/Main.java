package by.it.zebnitskiy.JD_01.JD_01_08.zadanie_A;

/**
 * Created by Зебницкий Максим on 3/3/2016.
 */
public class Main {

    public static void main(String[] args){
        //создаем видеоплеер, два раза нажмем на паузу, остановим
        VideoPlayer videoPlayer = new VideoPlayer();
        System.out.println(videoPlayer.showState());
        videoPlayer.play();  		//нажали воспроизведение
        System.out.println(videoPlayer.showState());
        videoPlayer.pause(); 		//Поставили на паузу
        System.out.println(videoPlayer.showState());
        videoPlayer.pause(); 			//Сняли с паузы
        System.out.println(videoPlayer.showState());
        videoPlayer.stop(); 					//остановили воспроизвеление
        System.out.println(videoPlayer.showState());

    }

}
