package ex_6;



public class example_6  {
    public static void main(String[] args) {

        Node_methods list = new Node_methods();

        System.out.println("Ввод с головы:");
        list.createHead(new int[]{3, 2, 1});
        list.outList();

        System.out.println("Ввод с хвоста");
        list.createTail(new int[]{4, 5, 6});
        list.outList();

        System.out.println("добавление элемента в начало и конец списка:");
        list.createHead(new int[]{3, 2, 1});
        list.outList();
        list.addFirst(new Node(-1, null));
        list.addLast(new Node(11, null));
        list.outList();

        System.out.println("добавление нового элемента '-1' по индексу 1:");
        list.createTail(new int[]{1,2,3});
        list.outList();
        list.insert(new Node(-1, null));
        list.outList();

        System.out.println("удаление первого и последнего элементов:");
        list.createTail(new int[]{1,2,3,4,5});
        list.outList();
        list.removeFirst();
        list.removeLast();
        list.outList();

        System.out.println("удаление элемента по номеру:");
        list.createTail(new int[]{1,2,3,4,5});
        list.outList();
        list.remove();
        list.outList();

        System.out.println("Ввод с головы,(рекурсия):");
        list.createHeadRec(new int[]{5,4,3,2,1});
        list.outList();

        System.out.println("Ввод с хвоста,(рекурсия):");
        list.createTailRec(new int[]{5,4,3,2,1});
        list.outList();

        System.out.println("Вывод (рекурсия), исходный список:");
        list.createTailRec(new int[]{5,4,3,2,1});
        list.outList();
        System.out.println("(рекурсия) вывод:\n" + list.toStringRec());
    }
}



