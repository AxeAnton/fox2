package fox;

import fox.menuCommand.CommandExit;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

public class Execute implements Serializable {
    String unNameKey;

    public Execute() {
    }

    public Execute(String x) {
        this.unNameKey = x;
    }

    public String getUnNameKey() {
        return unNameKey;
    }

    public void setUnNameKey(String unNameKey) {
        this.unNameKey = unNameKey;
    }

    Node strartFox = new Node("Старт", "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду, подумал Лисёнок. Как поступить Лисенку?", "Выбери - 1 что бы вернуться домой", "Выбери - 2 что бы отправится поиски");
    Node goToHome = new Node("Выбери - 1 что бы вернуться домой", "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга!\nИгра завершилась успехом", null, null);
    Node goToFind = new Node("Выбери - 2 что бы отправится поиски", "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.", "Выбери - 1 что бы попытаться разузнать о Бельчонке у лесных жителей", "Выбери - 2 что бы искать Бельчонка в одиночку");
    Node askForestAnimals = new Node("Выбери - 1 что бы попытаться разузнать о Бельчонке у лесных жителей", "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?", "Выбери - 1 что бы расспросить Сову", "Выбери - 2 что бы расспросить Волка");
    Node lookingSquirrelAlone = new Node("Выбери - 2 что бы искать Бельчонка в одиночку", "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать.\nИгра завершилась неудачей", null, null);
    Node askOwl = new Node("Выбери - 1 что бы расспросить Сову", "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.", "Выбери - 1 что бы поверить Сове и отправиться вглубь леса", "Выбери - 2 что бы искать Бельчонка в одиночку");
    Node askWolf = new Node("Выбери - 2 что бы расспросить Волка", "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?", "Выбери - 1 что бы вернуться домой", "Выбери - 2 что бы искать Бельчонка в одиночку");
    Node believeOwlGoToForest = new Node("Выбери - 1 что бы поверить Сове и отправиться вглубь леса", "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда, что делать?", "Выбери - 1 ели считаешь, что Нужно воспользоваться шансом и раздобыть мёд", "Выбери - 2 что бы искать Бельчонка в одиночку");
    Node findHoney = new Node("Выбери - 1 ели считаешь, что Нужно воспользоваться шансом и раздобыть мёд", "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.", "Выбери - 1 если считаешь, что нужно Подождать, вдруг пчёлы улетят", "Выбери - 2 ели считаешь, что Нужно попытаться выкрасть мёд немедленно");
    Node waitWhenBeesFlyAway = new Node("Выбери - 1 если считаешь, что нужно Подождать, вдруг пчёлы улетят", "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?", "Выбери - 1 если считаешь, что необходимо немного поесть и передохнуть", "Выбери - 2 ели считаешь, что отнести мёд Медвежонку");
    Node stealHoneyNow = new Node("Выбери - 2 ели считаешь, что Нужно попытаться выкрасть мёд немедленно", "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь.\nИгра завершилась неудачей", null, null);
    Node eatAndRest = new Node("Выбери - 1 если считаешь, что необходимо немного поесть и передохнуть", "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски.\nИгра завершилась неудачей", null, null);
    Node giveHoneyToBear = new Node("Выбери - 2 ели считаешь, что отнести мёд Медвежонку", "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал. Лисёнка вернуться домой, как поступить?", "Выбери - 1 что бы вернуться домой", "Выбери - 2 что бы искать Бельчонка в одиночку");

    Node[] arrayNods = {strartFox, goToHome, goToFind, askForestAnimals, lookingSquirrelAlone, askOwl, askWolf, believeOwlGoToForest, findHoney, waitWhenBeesFlyAway, stealHoneyNow, eatAndRest, giveHoneyToBear};

    HashMap<String, Node> hashMapNods = new HashMap<>();


    public String start() {


        for (int i = 0; i < arrayNods.length; i++) {
            hashMapNods.put(arrayNods[i].getUnName(), arrayNods[i]);
        }

        while (true) {

            System.out.println(unNameKey); // тест

            if (hashMapNods.get(unNameKey).getOption1() == null) {
                System.out.println(hashMapNods.get(unNameKey).getText());
                new CommandExit().ExecuteMenu();
            }

            Scanner in = new Scanner(System.in);

            System.out.println(hashMapNods.get(unNameKey).getText());
            System.out.println(hashMapNods.get(unNameKey).getOption1());
            System.out.println(hashMapNods.get(unNameKey).getOption2());
            System.out.println("Выбери - 3 для выхода");

            int numMenu2 = in.nextInt();
            if (numMenu2 == 1) {
                unNameKey = hashMapNods.get(unNameKey).getOption1();
                //System.out.println(unNameKey);
                //return unNameKey;
            } else if (numMenu2 == 2) {
                unNameKey = hashMapNods.get(unNameKey).getOption2();
                //System.out.println(unNameKey);
                //return unNameKey;
            } else if (numMenu2 == 3) {
                new Menus().runMenu2();
            } else {
                System.out.println("Введен не верный вариант, повторите еще");
            }
            // return this.unNameKey;

        }

    }

}
