package GenericArrayList;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] intArr = {102, 108, 333};
        Double[] doubArr = {22.22, 33.4, 56.2};
        Character[] chArr = {'X', 'T', 'A'};

        System.out.println("Course codes:");




        GenericArrayList genericArrayList = new GenericArrayList(chArr);

        for (Object object : genericArrayList.getGenericArray()) {
            System.out.println(object);
        }

        System.out.println(genericArrayList.toString());

        System.out.println(genericArrayList.getElementAtIndex(1));

        Object[] newChArr = genericArrayList.addElement('B');

        GenericArrayList genericArrayList1 = new GenericArrayList(newChArr);

        Object[] newChArr2 = genericArrayList1.addElement('8');

        System.out.println(Arrays.toString(newChArr2));

        GenericArrayList genericArrayList2 = new GenericArrayList(newChArr2);

        Object[] newChArr3 = genericArrayList2.addElement('T');

        System.out.println(Arrays.toString(newChArr3));

        GenericArrayList genericArrayList3 = new GenericArrayList(newChArr3);

        Object[] newChArr4 = genericArrayList3.addElement('S');

        GenericArrayList genericArrayList4 = new GenericArrayList(newChArr4);

        genericArrayList4.addToArray('F', newChArr4);
        genericArrayList.addToArray('U', newChArr4);
        genericArrayList.addToArray('P', newChArr4);
        genericArrayList.addToArray('O', newChArr4);
        genericArrayList.addToArray('5', newChArr4);

        Object[] newChArr5 = genericArrayList.expandArray(newChArr4);

        genericArrayList.addToArray('4', newChArr5);
        genericArrayList.addToArray('$', newChArr5);
        genericArrayList.addToArray('I', newChArr5);
        genericArrayList.addToArray('C', newChArr5);

        ;

        System.out.println(genericArrayList.getValueFromIndex(2));

        for (Object element : genericArrayList.getGenericArray()) {
            System.out.println(element);
        }
        System.out.println(genericArrayList.isPresent('A'));

        char a = 'A';
        char b = (char) genericArrayList.getValueFromIndex(2);

        System.out.println(String.valueOf(Arrays.toString(genericArrayList.getGenericArray())));
        System.out.println(genericArrayList.isPresent('B'));

        genericArrayList.setGenericArray(intArr);
        System.out.println(genericArrayList.isPresent(100));
    } //end of main method

}
