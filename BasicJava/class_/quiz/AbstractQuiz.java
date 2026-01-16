package class_.quiz;

import interface_.*;

public abstract class AbstractQuiz implements Animal {
    private String food;

    public AbstractQuiz(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}

class Main {
    public static void main(String[] args) {
        AbstractQuiz a;
        a = new Lion("고기");
        a.feeding();
        a.play();

        a = new Rabbit("당근");
        a.feeding();
        a.play();

        a = new Deer("건초");
        a.feeding();
        a.play();

        a = new Crocodile("닭고기");
        a.feeding();
        a.play();
    }
}

class Lion extends AbstractQuiz {

    private String name = "사자";

    public Lion(String food) {
        super(food);
    }

    @Override
    public void feeding() {
        System.out.printf("%s는 %s를 먹습니다\n", this.name, super.getFood());
    }

    @Override
    public void play() {
        System.out.println("사육장 밖에서 뛰어 놀게 합니다.\n");
    }
}

class Rabbit extends AbstractQuiz {
    private String name = "토끼";

    public Rabbit(String food) {
        super(food);
    }

    @Override
    public void feeding() {
        System.out.printf("%s는 %s를 먹습니다\n", this.name, super.getFood());
    }

    @Override
    public void play() {
        System.out.println("바위 타기를 시켜줍니다.\n");
    }
}

class Deer extends AbstractQuiz {
    private String name = "사슴";

    public Deer(String food) {
        super(food);
    }

    @Override
    public void feeding() {
        System.out.printf("%s은 %s를 먹습니다\n", this.name, super.getFood());
    }

    @Override
    public void play() {
        System.out.println("나무 사이 숨바꼭질을 합니다.\n");
    }
}

class Crocodile extends AbstractQuiz {
    private String name = "악어";

    public Crocodile(String food) {
        super(food);
    }

    @Override
    public void feeding() {
        System.out.printf("%s는 %s를 먹습니다\n", this.name, super.getFood());
    }

    @Override
    public void play() {
        System.out.println("물에서 물장구를 칩니다.\n");
    }
}