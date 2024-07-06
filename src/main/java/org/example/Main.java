package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    //課題
    //今日実践したものを一通り実装してみてください。
    //Greeting　と　Speakingは使わずにinterfaceと実装を組み合わせて作ってみてください。
    //interfaceの実装を２つ以上作ってください。
    //継承を使ってみてください。extends 上記で作った２つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してみてください。
    //メソッド呼び出しは親子のどちらとも呼び出してみてください。

    List<Student> studentList1 = List.of(
        new Student("せいや", 50),
        new Student("粗品", 60),
        new Student("あせい", 70),
        new Student("そら", 80),
        new Student("盛山", 90),
        new Student("ヒコロヒー", 100));

    List<Student> studentList2 = List.of(
        new Student("若林", 90),
        new Student("春日", 30),
        new Student("さとみつ", 80),
        new Student("設楽", 100),
        new Student("日村", 50));

    System.out.println("【「継承なし」のメソッド呼び出し結果】");
    Play play = new Play();
    IceBreak iceBreak = new IceBreak();
    Printer printer = new Printer();
    for (Student student : studentList1) {
      if (student.getScore() >= 100) {
        printer.printMessage(play.game(student.getName()));
      } else if (student.getScore() >= 80) {
        printer.printMessage(iceBreak.sleep(student.getName()));
      } else {
        printer.printMessage(student.getName() + "は勉強します");
      }
    }

    System.out.println("【「継承あり」のメソッド呼び出し結果】");
    Play2 play2 = new Play2();
    IceBreak2 iceBreak2 = new IceBreak2();
    for (Student student : studentList2) {
      if (student.getScore() >= 100) {
        printer.printMessage(play2.actibity(student.getName()));
      } else if (student.getScore() >= 80) {
        printer.printMessage(iceBreak2.actibity(student.getName()));
      } else if (student.getScore() >= 50) {
        printer.printMessage(play2.game(student.getName()));
      } else {
        printer.printMessage(iceBreak2.sleep(student.getName()));
      }
    }

  }
}